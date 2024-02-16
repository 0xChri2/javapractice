import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        JFrame Frame = new JFrame("Test");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Frame.setSize(800,800);
        //JPanel Panel = new RingPanel();
        //Frame.add(Panel);
        ArrayList<SingelRing> rings = new ArrayList<>();
        rings.add(new SingelRing(100,100,100,100, Color.BLUE));
        rings.add(new SingelRing(210,100,100,100, Color.BLUE));
        rings.add(new SingelRing(160,150,100,100, Color.BLUE));
        rings.add(new SingelRing(270,150,100,100, Color.BLUE));
        rings.add(new SingelRing(320,100,100,100, Color.BLUE));
        for(SingelRing ring: rings){
            Frame.add(ring);
        }

        Frame.setVisible(true);

    }
}