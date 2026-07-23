package com.axsosacademy.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.models.Blog;
import com.axsosacademy.models.User;

@Repository
public interface BlogRepository  extends CrudRepository<Blog, Long> {
	List<Blog> findAll();

    // "All Blogs" table on the dashboard: every blog written by someone else.
    List<Blog> findByUserNot(User user);

    // "My Blogs" table on the dashboard: blogs the logged-in user created.
    List<Blog> findByUser(User user);
}
