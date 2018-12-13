package usefulutilities.example.usefulutilities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsefulUtilitiesController {

  public UsefulUtilitiesController() {
  }

  @RequestMapping(path = "/useful", method = RequestMethod.GET)
  public String usefulUtilities(Model model) {
    model.addAttribute("useful");
    return "useful";
  }

  @RequestMapping(path = "/useful/colored", method = RequestMethod.GET)
  public String utilityService(Model model) {
    model.addAttribute("colored");
    return "colored";
  }

  @RequestMapping(path = "/useful/email", method = RequestMethod.GET)
  public String validateEmail(Model model) {
    model.addAttribute("email");
    return  "email";
  }
}
