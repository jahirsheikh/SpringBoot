package com.jahir.project_daynamic_pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Home {

    @GetMapping("/")
    public String home(){

        return "home";
    }
    @GetMapping("/page")
    public String page(){

        return "page";
    }
}
