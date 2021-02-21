package cl.prezdev.anthill.view;

import cl.prezdev.anthill.model.Ant;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Ant ant;

    public Panel(){
        ant = new Ant();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        ant.draw(graphics);
    }

}
