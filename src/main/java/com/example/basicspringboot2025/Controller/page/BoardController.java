package com.example.basicspringboot2025.Controller.page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController{
    @RequestMapping("/create")
    public String create(){
        return "/board/create";
    }

    @RequestMapping("/list")
    public String list(){
        return "/board/list";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "/board/detail";
    }

    @RequestMapping("/update")
    public String update(){
        return "/board/update";
    }
    
    @RequestMapping("/delete")
    public String delete(){
        return "/board/delete";
    }

 
}