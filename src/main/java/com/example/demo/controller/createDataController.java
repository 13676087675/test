package com.example.demo.controller;

import com.example.demo.util.createData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class createDataController {

    @GetMapping("/create")
    public String createData(){
       return "jenkins配置成功!";
    }
}
