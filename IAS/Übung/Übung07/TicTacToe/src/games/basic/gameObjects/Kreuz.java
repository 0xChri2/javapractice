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
        g.drawLine(_x,_y + 100, _x + 100 , _y);
        g.drawLine(_x,_y, _x + 100,_y + 100);
        g.setColor(Color.BLACK);
    }
}
