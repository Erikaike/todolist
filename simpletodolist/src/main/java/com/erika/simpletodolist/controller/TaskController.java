package com.erika.simpletodolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erika.simpletodolist.entity.Task;
import com.erika.simpletodolist.service.TaskService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
    
    @Autowired
    private TaskService service;

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<Task>> getTasks(){
        return new ResponseEntity(service.getTasks(), HttpStatus.OK);
    }

    @GetMapping("/getTask/{id}")
    public void getTask(@PathVariable("id") Long id, @RequestBody Task task){}
    
    @PostMapping("/createTask")
    public void createTask(@RequestBody Task task){
        service.createTask(task);
    }

    @PutMapping("/editTask/{id}")
    public void editTask(@PathVariable("id") Long id, @RequestBody Task task ){
        service.editTask(task);
    }

    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") Long id){
        service.deleteTask(id);
    }
}
