/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiRestoran.kelompok6.apps.view;

/**
 *
 * @author Asus N751J
 */
public class PelangganView extends javax.swing.JFrame {

    /**
     * Creates new form PelangganView
     */
    public PelangganView() {
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

        panelBody = new javax.swing.JPanel();
        panelBestSeller = new javax.swing.JPanel();
        iconJempol = new javax.swing.JLabel();
        iconTakoyaki = new javax.swing.JLabel();
        iconMieAyam = new javax.swing.JLabel();
        iconRoti = new javax.swing.JLabel();
        lblTakoyaki = new javax.swing.JLabel();
        lblMieAyam = new javax.swing.JLabel();
        lblRoti = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblMenuPilihan = new javax.swing.JLabel();
        panelPesan = new javax.swing.JPanel();
        lblMinuman = new javax.swing.JLabel();
        lblMakanan = new javax.swing.JLabel();
        cmbMakanan = new javax.swing.JComboBox<>();
        cmbMinuman = new javax.swing.JComboBox<>();
        txtHargaMinuman = new javax.swing.JTextField();
        txtHargaMakanan = new javax.swing.JTextField();
        txtQtyMinuman = new javax.swing.JTextField();
        txtQtyMakanan = new javax.swing.JTextField();
        lblQtyMakanan = new javax.swing.JLabel();
        lblHargaMakanan = new javax.swing.JLabel();
        lblHargaMinuman = new javax.swing.JLabel();
        lblQtyMinuman = new javax.swing.JLabel();
        lblTotalBayar = new javax.swing.JLabel();
        lblNamaPemesan = new javax.swing.JLabel();
        txtNamaPemesan = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        btnPesan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PELANGGAN");
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelBody.setBackground(new java.awt.Color(192, 57, 43));
        panelBody.setMinimumSize(new java.awt.Dimension(800, 650));
        panelBody.setPreferredSize(new java.awt.Dimension(800, 690));
        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBestSeller.setBackground(new java.awt.Color(192, 57, 43));
        panelBestSeller.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BEST SELLER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 255, 102))); // NOI18N
        panelBestSeller.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconJempol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/icon/jempol.png"))); // NOI18N
        panelBestSeller.add(iconJempol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, 50));

        iconTakoyaki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/icon/takoyaki.png"))); // NOI18N
        panelBestSeller.add(iconTakoyaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        iconMieAyam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/icon/mieayam.png"))); // NOI18N
        panelBestSeller.add(iconMieAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 130, -1));

        iconRoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/icon/roti.png"))); // NOI18N
        panelBestSeller.add(iconRoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 130, -1));

        lblTakoyaki.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTakoyaki.setForeground(new java.awt.Color(255, 255, 255));
        lblTakoyaki.setText("TAKOYAKI");
        panelBestSeller.add(lblTakoyaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, -1));

        lblMieAyam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMieAyam.setForeground(new java.awt.Color(255, 255, 255));
        lblMieAyam.setText("MIE AYAM");
        panelBestSeller.add(lblMieAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, -1));

        lblRoti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRoti.setForeground(new java.awt.Color(255, 255, 255));
        lblRoti.setText("ROTI BAKAR");
        panelBestSeller.add(lblRoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 90, -1));

        panelBody.add(panelBestSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 720, 260));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 102));
        jSeparator1.setMinimumSize(new java.awt.Dimension(0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 2));
        panelBody.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 310, 320, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 102));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 102));
        panelBody.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 320, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 102));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 102));
        panelBody.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 830, 10));

        lblMenuPilihan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuPilihan.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuPilihan.setText("MENU PILIHAN");
        lblMenuPilihan.setMaximumSize(new java.awt.Dimension(183, 32));
        lblMenuPilihan.setMinimumSize(new java.awt.Dimension(183, 32));
        lblMenuPilihan.setPreferredSize(new java.awt.Dimension(183, 32));
        panelBody.add(lblMenuPilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        panelPesan.setBackground(new java.awt.Color(192, 57, 43));
        panelPesan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panelPesan.setMinimumSize(new java.awt.Dimension(600, 180));
        panelPesan.setPreferredSize(new java.awt.Dimension(600, 180));
        panelPesan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinuman.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMinuman.setForeground(new java.awt.Color(255, 255, 102));
        lblMinuman.setText("Minuman");
        lblMinuman.setMaximumSize(new java.awt.Dimension(124, 32));
        lblMinuman.setMinimumSize(new java.awt.Dimension(124, 32));
        lblMinuman.setPreferredSize(new java.awt.Dimension(124, 32));
        panelPesan.add(lblMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        lblMakanan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMakanan.setForeground(new java.awt.Color(255, 255, 102));
        lblMakanan.setText("Makanan");
        lblMakanan.setMaximumSize(new java.awt.Dimension(119, 32));
        lblMakanan.setMinimumSize(new java.awt.Dimension(119, 32));
        lblMakanan.setPreferredSize(new java.awt.Dimension(119, 32));
        panelPesan.add(lblMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        cmbMakanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Makanan" }));
        panelPesan.add(cmbMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 170, 40));

        cmbMinuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbMinuman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Minuman" }));
        panelPesan.add(cmbMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 170, 40));

        txtHargaMinuman.setEditable(false);
        txtHargaMinuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHargaMinuman.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPesan.add(txtHargaMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, 30));

        txtHargaMakanan.setEditable(false);
        txtHargaMakanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHargaMakanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPesan.add(txtHargaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 30));

        txtQtyMinuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQtyMinuman.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPesan.add(txtQtyMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 30, 30));

        txtQtyMakanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQtyMakanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPesan.add(txtQtyMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 30, 30));

        lblQtyMakanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQtyMakanan.setForeground(new java.awt.Color(255, 255, 255));
        lblQtyMakanan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQtyMakanan.setText("Jumlah  :");
        panelPesan.add(lblQtyMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblHargaMakanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHargaMakanan.setForeground(new java.awt.Color(255, 255, 255));
        lblHargaMakanan.setText("Harga :");
        panelPesan.add(lblHargaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblHargaMinuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHargaMinuman.setForeground(new java.awt.Color(255, 255, 255));
        lblHargaMinuman.setText("Harga :");
        panelPesan.add(lblHargaMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        lblQtyMinuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQtyMinuman.setForeground(new java.awt.Color(255, 255, 255));
        lblQtyMinuman.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQtyMinuman.setText("Jumlah  :");
        panelPesan.add(lblQtyMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        panelBody.add(panelPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 680, 210));

        lblTotalBayar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalBayar.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalBayar.setText("Total Bayar :");
        panelBody.add(lblTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, -1));

        lblNamaPemesan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamaPemesan.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaPemesan.setText("Nama Pemesan :");
        panelBody.add(lblNamaPemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        txtNamaPemesan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNamaPemesan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBody.add(txtNamaPemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 150, 30));

        txtTotalBayar.setEditable(false);
        txtTotalBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTotalBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelBody.add(txtTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 150, 30));

        btnPesan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesan.setText("PESAN");
        panelBody.add(btnPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 110, 50));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        panelBody.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 110, 50));

        getContentPane().add(panelBody, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbMakanan;
    private javax.swing.JComboBox<String> cmbMinuman;
    private javax.swing.JLabel iconJempol;
    private javax.swing.JLabel iconMieAyam;
    private javax.swing.JLabel iconRoti;
    private javax.swing.JLabel iconTakoyaki;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblHargaMakanan;
    private javax.swing.JLabel lblHargaMinuman;
    private javax.swing.JLabel lblMakanan;
    private javax.swing.JLabel lblMenuPilihan;
    private javax.swing.JLabel lblMieAyam;
    private javax.swing.JLabel lblMinuman;
    private javax.swing.JLabel lblNamaPemesan;
    private javax.swing.JLabel lblQtyMakanan;
    private javax.swing.JLabel lblQtyMinuman;
    private javax.swing.JLabel lblRoti;
    private javax.swing.JLabel lblTakoyaki;
    private javax.swing.JLabel lblTotalBayar;
    private javax.swing.JPanel panelBestSeller;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelPesan;
    private javax.swing.JTextField txtHargaMakanan;
    private javax.swing.JTextField txtHargaMinuman;
    private javax.swing.JTextField txtNamaPemesan;
    private javax.swing.JTextField txtQtyMakanan;
    private javax.swing.JTextField txtQtyMinuman;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
