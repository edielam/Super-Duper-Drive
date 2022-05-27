package com.udacity.jwdnd.course1.cloudstorage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model){
        //model.addAttribute("firstVisit",false);
        return "home";
    }

}