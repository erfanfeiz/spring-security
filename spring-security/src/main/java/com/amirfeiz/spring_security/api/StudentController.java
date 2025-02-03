package com.amirfeiz.spring_security.api;

import com.amirfeiz.spring_security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/list/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Amir Feiz", 33));
//        students.add(new Student(2, "Masoud Najafi", 30));
//        students.add(new Student(3, "Bahram Farmani", 24));
        return students;
    }

    @PostMapping("/create/student")
    public Student createStudent(@RequestBody Student student) {
//        Student newStudent = new Student(student.getId(), student.getName(), student.getAge());
        return null;
    }
}
