package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/add")
    @ResponseBody
    public String addStudent(@RequestParam String name) {
        return "Student " + name + " added successfully ✅";
    }
}
