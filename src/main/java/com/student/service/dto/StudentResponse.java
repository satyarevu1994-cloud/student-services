package com.student.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentResponse {
    private String  studentId;
    private String name;
    private String studentClass;
    private Long phoneNo;
}
