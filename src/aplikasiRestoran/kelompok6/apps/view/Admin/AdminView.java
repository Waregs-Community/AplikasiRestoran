package aplikasiRestoran.kelompok6.apps.view.Admin;

import aplikasiRestoran.kelompok6.apps.controller.AdminController;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminView extends javax.swing.JFrame {

    AdminController controller;
    DataMakananView dataMakananView;
    DataMinumanView dataMinumanView;
    DataTransaksiView dataTransaksiView;
    TentangKamiView tentangKamiView;
    
    public AdminView() {
        
        controller = new AdminController();
        dataMakananView = new DataMakananView();
        dataMinumanView = new DataMinumanView();
        dataTransaksiView = new DataTransaksiView();
        tentangKamiView = new TentangKamiView();
        
        controller.setDataMakananView(dataMakananView);
        controller.setDataMinumanView(dataMinumanView);
        controller.setDataTransaksiView(dataTransaksiView);
        controller.setTentangKamiView(tentangKamiView);
        
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public JPanel getPanelHome() {
        return panelHome;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        masterPanel = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        iconBrand = new javax.swing.JLabel();
        btnDataMakanan = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnDataMinuman = new javax.swing.JLabel();
        btnDataTransaksi = new javax.swing.JLabel();
        btnTentang = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ADMIN");
        getContentPane().setLayout(new java.awt.CardLayout());

        masterPanel.setBackground(new java.awt.Color(192, 57, 42));
        masterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(192, 57, 42));
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelMenu.setPreferredSize(new java.awt.Dimension(200, 590));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/icon/brand_126 x116.png"))); // NOI18N
        panelMenu.add(iconBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, -1, -1));

        btnDataMakanan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDataMakanan.setForeground(new java.awt.Color(255, 255, 255));
        btnDataMakanan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/food.png"))); // NOI18N
        btnDataMakanan.setText("Data Makanan");
        btnDataMakanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataMakananMouseClicked(evt);
            }
        });
        panelMenu.add(btnDataMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, -1));

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        panelMenu.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        btnDataMinuman.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDataMinuman.setForeground(new java.awt.Color(255, 255, 255));
        btnDataMinuman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataMinuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/drink.png"))); // NOI18N
        btnDataMinuman.setText("Data Minuman");
        btnDataMinuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataMinuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataMinumanMouseClicked(evt);
            }
        });
        panelMenu.add(btnDataMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, -1));

        btnDataTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDataTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnDataTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/transaction.png"))); // NOI18N
        btnDataTransaksi.setText("Data Transaksi");
        btnDataTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataTransaksiMouseClicked(evt);
            }
        });
        panelMenu.add(btnDataTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, -1));

        btnTentang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTentang.setForeground(new java.awt.Color(255, 255, 255));
        btnTentang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/about.png"))); // NOI18N
        btnTentang.setText("Tentang Kami");
        btnTentang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTentangMouseClicked(evt);
            }
        });
        panelMenu.add(btnTentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, -1));

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/logout.png"))); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenu.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, -1));

        masterPanel.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelMain.setBackground(new java.awt.Color(192, 57, 42));
        panelMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelMain.setPreferredSize(new java.awt.Dimension(1055, 590));
        panelMain.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(192, 57, 42));

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        panelMain.add(panelHome, "card2");

        masterPanel.add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(masterPanel, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        controller.Home(this);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnDataMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataMakananMouseClicked
        controller.dataMakanan(this);
    }//GEN-LAST:event_btnDataMakananMouseClicked

    private void btnDataMinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataMinumanMouseClicked
        controller.dataMinuman(this);
    }//GEN-LAST:event_btnDataMinumanMouseClicked

    private void btnDataTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataTransaksiMouseClicked
        controller.dataTransaksi(this);
    }//GEN-LAST:event_btnDataTransaksiMouseClicked

    private void btnTentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTentangMouseClicked
        controller.tentangKami(this);
    }//GEN-LAST:event_btnTentangMouseClicked

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDataMakanan;
    private javax.swing.JLabel btnDataMinuman;
    private javax.swing.JLabel btnDataTransaksi;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnTentang;
    private javax.swing.JLabel iconBrand;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
