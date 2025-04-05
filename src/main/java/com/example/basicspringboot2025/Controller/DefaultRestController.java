package com.example.basicspringboot2025.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class DefaultRestController {

    @RequestMapping("/index")
    public int index(){
        return 1;
    }


    @RequestMapping("/test1")
    public List<String> test1(@RequestParam String param_1, String param_2){
        List<String> list = new ArrayList<String>();
        list.add("1.rest page controller");
        list.add("2.Json type");
        list.add("3.ajax means");
        list.add(param_1);
        list.add(param_2);
        return list;
    }
}

