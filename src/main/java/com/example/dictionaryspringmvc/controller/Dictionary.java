package com.example.dictionaryspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/index")
    public String getIndex() {
        return "/view/index";
    }

    @GetMapping("dictionary")
    public String getResults(@RequestParam("search")String search, Model model) {
        model.addAttribute("search", search);
        return "/view/dictionary";
    }
}
