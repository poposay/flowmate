package com.example.flowmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowmate.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
