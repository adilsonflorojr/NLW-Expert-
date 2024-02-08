package com.example.ProjectNLW.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.example.ProjectNLW.modules.students.dto.StudentsVerify;

@Service
public class VerifyIfHasCertificationUseCases {
    public boolean execute(StudentsVerify dto){
        if(dto.getEmail().equals("dgmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        } 
        return false;
    }
}
