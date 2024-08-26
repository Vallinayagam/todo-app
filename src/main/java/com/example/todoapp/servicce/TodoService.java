package com.example.todoapp.servicce;

import com.example.todoapp.model.TodoEntity;
import com.example.todoapp.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final ToDoRepository repository;

    public TodoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<TodoEntity> getAll() {
        return repository.findAll();
    }

    public void insert(List<TodoEntity> list) {
        repository.saveAllAndFlush(list);
    }
}
