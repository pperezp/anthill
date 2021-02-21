package cl.jhormiguero.model;

import java.awt.Graphics;

public class Ant extends Player {
    
    public int direction;
    private int width;
    private int height;
    
    public Ant(){
        direction = 0; // avanzar
        width = 15;
        height = 5;
    }
    
    @Override
    public void draw(Graphics graphics) {
        switch(direction){
            case 0:
                moveUp();
                break;
                
            case 1:
                moveRight();
                break;
                
            case 2:
                moveDown();
                break;
                
            case 3:
                moveLeft();
                break;
                
        }
        
        
        graphics.fillOval(getPosition().x, getPosition().y, width, height);
        System.out.println(getPosition());
    }

    @Override
    public void moveRight() {
        super.moveRight(); 
        width = 15;
        height = 5;
    }

    @Override
    public void moveLeft() {
        super.moveLeft(); 
        width = 15;
        height = 5;
    }

    @Override
    public void moveDown() {
        super.moveDown();
        width = 5;
        height = 15;
    }

    @Override
    public void moveUp() {
        super.moveUp(); 
        width = 5;
        height = 15;
    }
    
}
