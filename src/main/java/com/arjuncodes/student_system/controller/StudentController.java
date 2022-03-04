package com.arjuncodes.student_system.controller;

import com.arjuncodes.student_system.model.Student;
import com.arjuncodes.student_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String  add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
