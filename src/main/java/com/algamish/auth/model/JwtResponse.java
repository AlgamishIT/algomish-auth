package com.algamish.auth.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String jwtToken;

}
