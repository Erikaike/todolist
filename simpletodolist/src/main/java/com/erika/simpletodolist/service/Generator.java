package com.erika.simpletodolist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.erika.simpletodolist.entity.Task;
import com.erika.simpletodolist.repository.TaskRepository;

@Service
public class Generator {
    
    private TaskRepository repo;

    public Generator(
        TaskRepository repo
    ) {
        this.repo = repo;
    }

    public void generateInitTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("water the plants", true));
        tasks.add(new Task("call my BFF", true));
        tasks.add(new Task("go to the beautician", false));
        tasks.add(new Task("go to the car wash", false));

        repo.saveAll(tasks);
    }
}
