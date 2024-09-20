package com.example.demo2.repository;

import com.example.demo2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);


    Student findStudentByEmail(String email);
}
