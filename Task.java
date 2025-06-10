package com.example.taskmanager.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}