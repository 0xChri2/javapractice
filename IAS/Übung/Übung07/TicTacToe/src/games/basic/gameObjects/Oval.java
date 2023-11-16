package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;

import java.awt.*;

public class Oval implements GameObject {
    protected int _x,_y,_width,_height;
    protected Color _color;
    public Oval( int x, int y, int width, int height, Color color){
        _x = x;
        _y =y;
        _width = width;
        _height = height;
        _color = color;
    }
    public void paintComponent(Graphics g){
        g.drawOval(_x,_y,10,10);
    }

}
