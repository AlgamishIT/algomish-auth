package com.algamish.auth.service;

import com.algamish.auth.dto.UserDto;
import com.algamish.auth.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDto createUser(UserDto userDto);

    Optional<User> getById(final Long id);

    User getByEmail(final String email);

    List<UserDto> getAll();

}
