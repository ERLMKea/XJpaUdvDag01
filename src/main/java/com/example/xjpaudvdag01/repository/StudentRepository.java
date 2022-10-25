package com.example.xjpaudvdag01.repository;

import com.example.xjpaudvdag01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository <Student, Integer>{

    Optional<Student> findByName(String name);

}
