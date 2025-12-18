package com.student.service.controller;

import com.student.service.dto.StudentRequest;
import com.student.service.dto.StudentResponse;
import com.student.service.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest request) {
        //creating student in student service
        StudentResponse response = studentService.createStudent(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable String id) {
        StudentResponse response = studentService.getStudentById(id);
        return ResponseEntity.ok(response);
    }
}
