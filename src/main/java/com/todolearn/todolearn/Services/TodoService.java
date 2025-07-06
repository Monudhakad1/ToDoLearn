package com.todolearn.todolearn.Services;

import com.todolearn.todolearn.models.Task;
import com.todolearn.todolearn.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class TodoService {
    private final TaskRepository taskRepository;
    public TodoService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
