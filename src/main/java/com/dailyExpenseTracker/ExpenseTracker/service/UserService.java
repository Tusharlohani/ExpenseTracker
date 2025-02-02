package com.dailyExpenseTracker.ExpenseTracker.service;

import com.dailyExpenseTracker.ExpenseTracker.dto.UserDTO;
import com.dailyExpenseTracker.ExpenseTracker.entity_dao.UserEntity;
import com.dailyExpenseTracker.ExpenseTracker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity=UserEntity.builder().name(userDTO.getName()).email(userDTO.getEmail()).password("randomPassword").build();
        UserEntity savedUser=userRepo.save(userEntity);
        return mapToDTO(savedUser);
    }
    private UserDTO mapToDTO(UserEntity userEntity) {
        return UserDTO.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .build();
    }
}
