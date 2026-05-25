package com.pooja.Expense_Tracker.controller;

import com.pooja.Expense_Tracker.model.Expense;
import com.pooja.Expense_Tracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @PostMapping("/bulk")
    public List<Expense> addBulkExpenses(@RequestBody List<Expense> expenses) {

        return service.addAllExpenses(expenses);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @RequestBody Expense expense) {

        return service.updateExpense(id, expense);
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {

        service.deleteExpense(id);

        return "Expense deleted successfully";
    }

}
