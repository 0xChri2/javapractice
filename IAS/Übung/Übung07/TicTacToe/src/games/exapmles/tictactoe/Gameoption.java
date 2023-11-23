package games.exapmles.tictactoe;

import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gameoption extends JPanel {
    private JButton button1;
    private JButton button2;

    public Gameoption() {
        button1 = new JButton("New Game");
        button2 = new JButton("Reset");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // New Game implementieren
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Füge die Buttons zum Panel hinzu
        add(button1);
        add(button2);
    }

}
