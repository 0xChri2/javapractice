import javax.swing.*;
import java.awt.*;

public class Hauspanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.drawLine(10, 100, 100, 100);
        g.drawLine(100, 200, 100 , 100);
        g.drawLine(100, 200, 10,100);
        g.drawLine(10,200, 10, 100 );
        g.drawLine(10, 200, 100, 200);
        g.drawLine(10, 200, 100, 100);

        //Dreieck
        int[] xPoints = {10, 55, 100}; // x-Koordinaten der Dreieck-Ecken
        int[] yPoints = {100, 50, 100}; // y-Koordinaten der Dreieck-Ecken
        Polygon triangle = new Polygon(xPoints, yPoints, 3); // Dreieck-Polygon erstellen
        g.drawPolygon(triangle);
    }
}
