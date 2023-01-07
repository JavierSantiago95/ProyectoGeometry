/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Grafo.pila2;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javie
 */
public class E extends javax.swing.JFrame {

    /**
     * Creates new form E
     */
    public E() {
        initComponents();
        this.setTitle("Sitio E");
        this.setResizable(false);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/2.png")).getImage();
        setIconImage(icon);
    }

     public E(char inicio) {
        initComponents();
        iluminar(inicio);
        this.setTitle("Sitio E");
        this.setResizable(false);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/2.png")).getImage();
        setIconImage(icon);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        Mundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ping.png"))); // NOI18N
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 136, -1, -1));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 98, -1, 20));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 136, -1, 20));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 193, -1, 20));

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, -1, 20));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 193, -1, -1));

        Mundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/E.png"))); // NOI18N
        Mundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MundoMouseClicked(evt);
            }
        });
        getContentPane().add(Mundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMouseClicked

        Es_Aqui ping_pong = new Es_Aqui();
        ping_pong.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_yMouseClicked

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        // TODO add your handling code here:

        iluminar('e');
    }//GEN-LAST:event_eMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        // TODO add your handling code here:

        iluminar('c');
    }//GEN-LAST:event_cMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        // TODO add your handling code here:

      iluminar('b');
    }//GEN-LAST:event_bMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked

        iluminar('a');
    }//GEN-LAST:event_aMouseClicked

    private void MundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MundoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MundoMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        // TODO add your handling code here:
        iluminar('d');
    }//GEN-LAST:event_dMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        Menu m = new Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void iluminar(char inicio) {

        Grafo g1 = new Grafo("abcdefghijklmnopqrstuvwxyz");

        char fin = 'y';

        g1.agregarRuta('a', 'b', 18);
        g1.agregarRuta('b', 'y', 10);
        g1.agregarRuta('b', 'c', 9);
        g1.agregarRuta('c', 'y', 5);
        g1.agregarRuta('b', 'd', 9);
        g1.agregarRuta('c', 'd', 12);
        g1.agregarRuta('d', 'e', 21);
        //*Y es la cafeteria y todos van pa' allá

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N

        pila2 = g1.Lista(inicio, fin);

        while (!pila2.isEmpty()) {
            char nombre = pila2.pop().id;
            switch (nombre) {
                case 'a':
                    a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'b':
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'c':
                    c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'd':
                    d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'e':
                    e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'y':
                    y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N
                    break;
            }
        }

    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mundo;
    public javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
