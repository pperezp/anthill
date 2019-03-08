package cl.jhormiguero.model;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Juego extends JPanel{
    public Hormiga hormiga;
    
    public Juego(){
        hormiga = new Hormiga();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        hormiga.dibujar(g);
    }
    
}
