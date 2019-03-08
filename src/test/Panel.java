package test;

import cl.jhormiguero.model.Hormiga;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
    public Hormiga hormiga;
    
    public Panel(){
        hormiga = new Hormiga();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        hormiga.dibujar(g);
    }
    
}
