import javax.swing.*;
import java.awt.*;
import java.io.Closeable;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        JPanel Game = new Gamefield();
        frame.add(Game,BorderLayout.CENTER);
        Game.setLayout(new GridLayout());
        Game.setSize(300,300);
        JButton A = new JButton("A");
        JButton B = new JButton("B");
        JPanel Buttons = new JPanel();
        frame.add(Buttons, BorderLayout.SOUTH);
        Buttons.add(A);
        Buttons.add(B);
    }
}