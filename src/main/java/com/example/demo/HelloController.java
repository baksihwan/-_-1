package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/sbb")
    @ResponseBody
    public String hello() {
        return "스프링부트에 오신 것을 환영합니다.";
    }
    }



