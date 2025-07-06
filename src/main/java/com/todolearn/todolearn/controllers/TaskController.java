package com.todolearn.todolearn.controllers;

import com.todolearn.todolearn.Services.TodoService;
import com.todolearn.todolearn.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TodoService todoService;
    public TaskController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping
    public String getTask(Model model){
        List<Task> tasks =todoService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }
}
