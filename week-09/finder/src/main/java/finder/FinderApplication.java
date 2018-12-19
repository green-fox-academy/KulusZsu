package finder;

import finder.model.User;
import finder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinderApplication implements CommandLineRunner {

  @Autowired
  UserService service;

  public static void main(String[] args) {
    SpringApplication.run(FinderApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    User user1 = new User();
    service.save(user1);
  }
}
