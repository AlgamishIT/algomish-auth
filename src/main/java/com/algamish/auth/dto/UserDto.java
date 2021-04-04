package com.algamish.auth.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class UserDto {

    private Long id;

    @Email
    private String email;

    @NotNull
    @NotEmpty
    private String name;

    private String password;
    private LocalDateTime createdAt = LocalDateTime.now();

}
