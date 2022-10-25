package com.example.xjpaudvdag01.controller;

import com.example.xjpaudvdag01.model.Student;
import com.example.xjpaudvdag01.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/test")
    public Student kurt() {
        Student std = new Student();
        std.setBorn(LocalDate.now());
        std.setBornTime(LocalTime.now());
        std.setName("test");
        return std;
    }


    @GetMapping("/students")
    public List<Student> students() {
        List<Student> lst = studentRepository.findAll();
        return lst;
    }

    @GetMapping("/addstudent")
    public List<Student> addstudent() {
        Student std = new Student();
        std.setBorn(LocalDate.now());
        std.setBornTime(LocalTime.now());
        List<Student> lst = studentRepository.findAll();
        std.setName("Autogenerated size=" + lst.size());
        studentRepository.save(std);
        System.out.println("Student save =" + std.getName());
        return lst;
    }

}


