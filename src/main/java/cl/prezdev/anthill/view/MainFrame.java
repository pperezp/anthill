package cl.prezdev.anthill.view;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame {
    private JScrollPane scrollPane;
    private Panel panel;

    public MainFrame(){
        this.panel = new Panel();

        scrollPane.setViewportView(panel);

        new Thread(() -> {
            while (true) {
                try {
                    panel.repaint();
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        // hilo que pinta la ant
        new Thread(() -> {
            int cont = 0;

            while (true) {
                try {
                    cont++;

                    if (cont == (30 * 5)) {
                        cont = 0;

                        panel.ant.direction = new Random().nextInt(4);
                    }

                    System.out.println("asd");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();


    }

    public Container getContainerPanel() {
        return scrollPane;
    }
}
