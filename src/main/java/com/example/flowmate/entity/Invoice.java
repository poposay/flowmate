package com.example.flowmate.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "project_id", nullable = false)
	private Project project;
	
	@Column(length = 100)
	private String invoiceNumber;
	
	@Column
	private LocalDate issueDate;
	
	@Column
	private LocalDate dueDate;
	
	@Column(precision = 10, scale = 2)
	private BigDecimal totalAmount;
	
	@Column(length = 50)
	private String status;
	
	@Column
	private LocalDate receiveDate;

	public Long getId() {
		return id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getToalAmount() {
		return totalAmount;
	}

	public void setToalAmount(BigDecimal toalAmount) {
		this.totalAmount = toalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getReceivDate() {
		return receiveDate;
	}

	public void setReceivDate(LocalDate receivDate) {
		this.receiveDate = receivDate;
	}
}
