package com.axsosacademy.exam.repositores;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.exam.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, ID>{

}
