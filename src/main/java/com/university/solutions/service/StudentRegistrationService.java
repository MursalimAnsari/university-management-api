package com.university.solutions.service;

import com.university.solutions.db.StudentRepository;
import com.university.solutions.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRegistrationService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
       return studentRepository.findAll();
    }

}