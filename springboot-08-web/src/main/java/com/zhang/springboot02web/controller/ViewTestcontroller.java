package com.zhang.springboot02web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestcontroller {
    @GetMapping("/atguigu")
    public String atguigu(Model model){
        model.addAttribute("msg","你好 guigu");
        model.addAttribute("link", "https://www.baidu.com");
        return "success";
    }
}
