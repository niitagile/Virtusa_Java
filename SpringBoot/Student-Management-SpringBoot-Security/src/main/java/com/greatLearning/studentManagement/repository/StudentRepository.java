package com.greatLearning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
