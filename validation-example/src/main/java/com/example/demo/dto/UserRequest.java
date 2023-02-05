package com.example.demo.dto;

import com.example.demo.validation.ValidateEmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message="username shouldn't be null")
    @Size(max = 12)
    @Size(min = 5)
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered")
    private String mobile;
    @NotEmpty(message = "The gender is required")
    @Pattern(regexp="f|m|FEMALE|MALE|F|M|female|male")

    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;

    @NotEmpty
    @ValidateEmployeeType
    private String employeeType;
}

