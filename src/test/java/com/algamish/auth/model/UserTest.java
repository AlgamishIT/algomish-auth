package com.algamish.auth.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCrypt;

class UserTest {

    @Test
    @DisplayName("Should create a user object with success")
    void testCreateUserObjectWithSuccess() {
        User user = new User();
        user.setId(null);
        user.setName("Admin Algamish");
        user.setPassword(BCrypt.hashpw("admin", BCrypt.gensalt(12)));
        user.setEmail("admin@algamish.com");

        assertNotNull(user);
        assertNull(user.getId());
        assertEquals("Admin Algamish", user.getName());
        assertNotEquals("admin", user.getPassword());
        assertEquals("admin@algamish.com", user.getEmail());
        assertNotNull(user.getCreatedAt());
    }

    @Test
    @DisplayName("Should encode password using BCrypt")
    void testShouldEncodePasswordWithSuccess() {
        User user = new User();
        user.setPassword("admin");

        String passwordEncoded = user.encodePassword(user.getPassword());

        assertNotNull(user);
        assertNotNull(user.getPassword());
        assertNotNull(passwordEncoded);
        assertNotEquals(user.getPassword(), passwordEncoded);
    }

    @Test
    @DisplayName("Should encode password attribute")
    void testEncodePasswordUsingBCrypt() {
        User user = new User();
        user.setPassword("admin");

        assertNotNull(user);
        assertNotEquals("admin", user.getPassword());
    }

}
