import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class RingPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.drawOval(100,100,100,100);
        g.drawOval(210,100,100,100);
        g.drawOval(160,150,100,100);
        g.drawOval(270,150,100,100);
        g.drawOval(320,100,100,100);
    }

}
