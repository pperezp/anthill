package cl.jhormiguero.model;

import cl.jhormiguero.model.interfaces.Animable;
import cl.jhormiguero.model.interfaces.Dibujable;
import java.awt.Graphics;
import java.awt.Point;

public class Personaje implements Dibujable, Animable{
    private Point posicion;
    
    public Personaje(){
        this.posicion = new Point(200, 200);
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

    @Override
    public void dibujar(Graphics g) {
        g.fillOval(posicion.x, posicion.y, 15, 5);
        System.out.println(posicion);
    }
}
