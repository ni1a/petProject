package com.example.demo2.service;

import com.example.demo2.model.Student;


import java.util.List;


public interface StudentService {
    List<Student> findAllStudents();

    void saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);

}
