import games.basic.gameObjects.Kreuz;
import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;
import games.exapmles.tictactoe.Gameoption;
import games.exapmles.tictactoe.TicPanel;
import jdk.jfr.consumer.RecordedClassLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        boolean win = false;



        TicPanel tictactoe = new TicPanel();
        JFrame frame = new JFrame("TicTactToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(300, 300);
        frame.add(tictactoe, BorderLayout.CENTER);
        frame.addKeyListener(new MyKeyListener());
        frame.setFocusable(true); // Fokus setzen
        frame.requestFocusInWindow(); // Fokus anfordern
        Gameoption Games = new Gameoption(tictactoe);
        frame.add(Games, BorderLayout.SOUTH);
        tictactoe.addMouseListener(new MouseAdapter() {
            int count = 1;
            @Override
            public void mouseClicked(MouseEvent e) {
                out.println(e);
                int x = ((int) (e.getX() / 100)) * 100;
                int y = ((int) (e.getY() / 100)) * 100;
                out.println(x);
                out.println(y);
                if((count % 2) == 0) {
                    if (tictactoe.getMatrix((int) (e.getX() / 100),(int) (e.getY() / 100)) == 0) {
                        tictactoe.add(new Kreuz(x, y, Color.RED));
                        tictactoe.setMatrix((int) (e.getX() / 100),(int) (e.getY() / 100),'X');
                        if (tictactoe.checkForThreeInARow( 'X') == true) {
                            System.out.println("X has WON");
                            exit(0);
                        }
                        count++;
                    } else {
                        System.out.println("This element is already taken.");
                    }

                }
                else {
                    if (tictactoe.getMatrix((int) (e.getX() / 100),(int) (e.getY() / 100)) == 0) {
                        tictactoe.add(new Oval(x, y, 100, 100, Color.RED));
                        tictactoe.setMatrix((int) (e.getX() / 100),(int) (e.getY() / 100),'Y');
                        if (tictactoe.checkForThreeInARow('Y') == true) {
                            System.out.println("Y has WON");
                            exit(0);
                        }
                        count++;
                    } else {
                        System.out.println("This element is already taken.");
                    }
                }
                tictactoe.repaint();
                if(count == 10){
                    System.out.println("Tie");
                    System.exit(0);
                }
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        tictactoe.setVisible(true);
    }


}

class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}