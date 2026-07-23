package com.axsosacademy.services;

import java.util.List;
import java.util.Optional;

import com.axsosacademy.models.Blog;
import com.axsosacademy.models.User;
import com.axsosacademy.repositories.BlogRepository;

public class BlogService {

    private final BlogRepository blogRepo;

    public BlogService(BlogRepository blogRepo) {
        this.blogRepo = blogRepo;
    }

    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    // "All Blogs" table: blogs created by other users.
    public List<Blog> getOtherUsersBlogs(User currentUser) {
        return blogRepo.findByUserNot(currentUser);
    }

    // "My Blogs" table: blogs created by the logged-in user.
    public List<Blog> getMyBlogs(User currentUser) {
        return blogRepo.findByUser(currentUser);
    }

    public Blog getBlogById(Long id) {
        Optional<Blog> optionalBlog = blogRepo.findById(id);
        return optionalBlog.orElse(null);
    }

    public Blog createBlog(Blog blog) {
        return blogRepo.save(blog);
    }

    public Blog updateBlog(Long id, String title, String category, String content, String tags) {
        Blog blog = getBlogById(id);
        blog.setTitle(title);
        blog.setCategory(category);
        blog.setContent(content);
        blog.setTags(tags);
        return blogRepo.save(blog);
    }

    public void deleteBlog(Long id) {
        blogRepo.deleteById(id);
    }
}
