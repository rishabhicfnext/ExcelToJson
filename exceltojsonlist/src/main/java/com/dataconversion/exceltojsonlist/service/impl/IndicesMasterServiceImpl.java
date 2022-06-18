package com.dataconversion.exceltojsonlist.service.impl;

import com.dataconversion.exceltojsonlist.entity.IndicesMasterPojo;
import com.dataconversion.exceltojsonlist.helper.Helper;
import com.dataconversion.exceltojsonlist.repository.IndicesMasterPojoRepo;
import com.dataconversion.exceltojsonlist.service.IndicesMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class IndicesMasterServiceImpl implements IndicesMasterService {

    @Autowired
    private IndicesMasterPojoRepo indicesMasterPojoRepo;

    @Override
    public void saveIndices(MultipartFile multipartFile) {
        try {
            List<IndicesMasterPojo> indicesMasterPojos = Helper.convertExcelToIndicesMasterList(multipartFile.getInputStream());
            indicesMasterPojoRepo.saveAll(indicesMasterPojos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IndicesMasterPojo> getAllIndices() {
        return this.indicesMasterPojoRepo.findAll();
    }
}
