package programmerfoxclub.example.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgrammerfoxclubController {

  public ProgrammerfoxclubController() {
  }

  @GetMapping("/")
  public String showOpeningPage() {
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }
}

