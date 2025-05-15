package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/Home")
    public String index(Model model) {
        model.addAttribute("message", "Hello from HTML!");
        return "index";
    }
}
