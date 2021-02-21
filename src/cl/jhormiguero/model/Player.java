package cl.jhormiguero.model;

import java.awt.Graphics;
import java.awt.Point;
import cl.jhormiguero.model.interfaces.Drawable;
import cl.jhormiguero.model.interfaces.Animatable;

public class Player implements Drawable, Animatable{
    private Point position;
    
    public Player(){
        this.position = new Point(200, 200);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    @Override
    public void moveUp() {
        this.position.y += 1;
    }

    @Override
    public void moveDown() {
        this.position.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.position.x -= 1;
    }

    @Override
    public void moveRight() {
        this.position.x += 1;
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(position.x, position.y, 15, 5);
        System.out.println(position);
    }
}
