package com.dataconversion.exceltojsonlist.controller;

import com.dataconversion.exceltojsonlist.entity.IndicesMasterPojo;
import com.dataconversion.exceltojsonlist.helper.Helper;
import com.dataconversion.exceltojsonlist.service.IndicesMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin("*")
public class IndicesMasterController {

    @Autowired
    private IndicesMasterService indicesMasterService;


    @PostMapping("/indices/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true
            indicesMasterService.saveIndices(file);
            return ResponseEntity.ok("data uploaded successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload correct excel file");
    }

    @GetMapping("/allindices")
    public List<IndicesMasterPojo> getAllMasterPojoList() {
        return this.indicesMasterService.getAllIndices();
    }

}
