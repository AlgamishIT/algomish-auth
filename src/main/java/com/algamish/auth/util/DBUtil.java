package com.algamish.auth.util;

import com.algamish.auth.model.User;
import com.algamish.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBUtil implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        User user = new User();
        user.setName("Admin Algamish");
        user.setEmail("admin@algamish.com");
        user.setPassword("admin");

        userService.createUser(user);
    }
}
