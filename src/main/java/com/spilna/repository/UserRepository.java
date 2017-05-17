package com.spilna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spilna.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
