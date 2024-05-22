package com.andres.apirest.apirest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
// crear tabla en la base de datos
@Table(name = "tbl_student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
// campos de la base de datos
    private long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
