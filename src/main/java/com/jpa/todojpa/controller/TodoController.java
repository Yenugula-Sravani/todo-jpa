package com.jpa.todojpa.controller;

import com.jpa.todojpa.model.AppUser;
import com.jpa.todojpa.model.Todo;
import com.jpa.todojpa.request.TodoRequest;
import com.jpa.todojpa.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
   private TodoService todoService;


    @GetMapping("/{userId}")
    public List<Todo> findAllTodos(@PathVariable Integer userId){
        return todoService.findAll(userId);
    }

    @PostMapping
    public List<Todo>  createTodo(@RequestBody TodoRequest todo){
        return todoService.createTodo(todo);
    }

    @PutMapping
    public List<Todo> updateTodo(@RequestBody TodoRequest todo){
        return todoService.updateTodo(todo);
    }
   @DeleteMapping("/{id}")
    public List<Todo> deletetodoByID(@PathVariable int id){
        return todoService.deleteTodoById(id);
    }
}
