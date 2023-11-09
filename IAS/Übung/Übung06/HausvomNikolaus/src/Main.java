import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        Hauspanel haus = new Hauspanel();
        frame.add(haus);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}