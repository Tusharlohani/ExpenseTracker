package com.dailyExpenseTracker.ExpenseTracker.controller;

import com.dailyExpenseTracker.ExpenseTracker.dto.UserDTO;
import com.dailyExpenseTracker.ExpenseTracker.entity_dao.UserEntity;
import com.dailyExpenseTracker.ExpenseTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    public ResponseEntity<UserDTO> createUsers(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(
                userService.createUser(userDTO)
        );
    }
}
