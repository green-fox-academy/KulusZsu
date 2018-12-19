package conwithmysql.example.conwithmysql;

import conwithmysql.example.conwithmysql.model.Todo;
import conwithmysql.example.conwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConwithmysqlApplication implements CommandLineRunner{

  public static void main(String[] args) {
    SpringApplication.run(ConwithmysqlApplication.class, args);
  }

  private TodoRepository todoRepository;

  @Autowired
  public ConwithmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day", true, true));
    todoRepository.save(new Todo("Finish H2 workshop 1"));
    todoRepository.save(new Todo("Do Xmas shopping", true, true));
    todoRepository.save(new Todo("Go to New Year's Party"));
  }
}

