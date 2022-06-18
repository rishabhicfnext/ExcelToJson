package com.dataconversion.exceltojsonlist.repository;

import com.dataconversion.exceltojsonlist.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
