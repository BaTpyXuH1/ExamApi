package org.com.examapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/ping")
    public  String toString(){
        return "Congratulation ! Exam successfully!!!";
    }
}
