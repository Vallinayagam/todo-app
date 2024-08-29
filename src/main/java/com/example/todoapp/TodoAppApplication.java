package com.example.todoapp;

import com.example.todoapp.model.TodoEntity;
import com.example.todoapp.servicce.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }

}


@RestController
class AppTierController {

    @Autowired
    private TodoService todoService;


    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/todos")
    public List<TodoEntity> getApi() {
        return todoService.getAll();
    }


    @GetMapping("/populate")
    public void populate() {
        todoService.insert(List.of(
                new TodoEntity("grocery", "grocery items", false),
                new TodoEntity("gym", "exercise", false)
        ));
    }
}