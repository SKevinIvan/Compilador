/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author kevin2
 */
public class VtnAcercaDe extends javax.swing.JDialog {

    /**
     * Creates new form AcercaDe
     * @param parent designa a quien esta heredando la ventana
     * @param modal es un booleano que dice que si se mueve el cursor a otra parte este tendra que cerrarse esta ventana para que se pueda ver otra parte
     */
    public VtnAcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Acerca de");
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/proyecto.png"));
        this.setIconImage(icono);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegacion = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSButton9 = new rojeru_san.RSButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNavegacion.setBackground(new java.awt.Color(162, 217, 245));
        panelNavegacion.setPreferredSize(new java.awt.Dimension(1436, 900));
        panelNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyecto (3).png"))); // NOI18N
        panelNavegacion.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 83, 102));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Compilador CS-DOS");
        panelNavegacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 390, 91));

        rSButton9.setBackground(new java.awt.Color(0, 51, 102));
        rSButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Vote_24px_1.png"))); // NOI18N
        rSButton9.setText("Aceptar");
        rSButton9.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton9.setIconTextGap(15);
        rSButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton9ActionPerformed(evt);
            }
        });
        panelNavegacion.add(rSButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 131, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Siles Robles Alondra Veronica");
        panelNavegacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 120, 370, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Sanchez Valdin Kevin Ivan");
        panelNavegacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 163, 390, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton9ActionPerformed
       this.dispose();
    }//GEN-LAST:event_rSButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(VtnAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VtnAcercaDe dialog = new VtnAcercaDe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel panelNavegacion;
    private rojeru_san.RSButton rSButton9;
    // End of variables declaration//GEN-END:variables
}

