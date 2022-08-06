package aplikasiRestoran.kelompok6.apps.view.Admin;

import aplikasiRestoran.kelompok6.apps.controller.MinumanController;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.event.AdminListener;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.model.AdminModel;
import aplikasiRestoran.kelompok6.apps.model.TabelMinumanModel;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DataMinumanView extends javax.swing.JFrame implements AdminListener, ListSelectionListener{

    private TabelMinumanModel tabelModel;
    private AdminModel model;
    private MinumanController controller;
    
    public DataMinumanView() {
        tabelModel = new TabelMinumanModel();
        
        model = new AdminModel("minuman");
        model.setListener(this);
        
        controller = new MinumanController();
        controller.setModel(model);
        
        initComponents();
        tabelMinuman.setModel(tabelModel);
        this.tabelMinuman.getSelectionModel().addListSelectionListener(this);
        try {
            this.loadDatabase();
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JPanel getPanelDataMinuman() {
        return panelDataMinuman;
    }

    public JTextField getInputIDMinuman() {
        return inputIDMinuman;
    }

    public JTextField getInputHargaMinuman() {
        return inputHargaMinuman;
    }

    public JTextField getInputNamaMinuman() {
        return inputNamaMinuman;
    }

    public JTable getTabelMinuman() {
        return tabelMinuman;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDataMinuman = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        panelInput2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        inputIDMinuman = new javax.swing.JTextField();
        inputNamaMinuman = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputHargaMinuman = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnTambahMinuman = new javax.swing.JButton();
        btnHapusMinuman = new javax.swing.JButton();
        btnEditMinuman = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMinuman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 57, 42));

        panelDataMinuman.setBackground(new java.awt.Color(192, 57, 42));
        panelDataMinuman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/drink.png"))); // NOI18N
        Title2.setText("Data Minuman");
        panelDataMinuman.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 40, 410, -1));

        panelInput2.setBackground(new java.awt.Color(192, 57, 42));
        panelInput2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Minuman");
        panelInput2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 27, -1, 36));
        panelInput2.add(inputIDMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 29, 224, 36));
        panelInput2.add(inputNamaMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, 224, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nama Minuman");
        panelInput2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 83, -1, 36));
        panelInput2.add(inputHargaMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 141, 224, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga Minuman");
        panelInput2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, -1, 36));

        btnTambahMinuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambahMinuman.setText("Tambah");
        btnTambahMinuman.setPreferredSize(new java.awt.Dimension(110, 40));
        btnTambahMinuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMinumanMouseClicked(evt);
            }
        });
        panelInput2.add(btnTambahMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 195, -1, -1));

        btnHapusMinuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapusMinuman.setText("Hapus");
        btnHapusMinuman.setPreferredSize(new java.awt.Dimension(110, 40));
        btnHapusMinuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMinumanMouseClicked(evt);
            }
        });
        btnHapusMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMinumanActionPerformed(evt);
            }
        });
        panelInput2.add(btnHapusMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 195, -1, -1));

        btnEditMinuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditMinuman.setText("Edit");
        btnEditMinuman.setPreferredSize(new java.awt.Dimension(110, 40));
        btnEditMinuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMinumanMouseClicked(evt);
            }
        });
        panelInput2.add(btnEditMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 195, -1, -1));

        panelDataMinuman.add(panelInput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 390, 260));

        tabelMinuman.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelMinuman.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nama Minuman", "Harga Minuman"
            }
        ));
        jScrollPane1.setViewportView(tabelMinuman);

        panelDataMinuman.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 550, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDataMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMinumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMinumanActionPerformed

    private void btnTambahMinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMinumanMouseClicked
        try {
            controller.insertData(this);
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahMinumanMouseClicked

    private void btnEditMinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMinumanMouseClicked
        try {
            controller.updateData(this);
        } catch (SQLException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AdminException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditMinumanMouseClicked

    private void btnHapusMinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMinumanMouseClicked
        try {
            controller.deleteData(this);
        } catch (SQLException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AdminException ex) {
            Logger.getLogger(DataMinumanView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusMinumanMouseClicked

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
            java.util.logging.Logger.getLogger(DataMinumanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMinumanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMinumanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMinumanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMinumanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title2;
    private javax.swing.JButton btnEditMinuman;
    private javax.swing.JButton btnHapusMinuman;
    private javax.swing.JButton btnTambahMinuman;
    private javax.swing.JTextField inputHargaMinuman;
    private javax.swing.JTextField inputIDMinuman;
    private javax.swing.JTextField inputNamaMinuman;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDataMinuman;
    private javax.swing.JPanel panelInput2;
    private javax.swing.JTable tabelMinuman;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(AdminModel admin) {
        this.inputIDMinuman.setText(String.valueOf(admin.getId()));
        this.inputNamaMinuman.setText(admin.getNama());
        this.inputHargaMinuman.setText(String.valueOf(admin.getHarga()));
    }

    @Override
    public void onInsert(Admin admin) {
        this.tabelModel.add(admin);
    }

    @Override
    public void onUpdate(Admin admin) {
        int index = this.tabelMinuman.getSelectedRow();
        this.tabelModel.set(index, admin);
    }

    @Override
    public void onDelete() {
        int index = this.tabelMinuman.getSelectedRow();
        this.tabelModel.remove(index);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try{
            Admin admin = tabelModel.get(tabelMinuman.getSelectedRow());
            
            this.inputIDMinuman.setText(String.valueOf(admin.getId()));
            this.inputNamaMinuman.setText(admin.getNama());
            this.inputHargaMinuman.setText(String.valueOf(admin.getHarga()));
        }catch(IndexOutOfBoundsException ex){}
    }
    
    public void loadDatabase() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        this.tabelModel.setList(dao.selectAllData("minuman"));
    }
}
