package com.itaucase.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itaucase.demo.models.TodoModel;

public interface TodoRepository extends JpaRepository<TodoModel, Long> {

}
