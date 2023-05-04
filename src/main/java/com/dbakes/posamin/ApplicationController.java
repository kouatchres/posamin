package com.dbakes.posamin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping("/")
    public String showIndex() {
    return "/index";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/_layout")
    public String layout() {
        return "/_layout";
    }
}
