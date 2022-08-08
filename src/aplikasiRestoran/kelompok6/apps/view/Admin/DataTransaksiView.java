package aplikasiRestoran.kelompok6.apps.view.Admin;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.model.TabelTransaksiModel;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.io.File;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DataTransaksiView extends javax.swing.JFrame {

    private TabelTransaksiModel tabelModel;
    
    public DataTransaksiView() {
        tabelModel = new TabelTransaksiModel();
        
        initComponents();
        tabelTransaksi.setModel(tabelModel);
        try {
            this.loadDatabase();
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataTransaksiView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JPanel getPanelDataTransaksi() {
        return panelDataTransaksi;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDataTransaksi = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        btnCetakLaporan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 57, 42));
        setPreferredSize(new java.awt.Dimension(1051, 586));

        panelDataTransaksi.setBackground(new java.awt.Color(192, 57, 42));
        panelDataTransaksi.setPreferredSize(new java.awt.Dimension(1020, 532));
        panelDataTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/transaction.png"))); // NOI18N
        Title2.setText("Data Transaksi");
        panelDataTransaksi.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 40, 410, -1));

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID TRANSAKSI", "NAMA PELANGGAN", "NAMA MAKANAN", "HARGA MAKANAN", "QTY MAKANAN", "NAMA MINUMAN", "HARGA MINUMAN", "QTY MINUMAN", "TOTAL BAYAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tabelTransaksi);

        panelDataTransaksi.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1000, 410));

        btnCetakLaporan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/print.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCetakLaporanMouseClicked(evt);
            }
        });
        panelDataTransaksi.add(btnCetakLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakLaporanMouseClicked
        try{
            File namafile = new File("src/aplikasiRestoran/kelompok6/laporan/LaporanTransaksi.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, AplikasiRestoranDB.getConnection());
            JasperViewer.viewReport(jp, false);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanMouseClicked

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
            java.util.logging.Logger.getLogger(DataTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTransaksiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTransaksiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title2;
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelDataTransaksi;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
    public void loadDatabase() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        this.tabelModel.setList(dao.selectAllTransaksi());
    }

}
