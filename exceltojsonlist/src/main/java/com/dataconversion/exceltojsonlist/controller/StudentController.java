package com.dataconversion.exceltojsonlist.controller;

import com.dataconversion.exceltojsonlist.entity.Student;
import com.dataconversion.exceltojsonlist.helper.Helper;
import com.dataconversion.exceltojsonlist.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true
            studentService.save(file);
            return ResponseEntity.ok("data uploaded successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload correct excel file");
    }

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return this.studentService.getAllStudents();
    }
    
}