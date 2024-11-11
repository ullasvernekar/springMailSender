package com.ot.email.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String adminEmail;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String queryText;
}