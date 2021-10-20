//package com.byaj.mydynamodbspring.controllers;
//
//import com.byaj.mydynamodbspring.domain.Student;
//import com.byaj.mydynamodbspring.repo.StudentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.enterprise.inject.Model;
//import java.util.List;
//
//@Controller
//public class StudentController {
//
//    @Autowired
//    private StudentRepo studentRepo;
//
//    @GetMapping("/students")
//    public String listAll(Model model) {
//        List<Student> listStudents = studentRepo.findAll();
//
//        return "students";
//    }
//
//}
//
