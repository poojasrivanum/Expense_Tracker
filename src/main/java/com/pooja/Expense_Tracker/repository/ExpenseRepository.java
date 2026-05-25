package com.pooja.Expense_Tracker.repository;

import com.pooja.Expense_Tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}