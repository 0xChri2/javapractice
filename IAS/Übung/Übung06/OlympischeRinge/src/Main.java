import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Olympia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ringpanel panel = new Ringpanel();
        panel.rings.add(new SingleRing(10, 100, 40, 40));
        panel.colors.add(Color.RED);
        panel.rings.add(new SingleRing(30, 120, 40, 40));
        panel.colors.add(Color.YELLOW);
        panel.rings.add(new SingleRing(50, 100, 40 ,40));
        panel.colors.add(Color.BLACK);
        panel.rings.add(new SingleRing(70, 120, 40 ,40));
        panel.colors.add(Color.GREEN);
        panel.ringsl = 5;
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}