package com.andres.apirest.apirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andres.apirest.apirest.entity.Student;
import com.andres.apirest.apirest.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    // crear la lista de todos los estudiantes 
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    // aqui traigo el estudiante a buscar
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }
    // aqui voy a realizar el metodo guardar
    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    // aqui voy a realizar el metodo eliminar
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
