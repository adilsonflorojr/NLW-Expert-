package com.example.ProjectNLW.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//LOMBOK
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Certification {
    private UUID id;
    private UUID studentId;
    private String technology;
    private int hitAmount;

    List<AnswersCertification> answersCertificationEntities;
}
