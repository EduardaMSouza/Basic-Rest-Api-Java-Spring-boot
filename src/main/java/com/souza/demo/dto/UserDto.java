package com.souza.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDto Model information"
)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDto{

    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "User first name shold not be empty")
    private String firstName;
    @Schema(
            description = "User Last Name"
    )
    @NotEmpty(message = "User last name shold not be empty")
    private String lastName;
    @Schema(
            description = "User Email Adress"
    )
    @NotEmpty(message = "User email shold not be empty")
    @Email(message = "User email should be a valid email")
    private String email;
}
