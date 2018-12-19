package conwithmysql.example.conwithmysql.controller;

import conwithmysql.example.conwithmysql.model.Todo;
import conwithmysql.example.conwithmysql.repository.TodoRepository;
import conwithmysql.example.conwithmysql.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
  private TodoServiceImpl todoService;

  @Autowired
  public TodoController(TodoServiceImpl todoService) {
    this.todoService = todoService;
  }

  private TodoRepository todoRepository;

/*
  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
*/

  @GetMapping("todo/list")
  public String list(Model model, @RequestParam(value="isActive", required = false) boolean isActive){
    if(isActive) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.getAllTodos());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String todoForm(Model model){
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/todo/add")
  public String saveTodo(@ModelAttribute("name") Todo todo){
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping ("/todo/{id}/delete")
  public String deleteElement (@PathVariable long id){
    todoService.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping ("/todo/{id}/edit")
  public String editForm (@PathVariable long id, Model model){
    model.addAttribute("todo", todoService.findTodo(id));
    return "edit";
  }

  @PostMapping ("/todo/{id}/edit")
  public String editElement (@ModelAttribute("name") Todo todo){
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }
}
