import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        /* thinking about the lines
        right top corner
        graphics.drawLine(20, 0, 320, 20);
        graphics.drawLine(40, 0, 320, 40);
        graphics.drawLine(60, 0, 320, 60);
        graphics.drawLine(80, 0, 320, 80);
        graphics.drawLine(100, 0, 320, 100);
        and so on

        left down corner
        graphics.drawLine(0, 20, 20, 320);
        graphics.drawLine(0, 40, 40, 320);
        graphics.drawLine(0, 60, 60, 320);
        graphics.drawLine(0, 80, 80, 320);
        graphics.drawLine(0, 100, 100, 320);
        and so on

*/

            //top right where i=x
            for (int i = 20; i <= 315; i += 20) {
                        graphics.setColor(new Color(138,43,226));
                        graphics.drawLine(i, 5, 315, i);
            }
            //down left where j=y
            for (int j = 20; j <= 315; j +=20) {
                        graphics.setColor(Color.GREEN);
                        graphics.drawLine(5, j, j, 315);
            }

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
