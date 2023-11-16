import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;
import games.exapmles.tictactoe.TicPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TicPanel tictactoe = new TicPanel();
        JFrame frame = new JFrame("TicTactToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        

        frame.setVisible(true);
    }
}