package com.blog.payloads;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min=3, message = "Username must have 3 characters")
    private String name;

    @Email(message = "Invalid email-address")
    private String email;

    @NotEmpty
    @Size(min = 3, message = "Password must be min of 3 characters")
    private String password;

    @NotEmpty
    private String about;
}
