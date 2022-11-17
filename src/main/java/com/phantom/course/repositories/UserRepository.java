package com.phantom.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phantom.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
