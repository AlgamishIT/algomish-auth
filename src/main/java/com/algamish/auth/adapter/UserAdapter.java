package com.algamish.auth.adapter;

import com.algamish.auth.dto.UserDto;
import com.algamish.auth.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter {

    public User adapterUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setCreatedAt(userDto.getCreatedAt());
        return user;
    }

    public UserDto adapterUserToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setCreatedAt(user.getCreatedAt());
        return userDto;
    }

}
