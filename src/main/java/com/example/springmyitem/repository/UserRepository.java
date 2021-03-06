package com.example.springmyitem.repository;

import com.example.springmyitem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    List<User> findAllByName(String name);

}
