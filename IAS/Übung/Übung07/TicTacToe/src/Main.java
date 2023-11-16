import games.basic.gameObjects.Kreuz;
import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;
import games.exapmles.tictactoe.TicPanel;
import jdk.jfr.consumer.RecordedClassLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean win = false;


        TicPanel tictactoe = new TicPanel();
        JFrame frame = new JFrame("TicTactToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(tictactoe);
        tictactoe.addMouseListener(new MouseAdapter() {
            int count = 1;
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e);
                int x = ((int) (e.getX() / 100)) * 100;
                int y = ((int) (e.getY() / 100)) * 100;
                System.out.println(x);
                System.out.println(y);
                if((count % 2) == 0) {
                    tictactoe.add(new Kreuz(x, y, Color.RED));
                }
                else {
                    tictactoe.add(new Oval(x, y, 100,100,Color.RED));
                }
                tictactoe.repaint();
                count++;
            }
        });

        GameObject Kreuz1 = new Kreuz(100,100, Color.RED);
        GameObject Oval1 = new Oval(0, 0, 100, 100, Color.RED);
        tictactoe.add(Oval1);

        tictactoe.add(Kreuz1);
        frame.setVisible(true);
        tictactoe.setVisible(true);
    }
}