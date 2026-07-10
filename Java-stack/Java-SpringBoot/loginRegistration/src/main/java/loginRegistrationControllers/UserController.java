package loginRegistrationControllers;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import loginRegistrationModels.User;
import loginRegistrationRepositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;

	// Show Login/Register page
	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("user", new User());
		model.addAttribute("loginUser", new LoginUser());

		return "index";
	}

	// Registration Process
	@PostMapping("/register")
	public String register(

			@Valid @ModelAttribute("user") User user,

			BindingResult result,

			HttpSession session,

			Model model

	) {

		// Check duplicate email

		if (userRepository.existsByEmail(user.getEmail())) {

			result.rejectValue("email", "error.email", "Email already exists");

		}

		// Password confirmation

		if (!user.getPassword().equals(user.getConfirmPassword())) {

			result.rejectValue("confirmPassword", "error.confirmPassword", "Passwords do not match");

		}

		// Birthday 10 years old check

		if (user.getBirthday() != null) {

			int age = Period.between(user.getBirthday(), LocalDate.now()).getYears();

			if (age < 10) {

				result.rejectValue("birthday", "error.birthday", "You must be at least 10 years old");

			}

		}

		if (result.hasErrors()) {

			model.addAttribute("loginUser", new LoginUser());

			return "index";

		}

		userRepository.save(user);

		// Auto login after registration

		session.setAttribute("userId", user.getId());

		return "redirect:/welcome";

	}

	// Login Process

	@PostMapping("/login")
	public String login(

			@Valid @ModelAttribute("loginUser") LoginUser loginUser,

			BindingResult result,

			HttpSession session,

			Model model

	) {

		if (result.hasErrors()) {

			model.addAttribute("user", new User());

			return "index";

		}

		User user = userRepository.findByEmail(loginUser.getEmail()).orElse(null);

		if (user == null) {

			result.rejectValue("email", "error.email", "Email not found");

		}

		else if (!user.getPassword().equals(loginUser.getPassword())) {

			result.rejectValue("password", "error.password", "Wrong password");

		}

		if (result.hasErrors()) {

			model.addAttribute("user", new User());

			return "index";

		}

		session.setAttribute("userId", user.getId());

		return "redirect:/welcome";

	}

	// Dashboard

	@GetMapping("/welcome")
	public String welcome(

			HttpSession session,

			Model model

	) {

		Long id = (Long) session.getAttribute("userId");

		User user = userRepository.findById(id).orElse(null);

		model.addAttribute("user", user);

		return "welcome";

	}

	// Logout

	@GetMapping("/logout")
	public String logout(

			HttpSession session

	) {

		session.invalidate();

		return "redirect:/";

	}
}
