package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;

import java.awt.*;

public class Kreuz implements GameObject {

    @Override
    public void paintComponent(Graphics g) {

    }

    public void paintComponent(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawLine(x,y+10, x+10, y+10);
        g.drawLine(x,y-10,x,y+10);
    }
}
