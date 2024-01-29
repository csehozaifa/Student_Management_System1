package com.example.student_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController //in this class we will be writing
//API ends point
public class StudentController {
HashMap<Integer,Student> hashMap=new HashMap<>();
@PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
    int key=student.getRollNo();
    hashMap.put(key,student);
}
@GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){
    Student student=hashMap.get(rollNo);
    return student;
}
}
