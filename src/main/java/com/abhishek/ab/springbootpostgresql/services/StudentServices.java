package com.abhishek.ab.springbootpostgresql.services;


import com.abhishek.ab.springbootpostgresql.model.Student;
import com.abhishek.ab.springbootpostgresql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public Optional<Student> findStudentById(int id) {

        return studentRepository.findById(id) ;
    }

    public List<Student> findAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student) ;
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }


}
