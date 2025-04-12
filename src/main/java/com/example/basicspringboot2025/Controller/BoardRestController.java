package com.example.basicspringboot2025.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;


@RequestMapping("/api/board")
@RestController
public class BoardRestController{

    int order;

    List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();


    @RequestMapping("/create")
    public Map<String,Object> create(String title,String content,String author){
        System.out.println("-----------------------CREATE----------------------");
        Map<String,Object> board=new HashMap<>(); 
        board.put("title", title);
        board.put("content", content);
        board.put("author", author);
        board.put("date", LocalDate.now());
        // board.put("id",list.size()+1);
        board.put("id",++order);

        list.add(board);

        Map<String,Object> returnValue=new HashMap<String,Object>();
        returnValue.put("result Code",200);
        return returnValue;
    }
    
    @RequestMapping("/detail")
    public Map<String,Object> detail(String id){
        System.out.println("-----------------------DETAIL----------------------");
        // int index=Integer.parseInt(id)-1;
        // Map<String,Object> board=list.get(index);
        for (Map<String,Object> each:list){
            if ((each.get("id")+"").equals(id)){
                return each;
            }
        }
        return null;
    }

    @RequestMapping("/list")
    public List<Map<String,Object>> list(){
        System.out.println("-----------------------LIST----------------------");
        return list;
    }

    @RequestMapping("/update")
    public void update(String id,String title,String content,String author){
        System.out.println("-----------------------UPDATE----------------------");
        
        Map<String,Object> board=detail(id);
        if (title!=null && !title.isEmpty()){
            board.put("title",title);
        }
        if (content!=null && !content.isEmpty()){
            board.put("content",content);
        }
        if (author!=null && !author.isEmpty()){
            board.put("author",author);
        }
    }


    @RequestMapping("/delete")
    public void delete(String id){
        System.out.println("-----------------------DELETE----------------------");
        int index=0;
        // Map<String,Object> board=list.get(index);
        for (Map<String,Object> each:list){
            if ((each.get("id")+"").equals(id)){
                list.remove(index);
            }
            index++;
        }
        System.out.println("Entry "+index+" deleted sucessfully");
    }


}