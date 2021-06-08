package com.crudprac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/main/article/list/post")
    public String post() {
        return "post";
    }

    @GetMapping("/main/article")
    public String article() {
        return "index";
    }

    @GetMapping("main/article/detail")
    public String detail(@RequestParam("id") Long id) {
        return "detail.html";
    }
}
