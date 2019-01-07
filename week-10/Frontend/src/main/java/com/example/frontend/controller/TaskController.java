package com.example.frontend.controller;

import com.example.frontend.messages.ErrorMessage;
import com.example.frontend.model.AppendA;
import com.example.frontend.model.Doubling;
import com.example.frontend.model.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return new ErrorMessage("Please provide an input");
    }
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appending(@PathVariable(value = "appendable", required = false) String appendable) {
    return new AppendA(appendable);
  }
}
