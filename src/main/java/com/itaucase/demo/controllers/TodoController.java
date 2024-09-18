package com.itaucase.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itaucase.demo.models.TodoModel;
import com.itaucase.demo.services.TodoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<TodoModel>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(todoService.findAll());
    }
}
