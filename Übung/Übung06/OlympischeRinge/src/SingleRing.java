import java.awt.*;

public class SingleRing {
    private int _x;
    private int _y;
    private int _width;
    private int _height;

    private Color _color;
    BasicStroke _Basestrocke;

    public SingleRing(int x, int y, int width, int height, Color color, BasicStroke Basestrocke){
        _x =x;
        _y = y;
        _width = width;
        _height = height;
        _color = color;
        _Basestrocke = Basestrocke;
    }
    public void draw(Graphics g){
        g.setColor(_color);
        ((Graphics2D) g).setStroke(_Basestrocke);
        g.drawOval(_x,_y,_width,_height);
    }
}
