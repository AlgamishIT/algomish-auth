package com.algamish.auth.service.exception;

import java.io.Serializable;

public class UserAlreadyExists extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public UserAlreadyExists(String message) {
        super(message);
    }
}
