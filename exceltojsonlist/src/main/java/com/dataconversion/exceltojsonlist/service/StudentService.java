package com.dataconversion.exceltojsonlist.service;

import com.dataconversion.exceltojsonlist.entity.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {
    void save(MultipartFile multipartFile);

    List<Student> getAllStudents();
}
