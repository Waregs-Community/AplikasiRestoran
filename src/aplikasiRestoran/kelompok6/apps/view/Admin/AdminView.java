package aplikasiRestoran.kelompok6.apps.view.Admin;

import aplikasiRestoran.kelompok6.apps.controller.AdminController;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.model.HomeModel;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import aplikasiRestoran.kelompok6.apps.view.PilihLoginView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminView extends javax.swing.JFrame {

    AdminController controller;
    DataMakananView dataMakananView;
    DataMinumanView dataMinumanView;
    DataTransaksiView dataTransaksiView;
    TentangKamiView tentangKamiView;
    
    public AdminView() throws SQLException, AdminException {
        
        controller = new AdminController();
        dataMakananView = new DataMakananView();
        dataMinumanView = new DataMinumanView();
        dataTransaksiView = new DataTransaksiView();
        tentangKamiView = new TentangKamiView();
        HomeModel model = new HomeModel();
        
        controller.setDataMakananView(dataMakananView);
        controller.setDataMinumanView(dataMinumanView);
        controller.setDataTransaksiView(dataTransaksiView);
        controller.setTentangKamiView(tentangKamiView);
        
        initComponents();
        
        model.tampilDataHome(this);
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

    public JLabel getTxtTotalPenghasilan() {
        return txtTotalPenghasilan;
    }

    public JLabel getTxtTotalPenjualan() {
        return txtTotalPenjualan;
    }

    public JLabel getTxtTotalProduk() {
        return txtTotalProduk;
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
        Title = new javax.swing.JLabel();
        boxTotalPenghasilan = new javax.swing.JPanel();
        boxTitle2 = new javax.swing.JPanel();
        txtTitle2 = new javax.swing.JLabel();
        txtTotalPenghasilan = new javax.swing.JLabel();
        boxTotalPenjualan = new javax.swing.JPanel();
        boxTitle1 = new javax.swing.JPanel();
        txtTitle1 = new javax.swing.JLabel();
        txtTotalPenjualan = new javax.swing.JLabel();
        boxTotalProduk = new javax.swing.JPanel();
        boxTitle = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtTotalProduk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ADMIN");
        getContentPane().setLayout(new java.awt.CardLayout());

        masterPanel.setBackground(new java.awt.Color(192, 57, 42));
        masterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(192, 57, 42));
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelMenu.setPreferredSize(new java.awt.Dimension(200, 590));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/brand_126 x116.png"))); // NOI18N
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
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        panelMenu.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, -1));

        masterPanel.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelMain.setBackground(new java.awt.Color(192, 57, 42));
        panelMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelMain.setPreferredSize(new java.awt.Dimension(1055, 590));
        panelMain.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(192, 57, 42));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/home.png"))); // NOI18N
        Title.setText("Home");
        panelHome.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 40, 410, -1));

        boxTotalPenghasilan.setBackground(new java.awt.Color(192, 57, 42));
        boxTotalPenghasilan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        boxTotalPenghasilan.setPreferredSize(new java.awt.Dimension(250, 200));

        boxTitle2.setBackground(new java.awt.Color(255, 255, 255));

        txtTitle2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle2.setForeground(new java.awt.Color(192, 57, 42));
        txtTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle2.setText("Total Penghasilan");

        javax.swing.GroupLayout boxTitle2Layout = new javax.swing.GroupLayout(boxTitle2);
        boxTitle2.setLayout(boxTitle2Layout);
        boxTitle2Layout.setHorizontalGroup(
            boxTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTitle2Layout.setVerticalGroup(
            boxTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTotalPenghasilan.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotalPenghasilan.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPenghasilan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPenghasilan.setText("10");

        javax.swing.GroupLayout boxTotalPenghasilanLayout = new javax.swing.GroupLayout(boxTotalPenghasilan);
        boxTotalPenghasilan.setLayout(boxTotalPenghasilanLayout);
        boxTotalPenghasilanLayout.setHorizontalGroup(
            boxTotalPenghasilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(boxTotalPenghasilanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalPenghasilan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTotalPenghasilanLayout.setVerticalGroup(
            boxTotalPenghasilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTotalPenghasilanLayout.createSequentialGroup()
                .addComponent(boxTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtTotalPenghasilan)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelHome.add(boxTotalPenghasilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        boxTotalPenjualan.setBackground(new java.awt.Color(192, 57, 42));
        boxTotalPenjualan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        boxTotalPenjualan.setPreferredSize(new java.awt.Dimension(250, 200));

        boxTitle1.setBackground(new java.awt.Color(255, 255, 255));

        txtTitle1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle1.setForeground(new java.awt.Color(192, 57, 42));
        txtTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle1.setText("Total Transaksi Penjualan");

        javax.swing.GroupLayout boxTitle1Layout = new javax.swing.GroupLayout(boxTitle1);
        boxTitle1.setLayout(boxTitle1Layout);
        boxTitle1Layout.setHorizontalGroup(
            boxTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTitle1Layout.setVerticalGroup(
            boxTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTotalPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotalPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPenjualan.setText("10");

        javax.swing.GroupLayout boxTotalPenjualanLayout = new javax.swing.GroupLayout(boxTotalPenjualan);
        boxTotalPenjualan.setLayout(boxTotalPenjualanLayout);
        boxTotalPenjualanLayout.setHorizontalGroup(
            boxTotalPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(boxTotalPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTotalPenjualanLayout.setVerticalGroup(
            boxTotalPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTotalPenjualanLayout.createSequentialGroup()
                .addComponent(boxTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtTotalPenjualan)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelHome.add(boxTotalPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        boxTotalProduk.setBackground(new java.awt.Color(192, 57, 42));
        boxTotalProduk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        boxTotalProduk.setPreferredSize(new java.awt.Dimension(250, 200));

        boxTitle.setBackground(new java.awt.Color(255, 255, 255));

        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(192, 57, 42));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Total Makanan \ndan Minuman");

        javax.swing.GroupLayout boxTitleLayout = new javax.swing.GroupLayout(boxTitle);
        boxTitle.setLayout(boxTitleLayout);
        boxTitleLayout.setHorizontalGroup(
            boxTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTitleLayout.setVerticalGroup(
            boxTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTotalProduk.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotalProduk.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalProduk.setText("10");

        javax.swing.GroupLayout boxTotalProdukLayout = new javax.swing.GroupLayout(boxTotalProduk);
        boxTotalProduk.setLayout(boxTotalProdukLayout);
        boxTotalProdukLayout.setHorizontalGroup(
            boxTotalProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(boxTotalProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxTotalProdukLayout.setVerticalGroup(
            boxTotalProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTotalProdukLayout.createSequentialGroup()
                .addComponent(boxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtTotalProduk)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelHome.add(boxTotalProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

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

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        if(JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Keluar ?") == JOptionPane.OK_OPTION){
            PilihLoginView view = new PilihLoginView();
            view.setVisible(true);
            this.dispose();
        }  
        
    }//GEN-LAST:event_btnKeluarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (AdminException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel boxTitle;
    private javax.swing.JPanel boxTitle1;
    private javax.swing.JPanel boxTitle2;
    private javax.swing.JPanel boxTotalPenghasilan;
    private javax.swing.JPanel boxTotalPenjualan;
    private javax.swing.JPanel boxTotalProduk;
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
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtTitle1;
    private javax.swing.JLabel txtTitle2;
    private javax.swing.JLabel txtTotalPenghasilan;
    private javax.swing.JLabel txtTotalPenjualan;
    private javax.swing.JLabel txtTotalProduk;
    // End of variables declaration//GEN-END:variables


}
