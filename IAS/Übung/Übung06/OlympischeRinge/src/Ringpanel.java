import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ringpanel extends JPanel{
    public ArrayList<SingleRing> rings = new ArrayList<>();
    public void paintComponent(Graphics g){
        g.setColor(Color.BLUE);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.drawOval(10, 100, 40, 40);

        g.setColor(Color.YELLOW);
        g.drawOval(30, 120, 40, 40);

        g.setColor(Color.BLACK);
        g.drawOval(50, 100, 40 ,40);

        g.setColor(Color.GREEN);
        g.drawOval(70, 120, 40 ,40);

        //SingleRing(g, Color.RED, new BasicStroke(3), 90, 100, 40, 40);
        for (SingleRing ring : rings) {
            ring.draw(g);
        }
    }
    public void SingleRing2(Graphics g, Color color, BasicStroke BasisStrock, int x, int y, int width, int height){
        g.setColor(color);
        ((Graphics2D) g).setStroke(BasisStrock);
        g.drawOval(x,y,width,height);
    }
}
