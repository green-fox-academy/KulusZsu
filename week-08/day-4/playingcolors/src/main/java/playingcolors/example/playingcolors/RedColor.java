package playingcolors.example.playingcolors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor{

  @Override
  public void printColor(){
    System.out.println("This is red color.");
  }
}
