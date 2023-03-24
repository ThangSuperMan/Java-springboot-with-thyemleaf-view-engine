package com.thymeleaf.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.ModelMap;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String index(ModelMap model)  {
    model.addAttribute("message", "<h3>Hello template</h3>");

    return "hello";
  }

}
