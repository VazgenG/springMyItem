package com.example.springmyitem.repository;

import com.example.springmyitem.entity.Item;
import com.example.springmyitem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findAllByUser(User user);

}
