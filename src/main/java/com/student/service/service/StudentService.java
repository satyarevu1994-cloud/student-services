package com.student.service.service;

import com.student.service.dto.StudentRequest;
import com.student.service.dto.StudentResponse;
import com.student.service.model.Student;
import com.student.service.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentResponse createStudent(StudentRequest request){

        var student = new Student();
        student.setId(UUID.randomUUID().toString());
        student.setStudentName(request.getName());
        student.setStudentClass(request.getStudentClass());
        student.setPoneNo(request.getPhoneNo());
        studentRepository.save(student);
        var response = new StudentResponse();
        response.setStudentId(student.getId());
        response.setName(student.getStudentName());
        response.setStudentClass(student.getStudentClass());
        response.setPhoneNo(student.getPoneNo());
        return null;
    }

    public StudentResponse getStudentById(String id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        StudentResponse response = new StudentResponse();
        response.setStudentId(student.getId());
        response.setName(student.getStudentName());
        response.setStudentClass(student.getStudentClass());
        response.setPhoneNo(student.getPoneNo());

        return response;
    }
}
