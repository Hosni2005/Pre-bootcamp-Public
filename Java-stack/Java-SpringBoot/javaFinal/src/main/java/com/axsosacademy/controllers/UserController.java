package com.axsosacademy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsosacademy.models.LoginUser;
import com.axsosacademy.models.User;
import com.axsosacademy.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userServ;


    // Show login/register page
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());

        return "index";
    }


    // Register
    @PostMapping("/register")
    public String register(
            @Valid @ModelAttribute("newUser") User newUser,
            BindingResult result,
            Model model,
            HttpSession session) {


        userServ.register(newUser, result);


        if (result.hasErrors()) {

            // IMPORTANT:
            // Do NOT replace newUser here
            // Keep the object with validation errors

            model.addAttribute("newLogin", new LoginUser());

            return "index";
        }


        session.setAttribute("id", newUser.getId());

        return "redirect:/dashboard";
    }



    // Login
    @PostMapping("/login")
    public String login(
            @Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult result,
            Model model,
            HttpSession session) {


        User user = userServ.login(newLogin, result);


        if (result.hasErrors()) {


            // Keep login errors
            // Add empty registration object only

            model.addAttribute("newUser", new User());

            return "index";
        }


        session.setAttribute("id", user.getId());

        return "redirect:/dashboard";
    }



    // Logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/";
    }
}