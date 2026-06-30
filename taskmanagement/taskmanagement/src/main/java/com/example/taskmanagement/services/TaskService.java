package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.models.User;
import com.example.taskmanagement.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final UserService userService; // [Mới] Khai báo thêm UserService

    @Autowired
    public TaskService(TaskRepository taskRepository, UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public boolean createTask(Task task) {
        try {
            Long userId = Long.parseLong(task.getAssignedTo());
            User user = userService.findById(userId);

            if (user != null) {
                taskRepository.save(task);
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("ID người dùng không hợp lệ");
        }
        return false;
    }
}