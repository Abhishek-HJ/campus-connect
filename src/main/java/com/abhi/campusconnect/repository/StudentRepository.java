package com.abhi.campusconnect.repository;

import com.abhi.campusconnect.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
