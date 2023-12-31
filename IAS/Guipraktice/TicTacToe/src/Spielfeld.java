import javax.swing.*;
import java.awt.*;

public class Spielfeld extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        g.drawLine(100,0,100,300);
        g.drawLine(200, 0, 200,300);
        g.drawLine(0, 100, 300,100);
        g.drawLine(0,200,300,200 );
    }
}
