package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;

import java.awt.*;

public class Kreuz implements GameObject {
    protected int _x,_y;
    protected Color _color;
    public Kreuz(int x, int y, Color color){
        _x = x;
        _y = y;
        _color = color;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(_color);
        g.drawLine(_x,_y+10, _x+10, _y+10);
        g.drawLine(_x,_y-10,_x,_y+10);
    }
}
