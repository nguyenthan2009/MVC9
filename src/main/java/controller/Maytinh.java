package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Maytinh {

    @GetMapping("/than1")
    public String Test1(){
        return "maytinh";
    }
    @PostMapping ("/than2")
    public String Test2(@RequestParam int a, int b, @RequestParam String pick, Model model){
        int c;
        if(pick.equals("+")){
            c = a+b;
            model.addAttribute("c",c);
        }else if(pick.equals("-")){
            c= a-b ;
            model.addAttribute("c",c);
        }else if(pick.equals("*")) {
            c = a*b;
            model.addAttribute("c", c);
        }else if(pick.equals("/")) {
            c = a/b;
            model.addAttribute("c", c);
        }
        return "test";

    }
}
