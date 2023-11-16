import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;
import games.exapmles.tictactoe.TicPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean win = false;
        int count = 1;

        TicPanel tictactoe = new TicPanel();
        JFrame frame = new JFrame("TicTactToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        do {

            GameObject Oval1 = new Oval(0, 0, 100, 100, Color.RED);
            tictactoe.add(Oval1);

            frame.add(tictactoe);
            tictactoe.setVisible(true);
            frame.setVisible(true);
        }while (!win);
    }
}