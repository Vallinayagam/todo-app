package com.example.todoapp.repository;

import com.example.todoapp.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<TodoEntity, Long> {
}
