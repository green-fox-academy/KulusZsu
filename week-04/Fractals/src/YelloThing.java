import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YelloThing {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.

    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(0, 0, WIDTH, HEIGHT);
    graphics.drawLine(WIDTH / 3, 0, WIDTH / 3, WIDTH);
    graphics.drawLine(2 * (WIDTH / 3), 0, 2 * (WIDTH / 3), WIDTH);
    graphics.drawLine(0, HEIGHT / 3, HEIGHT, HEIGHT / 3);
    graphics.drawLine(0, 2 * (HEIGHT / 3), HEIGHT, 2 * (HEIGHT / 3));




  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
