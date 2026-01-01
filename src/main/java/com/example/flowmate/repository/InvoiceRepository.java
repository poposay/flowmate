package com.example.flowmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flowmate.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
