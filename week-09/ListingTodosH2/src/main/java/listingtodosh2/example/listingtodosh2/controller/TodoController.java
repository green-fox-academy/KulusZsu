package listingtodosh2.example.listingtodosh2.controller;

import listingtodosh2.example.listingtodosh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  TodoController() {
  }

  @GetMapping("/todo")
  public String todo() {
    return "todolist";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    String string = "This is my first Todo";
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
