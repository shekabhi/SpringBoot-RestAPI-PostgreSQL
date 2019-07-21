package com.abhishek.ab.springbootpostgresql.controller;

import com.abhishek.ab.springbootpostgresql.model.Student;
import com.abhishek.ab.springbootpostgresql.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    StudentServices studentServices ;

    @RequestMapping(value = "/")
    public String hello(){

        return "hello" ;
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> studentbyid(@PathVariable("id") int id){

        return studentServices.findStudentById(id) ;
    }

    @GetMapping(value = "/students")
    public List<Student> allStudents(){

        return studentServices.findAllStudents() ;
    }

    @PostMapping(value = "/insert")
    public void addstudent(@RequestBody Student student){
        studentServices.addStudent(student) ;
    }

    @PutMapping(value = "/update")
    public void updateStudent(@RequestBody Student student){
        studentServices.updateStudent(student) ;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteStudent(@PathVariable("id") int id){
        studentServices.deleteStudentById(id) ;
    }
}
