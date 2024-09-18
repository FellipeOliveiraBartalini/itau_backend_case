package com.itaucase.demo.dtos;

import jakarta.validation.constraints.NotBlank;

public class TodoDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String createdAt;
    private String completedAt;

    public TodoDto() {
    }

    public TodoDto(String title, String description, String createdAt, String completedAt) {
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.completedAt = completedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
}
