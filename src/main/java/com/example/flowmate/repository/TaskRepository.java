package com.example.flowmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowmate.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
