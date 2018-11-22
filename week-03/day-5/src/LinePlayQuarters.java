import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters{

    public static void quarters(Graphics graphics, int a, int b) {

        for (int i = 10; i <= HEIGHT/2-5; i += 10) {
            graphics.setColor(new Color(138, 43, 226));
            graphics.drawLine(i+a, 5+b, HEIGHT/2-5+a, i+b);
        }
        for (int j = 10; j <= HEIGHT/2-5; j += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(5+a, j+b, j+a, HEIGHT/2-5+b);
        }
    }

    public static void mainDraw(Graphics graphics) {

            quarters(graphics, 160, 0);
            quarters(graphics, 0, 0);
            quarters(graphics, 0, 160);
            quarters(graphics, 160, 160);
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

