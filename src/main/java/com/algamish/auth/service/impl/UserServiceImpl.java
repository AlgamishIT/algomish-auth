package com.algamish.auth.service.impl;

import com.algamish.auth.model.User;
import com.algamish.auth.repository.UserRepository;
import com.algamish.auth.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        String generatedSecuredPasswordHash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
        user.setPassword(generatedSecuredPasswordHash);
        return userRepository.save(user);
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
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
