package com.example.springboot.jdbc.dao;

import com.example.springboot.jdbc.entity.User;

import java.util.List;

public interface IUserDao {
    void dropTable();

    void createTable();

    void save(User user);

    List<User> findAll();

    void deleteAll();

    List<User> findByNameLike(String name);
}
