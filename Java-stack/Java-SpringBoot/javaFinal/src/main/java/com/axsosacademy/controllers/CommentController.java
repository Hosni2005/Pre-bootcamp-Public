package com.axsosacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsosacademy.models.Blog;
import com.axsosacademy.models.Comment;
import com.axsosacademy.models.User;
import com.axsosacademy.services.BlogService;
import com.axsosacademy.services.CommentService;
import com.axsosacademy.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CommentController {
	private final UserService userService;
	private final BlogService blogService;
	private final CommentService commentService;
	public CommentController(UserService userService, BlogService blogService, CommentService commentService) {
		super();
		this.userService = userService;
		this.blogService = blogService;
		this.commentService = commentService;
	}
	
	@GetMapping("/details/{id}/comments")
	public String showComments(@PathVariable("id") Long id , HttpSession session , Model model) {
		if (session.getAttribute("id") == null ) {
			return "redirect:/";
		}
		Long sessionId = (Long) session.getAttribute("id");
		Blog blog = blogService.getBlogById(id);
		model.addAttribute("user", userService.findUserById(sessionId) );
		model.addAttribute("blog", blog);
		model.addAttribute("comment", new Comment());
		model.addAttribute("comments", commentService.getCommentsForBlog(blog));
		return "comments";
	}
	
	@PostMapping("/details/{id}/comments")
	public String addComment(@PathVariable("id") Long id , HttpSession session , 
			@Valid @ModelAttribute("comment") Comment comment , BindingResult result , Model model) {
		if (session.getAttribute("id") == null ) {
			return "redirect:/";
		}
		Long sessionId = (Long) session.getAttribute("id");
		Blog blog = blogService.getBlogById(id);
		User currentUser = userService.findUserById(sessionId);
		if (result.hasErrors()) {
		model.addAttribute("user", currentUser);
		model.addAttribute("blog", blog );
		model.addAttribute("comments", commentService.getCommentsForBlog(blog));
		return "comments";
	}
	comment.setBlog(blog);
	comment.setUser(currentUser);
	commentService.addComment(comment);
	return "redirect:/details/";
	}
}


