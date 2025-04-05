package com.example.basicspringboot2025.Controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {

    //this is page controller

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/test01")
    public String test01(){
        return "test01";
    }
    @RequestMapping("/testmodel")
    public String testmodel(Model model){
        model.addAttribute("msg", "We are testing the model");
        model.addAttribute("sum", 123);
        return "testmodel";
    }
    @RequestMapping("/testparameter")
    public String testparameter(int a,int b,@RequestParam String  s,Model model){
        int result=0;
        result=a+b;

        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("result", result);
        return "testparameter";
    }
}
