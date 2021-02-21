package test;

import cl.jhormiguero.model.Ant;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
    public Ant ant;
    
    public Panel(){
        ant = new Ant();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        ant.draw(g);
    }
    
}
