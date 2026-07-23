package com.axsosacademy.exam.repositores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.exam.models.Blog;
import com.axsosacademy.exam.models.User;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long>{
	List<Blog> findAll();


    List<Blog> findByUserNot(User user);
    List<Blog> findByUser(User user);
}
