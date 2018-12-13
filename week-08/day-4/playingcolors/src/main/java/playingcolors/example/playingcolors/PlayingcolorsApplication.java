package playingcolors.example.playingcolors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayingcolorsApplication implements CommandLineRunner {

  @Qualifier("blue")
  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(PlayingcolorsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception{
    myColor.printColor();
  }
}

