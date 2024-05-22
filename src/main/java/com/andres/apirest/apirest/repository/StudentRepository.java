package com.andres.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andres.apirest.apirest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    
} 
