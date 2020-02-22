package com.university.solutions.db;

import com.university.solutions.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,  Integer> {
}
