package com.example.ProjectNLW.modules.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectNLW.modules.students.dto.StudentsVerify;
import com.example.ProjectNLW.modules.students.useCases.VerifyIfHasCertificationUseCases;
@RestController
@RequestMapping("/students")
public class StdController {

    @Autowired
    private VerifyIfHasCertificationUseCases verifyIfHasCertificationUseCases;
    @PostMapping("/verifyCertification")
    public String verifyIfHasCertification(@RequestBody StudentsVerify verify){
        var result = this.verifyIfHasCertificationUseCases.execute(verify);
        if(result){
            return "Ok";
        }
        return "Permitido fazer a prova";

    }

}
