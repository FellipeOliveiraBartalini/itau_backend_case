package com.itaucase.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.itaucase.demo.models.TodoModel;
import com.itaucase.demo.repositories.TodoRepository;

import jakarta.transaction.Transactional;

@Service
public class TodoService {
    final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoModel> findAll() {
        return this.todoRepository.findAll();
    }

    public Optional<TodoModel> findById(Long id) {
        return this.todoRepository.findById(id);
    }

    @Transactional
    public TodoModel save(TodoModel todoModel) {
        return this.todoRepository.save(todoModel);
    }

    @Transactional
    public void delete(Long id) {
        this.todoRepository.deleteById(id);
    }
}
