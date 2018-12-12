package bankofsimba.example.demo.controller;

import bankofsimba.example.demo.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  private List<BankAccount> bankAccountList = new ArrayList<>();

  public BankAccountController() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion", false));
    bankAccountList.add(new BankAccount("KingKong", 1500, "monkey", true));
    bankAccountList.add(new BankAccount("Bagira", 340, "panther", false));
    bankAccountList.add(new BankAccount("Ka", 1340, "snake", false));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccount(Model model) {
    model.addAttribute("accounts", bankAccountList);
    return "show";
  }

  @RequestMapping(path = "/text", method = RequestMethod.GET)
  public String displayTestEnjoy(Model model, String text) {
    text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }

  @RequestMapping(path = "/banks", method = RequestMethod.GET)
  public String displayBanks(Model model) {
    model.addAttribute("banks", bankAccountList);
    return "banks";
  }
}
