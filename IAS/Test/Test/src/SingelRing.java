import javax.swing.*;
import java.awt.*;

public class SingelRing extends JPanel {
    private int _x, _y, _widht, _height;
    private Color _color;

    public SingelRing(int x, int y, int widht, int height, Color color){
        _x = x;
        _y = y;
        _widht = widht;
        _height = height;
        _color = color;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(_color);
        g.drawOval(_x,_y,_widht,_height);
    }

}
