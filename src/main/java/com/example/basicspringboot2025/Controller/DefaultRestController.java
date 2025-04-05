package com.example.basicspringboot2025.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RequestMapping("/api")
//@RestController
//public class DefaultRestController {
//
//    @RequestMapping("/index")
//    public int index(){
//        return 1;
//    }
//
//
//    @RequestMapping("/test1")
//    public List<String> test1(@RequestParam String param_1, String param_2){
//        List<String> list = new ArrayList<String>();
//        list.add("1.rest page controller");
//        list.add("2.Json type");
//        list.add("3.ajax means");
//        list.add(param_1);
//        list.add(param_2);
//        return list;
//    }
//}


//week 3 controller
@RequestMapping("/api")
@RestController
public class DefaultRestController {
    @RequestMapping("/assignment2")
    public String assignment2(int a, int b, int c, Model model) {
        int sum = 0;
        sum = a + b + c;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("c", c);
        model.addAttribute("sum", sum);
        return "assignment2";


    }
    @RequestMapping("/sum")
    public Map<String, Object> sum(
            @RequestParam int a,
            @RequestParam int b,
            @RequestParam int c,Model model) {



        int sum = a + b + c;
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("c", c);
        model.addAttribute("sum", sum);

        Map<String, Object> response = new HashMap<>();
        response.put("a", a);
        response.put("b", b);
        response.put("c", c);
        response.put("sum", sum);
        return response;



    }
}

