package com.algamish.auth.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JwtResponseTest {

    @Test
    @DisplayName("Should create a JwtRequest object using constructor with success.")
    void testCreateJwtResponseObjectWithConstructor() {
        JwtResponse jwtResponse = new JwtResponse("wikghdfkjag.sdkfjhskd.ksdjfksdjfh");

        assertNotNull(jwtResponse);
        assertEquals("wikghdfkjag.sdkfjhskd.ksdjfksdjfh", jwtResponse.getJwtToken());
    }

}
