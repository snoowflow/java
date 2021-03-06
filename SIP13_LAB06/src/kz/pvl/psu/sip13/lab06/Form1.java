/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pvl.psu.sip13.lab06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new MyPicture();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с графикой в JAVA!");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setToolTipText("Работа с графикой в Java");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 270);

        setSize(new java.awt.Dimension(326, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class MyPicture extends JPanel {

        Graphics2D canvas;   // Класс рисования
        BufferedImage buff;  // Буферное изображение
        int x = 430; // Константа размера полотна по х
        int y = 270; // Константа размера полотна по y

        public MyPicture() {

            buff = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
            canvas = (Graphics2D) buff.getGraphics();
            canvas.setPaint(Color.WHITE);
            canvas.fillRect(0, 0, x, y);
            canvas.setPaint(Color.BLACK);
            canvas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
            canvas.drawString("Java!", 90, 50);
            canvas.setPaint(Color.BLACK);
            canvas.drawOval(126, 89, 40, 13);
            canvas.drawOval(126, 90, 39, 16);
            canvas.drawRect(141, 105, 10, 40);
            canvas.drawOval(149, 108, 5, 2);
            canvas.drawOval(149, 112, 5, 2);
            canvas.drawLine(141, 144, 145, 139);
            canvas.drawLine(145, 139, 146, 151);
            canvas.drawLine(146, 151, 141, 144);
            canvas.drawLine(147, 139, 146, 151);
            canvas.drawLine(151, 144, 147, 139);
            canvas.drawLine(146, 151, 151, 145);                       
            canvas.drawRect(1, 200, 317, 59);
            canvas.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
            canvas.drawString("ШАХОВ И.П.-13", 45, 240);
            try {
                fill(148, 108, Color.WHITE, Color.GRAY);
                fill(139, 104, Color.WHITE, Color.GRAY);
                fill(11, 210, Color.WHITE, Color.GRAY);
                fill(135, 97, Color.WHITE, Color.GRAY);
            } catch (Exception ex) {
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(buff, 0, 0, this);
        }

        private void fill(int x, int y, Color bgcolor, Color color) throws Exception {
            ArrayList<Point> point = new ArrayList<>();
            point.add(new Point(x, y));
            Color oldColor = canvas.getColor();
            canvas.setPaint(color);
            while (point.size() > 0) {
                Point p = point.remove(0);
                x = p.x;
                y = p.y;
                if (bgcolor.getRGB() == buff.getRGB(x, y)) {
                    canvas.drawLine(x, y, x, y);
                    point.add(new Point(x + 1, y));
                    point.add(new Point(x - 1, y));
                    point.add(new Point(x, y + 1));
                    point.add(new Point(x, y - 1));
                }
            }
            canvas.setPaint(oldColor);
            repaint();
        }
    }
}
