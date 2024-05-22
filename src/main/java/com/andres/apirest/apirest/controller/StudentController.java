package com.andres.apirest.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.apirest.apirest.entity.Student;
import com.andres.apirest.apirest.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // lista todos los estudiantes
    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudents();

    }

    // guarda los estudiantes
    @PostMapping
    public Student saveUpdate(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student;

    }

    // elimina los estudiantes
    @DeleteMapping("/{studentId}")
    public void saveUpdate(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
    // consultar los estudiantes
    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId")Long studentId) {
        return studentService.getStudent(studentId);

    }

}
