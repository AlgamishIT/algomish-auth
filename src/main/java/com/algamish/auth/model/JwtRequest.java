package com.algamish.auth.model;

import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Email
    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    @Length(min = 6)
    private String password;

}
