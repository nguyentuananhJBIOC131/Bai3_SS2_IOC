package com.example.taskmanagement.repositories;

import com.example.taskmanagement.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "nguyentuananh", "anhnt@example.com", "ADMIN"));
        users.add(new User(2L, "parkboanh", "park@example.com", "USER"));
        users.add(new User(3L, "john_doe", "john@example.com", "USER"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}