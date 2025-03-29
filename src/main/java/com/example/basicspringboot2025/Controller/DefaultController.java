package com.example.basicspringboot2025.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DefaultController {
    @ResponseBody
    @RequestMapping("/home")
    public String home(){
        return "Welcome to Home page";
    }

    @ResponseBody
    @RequestMapping("/about")
    public Map<String, Object> test2(){
        Map<String, Object> map = new HashMap<>();
        map.put("test", "test2");
        return map;
    }
}
