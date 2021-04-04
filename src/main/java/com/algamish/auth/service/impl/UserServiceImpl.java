package com.algamish.auth.service.impl;

import com.algamish.auth.adapter.UserAdapter;
import com.algamish.auth.dto.UserDto;
import com.algamish.auth.model.User;
import com.algamish.auth.repository.UserRepository;
import com.algamish.auth.service.UserService;
import com.algamish.auth.service.exception.UserAlreadyExists;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAdapter userAdapter;

    @Override
    public UserDto createUser(UserDto userDto) {
        User userExist = getByEmail(userDto.getEmail());

        Optional.ofNullable(userExist).ifPresent(user -> {
            throw new UserAlreadyExists("The user already exists in the database.");
        });

        User user = userAdapter.adapterUserDtoToUser(userDto);
        user = userRepository.save(user);
        userDto = userAdapter.adapterUserToUserDto(user);
        return userDto;
    }

    @Override
    public Optional<User> getById(final Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User getByEmail(final String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll()
            .stream()
            .map(user -> userAdapter.adapterUserToUserDto(user))
            .collect(Collectors.toList());
    }

}
