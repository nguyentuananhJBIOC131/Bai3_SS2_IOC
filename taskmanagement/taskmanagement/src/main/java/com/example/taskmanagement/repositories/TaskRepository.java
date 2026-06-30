package com.example.taskmanagement.repositories;

import com.example.taskmanagement.models.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task(1L, "Design DB", "Thiết kế CSDL", "High", "1"));
        tasks.add(new Task(2L, "Setup Spring Boot", "Khởi tạo project", "High", "2"));
        tasks.add(new Task(3L, "Tạo Models", "Tạo User và Task", "Medium", "3"));
        tasks.add(new Task(4L, "Tạo Repositories", "Hardcode dữ liệu", "Medium", "1"));
        tasks.add(new Task(5L, "Tạo Services", "Xử lý logic", "Medium", "2"));
        tasks.add(new Task(6L, "Tạo Controllers", "Tạo REST API", "High", "3"));
        tasks.add(new Task(7L, "Test API Users", "Test Postman", "Low", "1"));
        tasks.add(new Task(8L, "Test API Tasks", "Test Postman", "Low", "2"));
        tasks.add(new Task(9L, "Fix Bugs", "Sửa lỗi DI", "High", "3"));
        tasks.add(new Task(10L, "Deploy", "Đẩy lên GitHub", "Medium", "1"));
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void save(Task task) {
        tasks.add(task);
    }
}