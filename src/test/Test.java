package test;

import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class Test extends javax.swing.JFrame {
    private Panel panel;

    public Test() {
        initComponents();

        panel = new Panel();
        scroll.setViewportView(panel);

        new Thread(() -> {
            while (true) {
                try {
                    panel.repaint();
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        this.getRootPane().getInputMap(JRootPane.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0), "avanzar");
        this.getRootPane().getInputMap(JRootPane.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0), "retro");

        this.getRootPane().getActionMap().put("avanzar", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.avanzar();
            }
        });

        this.getRootPane().getActionMap().put("retro", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.retroceder();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scrollKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scrollKeyPressed

    }//GEN-LAST:event_scrollKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
