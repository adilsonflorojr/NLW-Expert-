package com.example.ProjectNLW.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertification {
    private UUID id;
    private UUID certificationId;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;
}
