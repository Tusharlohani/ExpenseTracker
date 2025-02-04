package com.dailyExpenseTracker.ExpenseTracker.repository;

import com.dailyExpenseTracker.ExpenseTracker.entity_dao.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);


}
