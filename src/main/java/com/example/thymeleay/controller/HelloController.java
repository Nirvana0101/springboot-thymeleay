package com.example.thymeleay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @ResponseBody()
    @RequestMapping("/hello")
    public Object hello(){
        Map<String,String> map=new HashMap<>();
        map.put("hello","world");
        return map;
    }
}
