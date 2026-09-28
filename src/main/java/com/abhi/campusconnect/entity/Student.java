package com.abhi.campusconnect.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.GenericArrayType;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name is required")
    private String name;
    @Email(message="Please provide a valid mail")
    @NotBlank(message="Email is required")
    private String email;
    @NotBlank(message="Course is required")
    private String course;
    @NotNull(message="Age is required")
    @Min(value=16,message="Age should me minimum of 16")
    @Max(value=100,message="Age should not be greater than 100")
    private Integer age;


}
