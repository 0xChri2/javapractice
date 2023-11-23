import games.basic.gameObjects.Kreuz;
import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;
import games.exapmles.tictactoe.Gameoption;
import games.exapmles.tictactoe.TicPanel;
import jdk.jfr.consumer.RecordedClassLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        boolean win = false;
        char[][] matrix = new char[3][3];
        // Werte zuweisen
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 0;



        TicPanel tictactoe = new TicPanel();
        JFrame frame = new JFrame("TicTactToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(tictactoe, BorderLayout.CENTER);
        Gameoption Games = new Gameoption();
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
                    tictactoe.add(new Kreuz(x, y, Color.RED));
                    matrix[(int)(e.getX()/100)][(int)(e.getY()/100)] = 'X';
                    if(checkForThreeInARow(matrix, 'X') == true){
                        System.out.println("X has WON");
                        exit(0);
                    }

                }
                else {
                    tictactoe.add(new Oval(x, y, 100,100,Color.RED));
                    matrix[(int)(e.getX()/100)][(int)(e.getY()/100)] = 'Y';
                    if(checkForThreeInARow(matrix, 'Y') == true){
                        System.out.println("Y has WON");
                        exit(0);
                    }
                }
                tictactoe.repaint();
                count++;
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        tictactoe.setVisible(true);
    }

    private static boolean checkForThreeInARow(char[][] matrix, int targetValue) {
        // Überprüfung in den Zeilen
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length - 3; j++) {
                if (matrix[i][j] == targetValue && matrix[i][j + 1] == targetValue && matrix[i][j + 2] == targetValue) {
                    return true;
                }
            }
        }

        // Überprüfung in den Spalten
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i <= matrix.length - 3; i++) {
                if (matrix[i][j] == targetValue && matrix[i + 1][j] == targetValue && matrix[i + 2][j] == targetValue) {
                    return true;
                }
            }
        }

        // Überprüfung in den Diagonalen (von links oben nach rechts unten)
        for (int i = 0; i <= matrix.length - 3; i++) {
            for (int j = 0; j <= matrix[i].length - 3; j++) {
                if (matrix[i][j] == targetValue && matrix[i + 1][j + 1] == targetValue && matrix[i + 2][j + 2] == targetValue) {
                    return true;
                }
            }
        }

        // Überprüfung in den Diagonalen (von links unten nach rechts oben)
        for (int i = 2; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[i].length - 3; j++) {
                if (matrix[i][j] == targetValue && matrix[i - 1][j + 1] == targetValue && matrix[i - 2][j + 2] == targetValue) {
                    return true;
                }
            }
        }

        // Keine drei aufeinanderfolgenden Werte gefunden
        return false;
    }
}
