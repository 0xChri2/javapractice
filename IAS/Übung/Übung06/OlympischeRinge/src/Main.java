import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Olympia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ringpanel panel = new Ringpanel();
        panel.rings.add(new SingleRing(10, 100, 40, 40, Color.BLUE, new BasicStroke(3)));
        panel.rings.add(new SingleRing(30, 120, 40, 40, Color.YELLOW, new BasicStroke(3)));
        panel.rings.add(new SingleRing(50, 100, 40 ,40, Color.BLACK, new BasicStroke(3)));
        panel.rings.add(new SingleRing(70, 120, 40 ,40, Color.GREEN, new BasicStroke(3)));
        panel.rings.add(new SingleRing(90, 100, 40 ,40, Color.RED, new BasicStroke(3)));
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}