package com.dailyExpenseTracker.ExpenseTracker.repository;

import com.dailyExpenseTracker.ExpenseTracker.entity_dao.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepo extends JpaRepository<IncomeEntity,Long> {

}
