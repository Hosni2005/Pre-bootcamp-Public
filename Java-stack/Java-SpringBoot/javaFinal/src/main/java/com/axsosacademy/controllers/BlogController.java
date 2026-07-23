package com.axsosacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsosacademy.models.Blog;
import com.axsosacademy.models.User;
import com.axsosacademy.services.BlogService;
import com.axsosacademy.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BlogController {

    private final BlogService blogService;
    private final UserService userService;

    public BlogController(BlogService blogService, UserService userService) {
        this.blogService = blogService;
        this.userService = userService;
    }

    // GET /dashboard : "Welcome, {name}!" + All Blogs table + My Blogs table
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        model.addAttribute("user", currentUser);
        model.addAttribute("allBlogs", blogService.getOtherUsersBlogs(currentUser));
        model.addAttribute("myBlogs", blogService.getMyBlogs(currentUser));
        return "dashboard";
    }

    // GET /create : show the "Create a Blog" form
    @GetMapping("/create")
    public String createBlogPage(HttpSession session, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        model.addAttribute("user", userService.findUserById(id));
        model.addAttribute("blog", new Blog());
        return "createblog";
    }

    // POST /create : handle the "Create a Blog" form submission
    @PostMapping("/create")
    public String createBlog(HttpSession session, @Valid @ModelAttribute("blog") Blog blog,
            BindingResult result, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        if (result.hasErrors()) {
            model.addAttribute("user", currentUser);
            model.addAttribute("blog", blog);
            return "createblog";
        }
        blog.setUser(currentUser);
        blogService.createBlog(blog);
        return "redirect:/dashboard";
    }

    // GET /edit/{id} : show the "Edit Blog" form, pre-filled
    @GetMapping("/edit/{id}")
    public String editBlogPage(@PathVariable("id") Long id, HttpSession session, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Blog blog = blogService.getBlogById(id);
        Long sessionId = (Long) session.getAttribute("id");
        // Only the blog's creator may edit it.
        if (blog == null || !blog.getUser().getId().equals(sessionId)) {
            return "redirect:/dashboard";
        }
        model.addAttribute("user", userService.findUserById(sessionId));
        model.addAttribute("blog", blog);
        return "editblog";
    }

    // POST /edit/{id} : handle the "Edit Blog" form submission
    @PostMapping("/edit/{id}")
    public String editBlog(@PathVariable("id") Long id, HttpSession session,
            @Valid @ModelAttribute("blog") Blog blog, BindingResult result, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long sessionId = (Long) session.getAttribute("id");
        Blog existing = blogService.getBlogById(id);
        if (existing == null || !existing.getUser().getId().equals(sessionId)) {
            return "redirect:/dashboard";
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userService.findUserById(sessionId));
            model.addAttribute("blog", blog);
            return "editblog";
        }
        blogService.updateBlog(id, blog.getTitle(), blog.getCategory(), blog.getContent(), blog.getTags());
        return "redirect:/dashboard";
    }

    // GET /delete/{id} : only the creator may delete their blog
    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Blog blog = blogService.getBlogById(id);
        Long sessionId = (Long) session.getAttribute("id");
        if (blog == null || !blog.getUser().getId().equals(sessionId)) {
            return "redirect:/dashboard";
        }
        blogService.deleteBlog(id);
        return "redirect:/dashboard";
    }

    // GET /details/{id} : blog details page
    @GetMapping("/details/{id}")
    public String showBlog(@PathVariable("id") Long id, HttpSession session, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long sessionId = (Long) session.getAttribute("id");
        model.addAttribute("user", userService.findUserById(sessionId));
        model.addAttribute("blog", blogService.getBlogById(id));
        return "blogdetails";
    }
}
