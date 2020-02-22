package com.university.solutions.web;

import com.university.solutions.model.Student;
import com.university.solutions.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRegistrationResource {
    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @GetMapping
    public List<Student> getUniversityDetails() {
        return studentRegistrationService.getStudents();
    }


    @GetMapping("/health")
    public String getHealth() {
        return "Application is working, up and running";
    }


    @PostMapping()
    public Student addStudent(@RequestBody Student student)
    {
        System.out.println(student);
       return studentRegistrationService.addStudent(student);
    }
}
