package com.itaucase.demo.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class TodoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String created_at;
    @Column(nullable = true)
    private String completed_at;

    public TodoModel() {
    }

    public TodoModel(Long id, String title, String description, String created_at, String completed_at) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.created_at = created_at;
        this.completed_at = completed_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "TodoModel [id=" + id + ", title=" + title + ", description=" + description + ", created_at="
                + created_at
                + ", completed_at=" + completed_at + "]";
    }
}
