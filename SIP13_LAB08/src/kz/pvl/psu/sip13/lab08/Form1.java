/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pvl.psu.sip13.lab08;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Tor
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
    }
    javax.swing.Timer jTimer1 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.y <= 190) {
                ++p.y;

            } else {
                jTimer1.stop();
                jTimer2.start();
            }
            jLabel1.setLocation(p);
            if (p.x == -50 && p.y == 190) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Right.png"))));
            }
        }
    });

    javax.swing.Timer jTimer2 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();

            if (p.x <= 80) {
                ++p.x;

            } else {
                jTimer2.stop();
                jTimer3.start();
            }
            jLabel1.setLocation(p);
            if (p.x == 80) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Down.png"))));
            }
        }
    });
    javax.swing.Timer jTimer3 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.y <= 240) {
                ++p.y;
            } else {
                jTimer3.stop();
                jTimer4.start();
            }
            jLabel1.setLocation(p);
            if (p.y == 240) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Right.png"))));
            }
        }
    });
    javax.swing.Timer jTimer4 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.x <= 510) {
                ++p.x;
            } else {
                jTimer4.stop();
                jTimer5.start();
            }
            jLabel1.setLocation(p);
            if (p.x == 510) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Up.png"))));
            }
        }
    });
    javax.swing.Timer jTimer5 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.y >= -10) {
                --p.y;
            } else {
                jTimer5.stop();
                jTimer6.start();
            }
            jLabel1.setLocation(p);
            if (p.y == -10) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Left.png"))));
            }
        }
    });
    javax.swing.Timer jTimer6 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.x >= 330) {
                --p.x;
            } else {
                jTimer6.stop();
                jTimer7.start();
            }
            jLabel1.setLocation(p);
            if (p.x == 330) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Down.png"))));
            }
        }
    });
    javax.swing.Timer jTimer7 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.y <= 80) {
                ++p.y;
            } else {
                jTimer7.stop();
                jTimer8.start();
            }
            jLabel1.setLocation(p);
            if (p.y == 80) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Left.png"))));
            }
        }
    });
    javax.swing.Timer jTimer8 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.x >= 150) {
                --p.x;
            } else {
                jTimer8.stop();
                jTimer9.start();
            }
            jLabel1.setLocation(p);
            if (p.x == 150) {
                jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Up.png"))));
            }
        }
    });
    javax.swing.Timer jTimer9 = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            Point p = jLabel1.getLocation();
            if (p.y >= 40) {
                --p.y;
            } else {
                jTimer9.stop();

            }
            jLabel1.setLocation(p);
        }
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с таймерами Swing в Java");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/pvl/psu/sip13/lab08/Down.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, 50, 160, 80);

        jButton1.setText("Старт");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 260, 130, 23);

        jButton2.setText("Выход");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 290, 130, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/pvl/psu/sip13/lab08/Снимок экрана (6).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 310);

        setSize(new java.awt.Dimension(635, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel1.setLocation(-50, 50);
        jLabel1.setIcon(new ImageIcon(Form1.class.getResource(("Down.png"))));
        jTimer1.start();
        jTimer2.stop();
        jTimer3.stop();
        jTimer4.stop();
        jTimer5.stop();
        jTimer6.stop();
        jTimer7.stop();
        jTimer8.stop();
        jTimer9.stop();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
