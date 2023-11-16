package games.exapmles.tictactoe;

import games.basic.gameObjects.Oval;
import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class TicPanel {
    ArrayList<GameObject> tictactoe = new ArrayList<GameObject>();

    public boolean add(GameObject elem){
        return GameObject.add(elem);
    }

}
