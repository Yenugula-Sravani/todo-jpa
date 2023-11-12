package com.jpa.todojpa.service;

import com.jpa.todojpa.model.AppUser;
import com.jpa.todojpa.model.Todo;
import com.jpa.todojpa.repository.AppUserRepository;
import com.jpa.todojpa.repository.TodoRepository;
import com.jpa.todojpa.request.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    AppUserRepository appUserRepository;

    public List<Todo> findAll(Integer userId){
        List<Todo> alltodos= todoRepository.findAll();
        return alltodos.stream()
                .filter(todo -> todo.getAppUser().getId()== userId)
                .collect(Collectors.toList());
    }
   public List<Todo> createTodo(TodoRequest todo){
        Todo originalTodo=new Todo();
        originalTodo.setTodoname(todo.getTodoname());
        AppUser user=appUserRepository.findById(todo.getUserId()).get();
        originalTodo.setAppUser(user);
        todoRepository.save(originalTodo);
        return findAll(todo.getUserId());
    }


    public List<Todo> updateTodo(TodoRequest todo){
        Todo originalTodo = new Todo();
        originalTodo.setId(todo.getId());
        originalTodo.setTodoname(todo.getTodoname());
        AppUser user=appUserRepository.findById(todo.getUserId()).get();
        originalTodo.setAppUser(user);
        todoRepository.save(originalTodo);
        return findAll(todo.getUserId());
    }
    public List<Todo> deleteTodoById(Integer id){
        int userId=todoRepository.findById(id).get().getAppUser().getId();
        todoRepository.deleteById(id);
        return findAll(userId);
    }
}
