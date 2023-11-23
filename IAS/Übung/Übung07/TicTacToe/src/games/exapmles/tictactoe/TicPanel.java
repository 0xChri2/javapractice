package games.exapmles.tictactoe;

import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class TicPanel extends JPanel{
    ArrayList<GameObject> tictactoe = new ArrayList<GameObject>();

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



}
