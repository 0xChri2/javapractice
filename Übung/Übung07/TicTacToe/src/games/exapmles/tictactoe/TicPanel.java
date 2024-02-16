package games.exapmles.tictactoe;

import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class TicPanel extends JPanel{
    ArrayList<GameObject> tictactoe = new ArrayList<GameObject>();
    private static char[][] matrix = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
    };

    public TicPanel() {
    }
    @Override
    public void paintComponent(Graphics g) {
        for(GameObject elm : tictactoe){
            elm.paintComponent(g);
        }
        g.drawLine(100,0,100,this.getHeight());
        g.drawLine(200,0,200,300);
        g.drawLine(300,0,300,300);
        g.drawLine(0,100,300,100);
        g.drawLine(0,200,300,200);
        g.drawLine(0,300,300,300);
    }

    public void add(GameObject obj){
        tictactoe.add(obj);
    }

    public int getMatrix(int x, int y){
        return matrix[x][y];
    }

    public void setMatrix(int x, int y, char c){
        matrix[x][y] = c;
    }

    public void newgame(){
        for(int i = 0; i < 3; i++){
            for(int j = 0;j< 3;j++){
                matrix[i][j] = 0;
            }
        }
        tictactoe.clear();
        repaint();
    }

    public static boolean checkForThreeInARow( int targetValue) {
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
