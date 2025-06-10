package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private long idCounter = 1;

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }
}