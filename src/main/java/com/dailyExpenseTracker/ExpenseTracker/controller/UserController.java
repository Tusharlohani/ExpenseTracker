package com.dailyExpenseTracker.ExpenseTracker.controller;

import com.dailyExpenseTracker.ExpenseTracker.dto.UserDTO;
import com.dailyExpenseTracker.ExpenseTracker.entity_dao.UserEntity;
import com.dailyExpenseTracker.ExpenseTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUsers(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(
                userService.createUser(userDTO)
        );
    }

    public ResponseEntity<UserDTO> getAllUsers(){
        List<UserDTO> ls=userService.getAll();
        return user
    }
}
