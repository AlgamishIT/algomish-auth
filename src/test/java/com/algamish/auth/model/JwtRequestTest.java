package com.algamish.auth.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JwtRequestTest {

    @Test
    @DisplayName("Should create a JwtRequest object with success.")
    void testCreateJwtRequestObject() {
        JwtRequest jwtRequest = new JwtRequest();
        jwtRequest.setUsername("admin@algamish.com");
        jwtRequest.setPassword("admin");

        assertNotNull(jwtRequest);
        assertEquals("admin@algamish.com", jwtRequest.getUsername());
        assertEquals("admin", jwtRequest.getPassword());
    }

    @Test
    @DisplayName("Should create a JwtRequest object using constructor with success.")
    void testCreateJwtRequestObjectWithConstructor() {
        JwtRequest jwtRequest = new JwtRequest("admin@algamish.com", "admin");

        assertNotNull(jwtRequest);
        assertEquals("admin@algamish.com", jwtRequest.getUsername());
        assertEquals("admin", jwtRequest.getPassword());
    }

}
