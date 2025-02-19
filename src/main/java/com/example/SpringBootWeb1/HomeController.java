package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {



    @RequestMapping("/")
    public String Home() {
        System.out.println("Home method called");
        return "index.jsp";

    }
}
