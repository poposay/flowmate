package com.example.flowmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowmate.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
