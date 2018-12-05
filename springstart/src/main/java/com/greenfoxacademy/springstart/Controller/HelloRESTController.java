package com.greenfoxacademy.springstart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  public Greeting greeting() {
    //Greeting greet = new Greeting(1, "Hello,");
    //return greet;
    return new Greeting(1, "First content");
  }
}
