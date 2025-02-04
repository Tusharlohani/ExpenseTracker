package com.dailyExpenseTracker.ExpenseTracker.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String email;// password has been removed as we don't want to access it directly from DB.
}
