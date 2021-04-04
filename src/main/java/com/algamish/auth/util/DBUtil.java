package com.algamish.auth.util;

import com.algamish.auth.adapter.UserAdapter;
import com.algamish.auth.dto.UserDto;
import com.algamish.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBUtil implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAdapter userAdapter;

    @Override
    public void run(String... args) {
        UserDto userDto = new UserDto();
        userDto.setName("Admin Algamish");
        userDto.setEmail("admin@algamish.com");
        userDto.setPassword("admin");

        userService.createUser(userDto);
    }
}
