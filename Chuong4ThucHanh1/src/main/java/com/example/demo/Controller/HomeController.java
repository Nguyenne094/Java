package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/Home")

public class HomeController {
    @GetMapping("/helloworld")
    public String helloworld(Model model) {
        model.addAttribute("message", "Hello World");
        return "helloworld";
    }
}
