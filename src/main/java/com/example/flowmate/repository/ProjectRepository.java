package com.example.flowmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowmate.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
