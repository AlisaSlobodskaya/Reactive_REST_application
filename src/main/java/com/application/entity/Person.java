package com.application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table(name = "persons")
public class Person {
    @Id
    @Column("personId")
    private long personId;

    @Column("fullName")
    private String fullName;

    @Column("dateOfBirth")
    private String dateOfBirth;

    @Column("gender")
    private String gender;

    @Column("email")
    private String email;

    @Column("phoneNumber")
    private long phoneNumber;
}
