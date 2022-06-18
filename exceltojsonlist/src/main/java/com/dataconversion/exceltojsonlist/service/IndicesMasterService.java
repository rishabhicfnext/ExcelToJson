package com.dataconversion.exceltojsonlist.service;

import com.dataconversion.exceltojsonlist.entity.IndicesMasterPojo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IndicesMasterService {
    void saveIndices(MultipartFile multipartFile);

    List<IndicesMasterPojo> getAllIndices();
}
