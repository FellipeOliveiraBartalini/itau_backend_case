package com.itaucase.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itaucase.demo.models.TodoModel;
import com.itaucase.demo.repositories.TodoRepository;

@Service
public class TodoService {
    final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoModel> findAll() {
        return this.todoRepository.findAll();
    }

}
