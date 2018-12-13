package playingcolors.example.playingcolors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor{

  @Override
  public void printColor(){
    System.out.println("This is blue color.");
  }
}
