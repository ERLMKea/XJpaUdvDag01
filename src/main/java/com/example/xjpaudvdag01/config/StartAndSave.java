package com.example.xjpaudvdag01.config;

import com.example.xjpaudvdag01.model.Student;
import com.example.xjpaudvdag01.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class StartAndSave implements CommandLineRunner {

    StudentRepository studentRepository;

    public StartAndSave(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student std1 = new Student();
        std1.setBorn(LocalDate.now());
        std1.setName("Annex");
        std1.setBornTime(LocalTime.now());
        studentRepository.save(std1);

        Student std2 = new Student();
        std2.setBorn(LocalDate.now().plusDays(1000));
        std2.setName("Viggo");
        studentRepository.save(std2);

    }
}
