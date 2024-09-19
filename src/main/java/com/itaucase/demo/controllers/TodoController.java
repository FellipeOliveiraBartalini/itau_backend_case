package com.itaucase.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itaucase.demo.dtos.TodoDto;
import com.itaucase.demo.models.TodoModel;
import com.itaucase.demo.services.TodoService;

import jakarta.validation.Valid;

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

    @GetMapping("/{id}")
    public ResponseEntity<TodoModel> findById(@PathVariable(value = "id") Long id) {
        Optional<TodoModel> todoModelOptional = todoService.findById(id);
        if (!todoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(todoModelOptional.get());
    }

    @PostMapping
    public ResponseEntity<TodoModel> save(@RequestBody @Valid TodoDto todoDto) {
        TodoModel todoModel = new TodoModel();
        BeanUtils.copyProperties(todoDto, todoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.save(todoModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
            @RequestBody @Valid TodoDto todoDto) {
        Optional<TodoModel> todoModelOptional = todoService.findById(id);
        if (!todoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(todoDto);
        }
        TodoModel todoModelToUpdate = todoModelOptional.get();
        BeanUtils.copyProperties(todoDto, todoModelToUpdate, "id");
        return ResponseEntity.status(HttpStatus.OK).body(todoService.save(todoModelToUpdate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        Optional<TodoModel> todoModelOptional = todoService.findById(id);
        if (!todoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found.");
        }
        todoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Todo deleted successfully!");
    }
}
