package com.erika.simpletodolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erika.simpletodolist.entity.Task;
import com.erika.simpletodolist.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public List<Task> getTasks(){
        return repo.findAll();
    }

    public Task getTask(Long taskId){
        //TODO: meilleure gestion des optionnal
        return repo.findById(taskId).orElse(null);
    }

    public void createTask(Task task){
        repo.save(task);
    }

    public void editTask(Task task){
        repo.save(task);
    }

    public void deleteTask(Long id){
        repo.deleteById(id);
    }

}