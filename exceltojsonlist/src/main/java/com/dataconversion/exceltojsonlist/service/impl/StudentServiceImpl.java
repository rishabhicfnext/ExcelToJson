package com.dataconversion.exceltojsonlist.service.impl;

import com.dataconversion.exceltojsonlist.entity.Student;
import com.dataconversion.exceltojsonlist.helper.Helper;
import com.dataconversion.exceltojsonlist.repository.StudentRepo;
import com.dataconversion.exceltojsonlist.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(MultipartFile multipartFile) {
        try {
            List<Student> students = Helper.convertExcelToListProduct(multipartFile.getInputStream());
            studentRepo.saveAll(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepo.findAll();
    }
}
