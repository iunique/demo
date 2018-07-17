package com.sign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/TeamSign")
    public String home()
    {
        return "TeamSign";
    }
}
