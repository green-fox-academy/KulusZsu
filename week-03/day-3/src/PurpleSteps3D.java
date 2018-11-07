import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {

        //based the picture on Github

        int n = 10;
        for (int i = 10; i < 70; i+=10) {
            int a = i;
            drawRect(graphics, a, n);
            n += i;
        }
    }
    public static void drawRect(Graphics graphics, int a, int n) {
        graphics.setColor(new Color(153, 50, 204));
        graphics.fillRect(n, n, a, a);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(n, n, a, a);

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