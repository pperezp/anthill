package cl.prezdev.anthill.model;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter @Setter
public class Player implements Drawable, Movable {
    private Point position;

    public Player(){
        this.position = new Point(200, 200);
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
    public void draw(Graphics graphics) {
        graphics.fillOval(position.x, position.y, 15, 5);
        System.out.println(position);
    }
}
