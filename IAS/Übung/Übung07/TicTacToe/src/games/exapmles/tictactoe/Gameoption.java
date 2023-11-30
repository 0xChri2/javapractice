package games.exapmles.tictactoe;

import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gameoption extends JPanel {
    private JButton button1;
    private JButton button2;
    private TicPanel ticPanel;  // Referenz auf TicPanel

    public Gameoption(TicPanel ticPanel) {
        this.ticPanel = ticPanel;  // Speichere die Referenz

        button1 = new JButton("New Game");
        button2 = new JButton("Reset");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticPanel.newgame();  // Rufe die newgame-Methode auf dem TicPanel auf
                ticPanel.repaint();  // Aktualisiere das Panel nach dem Neustart
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
