package games.exapmles.tictactoe;

import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.awt.*;

public class Gameoption extends JPanel {
    private JButton button1;
    private JButton button2;

    public Gameoption() {
        // Erstelle die Buttons
        button1 = new JButton("New Game");
        button2 = new JButton("Reset");

        // Füge die Buttons zum Panel hinzu
        add(button1);
        add(button2);
    }

}
