package com.algamish.auth.service;

import com.algamish.auth.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> getById(final Long id);

    User getByEmail(final String email);

    List<User> getAll();

}
