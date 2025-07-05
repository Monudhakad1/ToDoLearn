package com.todolearn.todolearn.controllers;

import com.todolearn.todolearn.Services.TodoService;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    private final TodoService todoService;
    public TaskController(TodoService todoService) {
        this.todoService = todoService;
    }

    public String getTask(){

    }
}
