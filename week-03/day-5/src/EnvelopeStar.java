import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar{

    public static void envelope(Graphics graphics) {


        for (int i = 10; i <= HEIGHT/2-5; i += 10) {
            graphics.drawLine(i, 5+HEIGHT/2, HEIGHT/2-5, i+HEIGHT/2);


        }
    }

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
            envelope(graphics);
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


