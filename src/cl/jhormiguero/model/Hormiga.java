package cl.jhormiguero.model;

import java.awt.Graphics;

public class Hormiga extends Personaje {
    
    public int direccion;
    private int width;
    private int height;
    
    public Hormiga(){
        direccion = 0; // avanzar
        
        width = 15;
        height = 5;
    }
    
    @Override
    public void dibujar(Graphics g) {
        switch(direccion){
            case 0:
                moverArriba();
                break;
                
            case 1:
                moverDerecha();
                break;
                
            case 2:
                moverAbajo();
                break;
                
            case 3:
                moverIzquierda();
                break;
                
        }
        
        
        g.fillOval(getPosicion().x, getPosicion().y, width, height);
        System.out.println(getPosicion());
    }

    @Override
    public void moverDerecha() {
        super.moverDerecha(); 
        width = 15;
        height = 5;
    }

    @Override
    public void moverIzquierda() {
        super.moverIzquierda(); 
        width = 15;
        height = 5;
    }

    @Override
    public void moverAbajo() {
        super.moverAbajo();
        width = 5;
        height = 15;
    }

    @Override
    public void moverArriba() {
        super.moverArriba(); 
        width = 5;
        height = 15;
    }
    
    
}
