package com.greenfoxacademy.csomam.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @RequestMapping("")
    public String indexPage(){
        return "index";
    }
}