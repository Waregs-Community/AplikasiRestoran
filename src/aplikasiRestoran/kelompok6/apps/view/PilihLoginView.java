package aplikasiRestoran.kelompok6.apps.view;

import aplikasiRestoran.kelompok6.apps.controller.LoginController;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class PilihLoginView extends javax.swing.JFrame {
    
private LoginController controller;

    public PilihLoginView() {
        initComponents();
        controller = new LoginController();
        
    }

    public JLabel getLblHiThere() {
        return lblHiThere;
    }

    public JLabel getLblLoginAs() {
        return lblLoginAs;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBody = new javax.swing.JPanel();
        iconBrand = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        PanelHiThere = new javax.swing.JPanel();
        PanelLoginAs = new javax.swing.JPanel();
        iconUser2 = new javax.swing.JLabel();
        lblLoginAs = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdmin = new javax.swing.JButton();
        btnPelanggan = new javax.swing.JButton();
        lblHiThere = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 57, 43));
        setPreferredSize(new java.awt.Dimension(750, 640));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBody.setBackground(new java.awt.Color(192, 57, 43));
        PanelBody.setPreferredSize(new java.awt.Dimension(750, 640));
        PanelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/brand.png"))); // NOI18N
        PanelBody.add(iconBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51), 5));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHiThere.setBackground(new java.awt.Color(192, 57, 43));
        PanelHiThere.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLoginAs.setBackground(new java.awt.Color(255, 255, 255));
        PanelLoginAs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/user (2).png"))); // NOI18N
        PanelLoginAs.add(iconUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        lblLoginAs.setBackground(new java.awt.Color(192, 57, 43));
        lblLoginAs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLoginAs.setForeground(new java.awt.Color(192, 57, 43));
        lblLoginAs.setText("Login as");
        PanelLoginAs.add(lblLoginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));
        PanelLoginAs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 370, 10));

        btnAdmin.setBackground(new java.awt.Color(192, 57, 43));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("ADMIN");
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        PanelLoginAs.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 100));

        btnPelanggan.setBackground(new java.awt.Color(192, 57, 43));
        btnPelanggan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        btnPelanggan.setText("PELANGGAN");
        btnPelanggan.setMaximumSize(new java.awt.Dimension(95, 33));
        btnPelanggan.setMinimumSize(new java.awt.Dimension(95, 33));
        btnPelanggan.setPreferredSize(new java.awt.Dimension(95, 33));
        btnPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPelangganMouseClicked(evt);
            }
        });
        PanelLoginAs.add(btnPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, 100));

        PanelHiThere.add(PanelLoginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 400, 430));

        lblHiThere.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHiThere.setForeground(new java.awt.Color(255, 255, 255));
        lblHiThere.setText("Hi There!");
        PanelHiThere.add(lblHiThere, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        Panel.add(PanelHiThere, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 520));

        PanelBody.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 440, 540));

        jPanel1.add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        controller.loginView();
        this.dispose();
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPelangganMouseClicked
    try {
        controller.tampilPelangganView();
    } catch (PelangganException ex) {
        Logger.getLogger(PilihLoginView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(PilihLoginView.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.dispose();
    }//GEN-LAST:event_btnPelangganMouseClicked

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
            java.util.logging.Logger.getLogger(PilihLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelHiThere;
    private javax.swing.JPanel PanelLoginAs;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JLabel iconBrand;
    private javax.swing.JLabel iconUser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHiThere;
    private javax.swing.JLabel lblLoginAs;
    // End of variables declaration//GEN-END:variables
}
