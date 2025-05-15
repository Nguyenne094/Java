package com.example.thuchanh2.controller;


import com.example.thuchanh2.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/student")
    public String submitForm(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("student", student);
        return "student";
    }
}