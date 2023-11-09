import java.awt.*;

public class SingleRing {
    private int _x;
    private int _y;
    private int _width;
    private int _height;

    public SingleRing(int x, int y, int width, int height){
        _x =x;
        _y = y;
        _width = width;
        _height = height;
    }
    public void draw(Graphics g, Color color,){
        g.setColor(color);
        ((Graphics2D) g).setStroke(BasisStrock);
        g.drawOval(_x,_y,_width,_height);
    }
    public void draw(Graphics g){
        //g.setColor(color);
        //((Graphics2D) g).setStroke(BasisStrock);
        g.drawOval(_x,_y,_width,_height);
    }
}
