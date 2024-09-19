package com.itaucase.demo.dtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;

public class TodoDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String created_at;
    @Nullable
    private String completed_at;

    public TodoDto() {
    }

    public TodoDto(String title, String description, String created_at, String completed_at) {
        this.title = title;
        this.description = description;
        this.created_at = created_at;
        this.completed_at = completed_at;
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
        return created_at;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public String getCompletedAt() {
        return completed_at;
    }

    public void setCompletedAt(String completed_at) {
        this.completed_at = completed_at;
    }

    @Override
    public String toString() {
        return "TodoDto [title=" + title + ", description=" + description + ", created_at=" + created_at
                + ", completed_at=" + completed_at + "]";
    }
}
