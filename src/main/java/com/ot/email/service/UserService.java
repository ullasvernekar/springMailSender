package com.ot.email.service;

import com.ot.email.model.User;
import com.ot.email.util.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private EmailSender emailSender;

    public void sendEmail(User user) {
        StringBuilder message = new StringBuilder();
        message.append("Hello,\n\n");
        message.append("The Customer Details Are Below Listed:\n");
        message.append("First Name: ").append(user.getFirstName()).append("\n");
        message.append("Last Name: ").append(user.getLastName()).append("\n");
        message.append("Email: ").append(user.getEmail()).append("\n");
        message.append("Phone Number: ").append(user.getPhoneNumber()).append("\n");
        message.append("Message: ").append(user.getQueryText()).append("\n\n");
        message.append("Thank You.");
        emailSender.sendSimpleEmail(user.getAdminEmail(), message.toString(), "Customer Details");
    }

}