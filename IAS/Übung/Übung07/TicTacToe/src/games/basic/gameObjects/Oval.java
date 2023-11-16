package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;

import java.awt.*;

public class Oval implements GameObject {
    public void paintComponent(Graphics g){
        g.drawOval(0,0,10,10);
    }
    public void paintComponent(Graphics g, int x, int y, int width, int height){
        g.drawOval(x,y,width,height);
    }
}
