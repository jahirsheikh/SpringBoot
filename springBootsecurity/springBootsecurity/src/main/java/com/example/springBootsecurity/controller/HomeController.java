package com.example.springBootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String home(){


    return "home";
}

}
