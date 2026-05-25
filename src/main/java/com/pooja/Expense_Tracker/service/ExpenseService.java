package com.pooja.Expense_Tracker.service;

import com.pooja.Expense_Tracker.model.Expense;
import com.pooja.Expense_Tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {

        Expense expense = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        expense.setTitle(updatedExpense.getTitle());
        expense.setAmount(updatedExpense.getAmount());
        expense.setCategory(updatedExpense.getCategory());

        return repository.save(expense);
    }

    public void deleteExpense(Long id) {

        Expense expense = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        repository.delete(expense);
    }

    public List<Expense> addAllExpenses(List<Expense> expenses) {
        return repository.saveAll(expenses);
    }
}