package cl.jhormiguero.model;

import java.awt.Graphics2D;

public class Hormiga extends Personaje {

    @Override
    public void dibujar(Graphics2D g) {
        g.fillOval(getPosicion().x, getPosicion().y, 5, 5);
    }

}
