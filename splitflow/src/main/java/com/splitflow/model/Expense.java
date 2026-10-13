package com.splitflow.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long groupId;

    private String description;

    private BigDecimal amount;

    private String paidByEmail;

    private String category;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    public Expense() {
    }

    public Expense(
            Long groupId,
            String description,
            BigDecimal amount,
            String paidByEmail,
            String category) {

        this.groupId = groupId;
        this.description = description;
        this.amount = amount;
        this.paidByEmail = paidByEmail;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getPaidByEmail() {
        return paidByEmail;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPaidByEmail(String paidByEmail) {
        this.paidByEmail = paidByEmail;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}