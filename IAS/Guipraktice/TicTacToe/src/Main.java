import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame Spiel = new JFrame("TicTacToe");
        Spiel.setLayout(new BorderLayout());
        JPanel TicPanel = new Spielfeld();
        Spiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Spiel.setVisible(true);
        Spiel.setSize(300,300);
        Spiel.add(TicPanel);
        TicPanel.setSize(300,300);
        //TicPanel.setLayout(new GridLayout(3, 3, 10, 10));
        JButton grid1 = new JButton("1");
        JButton grid2 = new JButton("2");
        JButton grid3 = new JButton("3");
        JButton grid4 = new JButton("4");
        JButton grid5 = new JButton("5");
        JButton grid6 = new JButton("6");
        JButton grid7 = new JButton("7");
        JButton grid8 = new JButton("8");
        JButton grid9 = new JButton("9");
        TicPanel.add(grid1, BoxLayout.X_AXIS);
        TicPanel.add(grid2, BoxLayout.X_AXIS);
        TicPanel.add(grid3, BoxLayout.X_AXIS);
        TicPanel.add(grid4, BoxLayout.Y_AXIS);
        TicPanel.add(grid5, BoxLayout.X_AXIS);
        TicPanel.add(grid6, BoxLayout.X_AXIS);
        TicPanel.add(grid7, BoxLayout.Y_AXIS);
        TicPanel.add(grid8, BoxLayout.X_AXIS);
        TicPanel.add(grid9, BoxLayout.X_AXIS);
    }
}