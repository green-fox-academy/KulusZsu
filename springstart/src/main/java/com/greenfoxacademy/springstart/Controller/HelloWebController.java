package com.greenfoxacademy.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {
  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World blabla");
    return "greeting";
  }
}
