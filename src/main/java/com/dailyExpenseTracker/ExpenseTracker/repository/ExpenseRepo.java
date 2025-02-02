package com.dailyExpenseTracker.ExpenseTracker.repository;

import com.dailyExpenseTracker.ExpenseTracker.entity_dao.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<ExpenseEntity,Integer> {

}
