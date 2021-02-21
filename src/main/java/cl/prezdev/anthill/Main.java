package cl.prezdev.anthill;

import cl.prezdev.anthill.view.MainFrame;

import javax.swing.*;

public class Main {
    public static void main( String[] args ){
        JFrame mainFrame = new JFrame("Main Frame");

        mainFrame.setContentPane(new MainFrame().getContainerPanel());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mainFrame.pack();
        mainFrame.setBounds(mainFrame.getX(), mainFrame.getY(), 800, 600);
        mainFrame.setVisible(true);
    }
}
