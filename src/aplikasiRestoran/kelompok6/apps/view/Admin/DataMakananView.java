package aplikasiRestoran.kelompok6.apps.view.Admin;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DataMakananView extends javax.swing.JFrame {

    public DataMakananView() {
        initComponents();
    }

    public JPanel getPanelDataMakanan() {
        return panelDataMakanan;
    }

    public JTextField getInputIDMakanan() {
        return inputIDMakanan;
    }

    public JTextField getInputIHargaMakanan() {
        return inputIHargaMakanan;
    }

    public JTextField getInputNamaMakanan() {
        return inputNamaMakanan;
    }

    public JTable getTabelMakanan() {
        return tabelMakanan;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDataMakanan = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputIDMakanan = new javax.swing.JTextField();
        inputNamaMakanan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputIHargaMakanan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTambahMakanan = new javax.swing.JButton();
        btnHapusMakanan = new javax.swing.JButton();
        btnEditMakanan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMakanan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 57, 42));

        panelDataMakanan.setBackground(new java.awt.Color(192, 57, 42));
        panelDataMakanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/food.png"))); // NOI18N
        Title.setText("Data Makanan");
        panelDataMakanan.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 40, 410, -1));

        panelInput.setBackground(new java.awt.Color(192, 57, 42));
        panelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Makanan");
        panelInput.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 27, -1, 36));
        panelInput.add(inputIDMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 29, 224, 36));
        panelInput.add(inputNamaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, 224, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Makanan");
        panelInput.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 83, -1, 36));
        panelInput.add(inputIHargaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 141, 224, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Makanan");
        panelInput.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, -1, 36));

        btnTambahMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambahMakanan.setText("Tambah");
        btnTambahMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        panelInput.add(btnTambahMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 195, -1, -1));

        btnHapusMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapusMakanan.setText("Hapus");
        btnHapusMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnHapusMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMakananActionPerformed(evt);
            }
        });
        panelInput.add(btnHapusMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 195, -1, -1));

        btnEditMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditMakanan.setText("Edit");
        btnEditMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        panelInput.add(btnEditMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 195, -1, -1));

        panelDataMakanan.add(panelInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 390, 260));

        tabelMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Makanan", "Harga Makanan"
            }
        ));
        jScrollPane1.setViewportView(tabelMakanan);
        if (tabelMakanan.getColumnModel().getColumnCount() > 0) {
            tabelMakanan.getColumnModel().getColumn(0).setResizable(false);
            tabelMakanan.getColumnModel().getColumn(1).setResizable(false);
            tabelMakanan.getColumnModel().getColumn(2).setResizable(false);
        }

        panelDataMakanan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 550, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMakananActionPerformed

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
            java.util.logging.Logger.getLogger(DataMakananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMakananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMakananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMakananView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMakananView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnEditMakanan;
    private javax.swing.JButton btnHapusMakanan;
    private javax.swing.JButton btnTambahMakanan;
    private javax.swing.JTextField inputIDMakanan;
    private javax.swing.JTextField inputIHargaMakanan;
    private javax.swing.JTextField inputNamaMakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDataMakanan;
    private javax.swing.JPanel panelInput;
    private javax.swing.JTable tabelMakanan;
    // End of variables declaration//GEN-END:variables
}
