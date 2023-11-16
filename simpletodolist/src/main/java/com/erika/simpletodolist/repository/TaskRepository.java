package com.erika.simpletodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erika.simpletodolist.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

