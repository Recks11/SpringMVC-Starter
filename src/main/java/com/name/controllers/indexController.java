package com.name.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("title","Home");
        model.addAttribute("body","It Works!!");
        return "index";
    }
}
