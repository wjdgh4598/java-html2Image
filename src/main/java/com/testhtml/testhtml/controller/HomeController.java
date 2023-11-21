package com.testhtml.testhtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeView() {
        return "/home";
    }

    @GetMapping("/test")
    public String testView() {
        return "/test";
    }
}
