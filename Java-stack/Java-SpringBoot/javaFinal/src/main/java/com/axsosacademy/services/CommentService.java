package com.axsosacademy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsosacademy.models.Blog;
import com.axsosacademy.models.Comment;
import com.axsosacademy.repositories.CommentRepository;

@Service
public class CommentService {
private final CommentRepository commentRepo;

public CommentService(CommentRepository commentRepo) {
	this.commentRepo = commentRepo;
}

public List<Comment> getCommentsForBlog(Blog blog){
	return commentRepo.findByBlog(blog);
}
public Comment addComment(Comment comment) {
	return commentRepo.save(comment);
}
}
