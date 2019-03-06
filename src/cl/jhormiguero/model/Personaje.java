package cl.jhormiguero.model;

import cl.jhormiguero.model.interfaces.Animable;
import cl.jhormiguero.model.interfaces.Dibujable;
import java.awt.Point;

public abstract class Personaje implements Dibujable, Animable{
    private Point posicion;
    
    public Personaje(){
        this.posicion = new Point(0, 0);
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public void moverArriba() {
        this.posicion.y += 1;
    }

    @Override
    public void moverAbajo() {
        this.posicion.y -= 1;
    }

    @Override
    public void moverIzquierda() {
        this.posicion.x -= 1;
    }

    @Override
    public void moverDerecha() {
        this.posicion.x += 1;
    }
}
