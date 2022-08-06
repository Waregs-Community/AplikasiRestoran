package aplikasiRestoran.kelompok6.apps.view.Admin;

import aplikasiRestoran.kelompok6.apps.controller.MakananController;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.event.AdminListener;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.model.AdminModel;
import aplikasiRestoran.kelompok6.apps.model.TabelMakananModel;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DataMakananView extends javax.swing.JFrame implements AdminListener, ListSelectionListener {

    private TabelMakananModel tabelModel;
    private AdminModel model;
    private MakananController controller;
    
            
    public DataMakananView() {
        tabelModel = new TabelMakananModel();
        
        model = new AdminModel("makanan");
        model.setListener(this);
        
        controller = new MakananController();
        controller.setModel(model);
        
        initComponents();
        tabelMakanan.setModel(tabelModel);
        this.tabelMakanan.getSelectionModel().addListSelectionListener(this);
        try {
            this.loadDatabase();
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMakananView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JPanel getPanelDataMakanan() {
        return panelDataMakanan;
    }

    public JTextField getInputIDMakanan() {
        return inputIDMakanan;
    }

    public JTextField getInputHargaMakanan() {
        return inputHargaMakanan;
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
        inputHargaMakanan = new javax.swing.JTextField();
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
        panelInput.add(inputHargaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 141, 224, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Makanan");
        panelInput.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, -1, 36));

        btnTambahMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambahMakanan.setText("Tambah");
        btnTambahMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnTambahMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMakananMouseClicked(evt);
            }
        });
        panelInput.add(btnTambahMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 195, -1, -1));

        btnHapusMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapusMakanan.setText("Hapus");
        btnHapusMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnHapusMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMakananMouseClicked(evt);
            }
        });
        btnHapusMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMakananActionPerformed(evt);
            }
        });
        panelInput.add(btnHapusMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 195, -1, -1));

        btnEditMakanan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditMakanan.setText("Edit");
        btnEditMakanan.setPreferredSize(new java.awt.Dimension(110, 40));
        btnEditMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMakananMouseClicked(evt);
            }
        });
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

    private void btnTambahMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMakananMouseClicked
        try {
            controller.insertData(this);
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMakananView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahMakananMouseClicked

    private void btnEditMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMakananMouseClicked
        try {
            controller.updateData(this);
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMakananView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditMakananMouseClicked

    private void btnHapusMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMakananMouseClicked
        try {
            controller.deleteData(this);
        } catch (SQLException | AdminException ex) {
            Logger.getLogger(DataMakananView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusMakananMouseClicked

    public static void main(String args[]) {

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
    private javax.swing.JTextField inputHargaMakanan;
    private javax.swing.JTextField inputIDMakanan;
    private javax.swing.JTextField inputNamaMakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDataMakanan;
    private javax.swing.JPanel panelInput;
    private javax.swing.JTable tabelMakanan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(AdminModel admin) {
        this.inputIDMakanan.setText(String.valueOf(admin.getId()));
        this.inputNamaMakanan.setText(admin.getNama());
        this.inputHargaMakanan.setText(String.valueOf(admin.getHarga()));
    }

    @Override
    public void onInsert(Admin admin) {
        this.tabelModel.add(admin);
    }

    @Override
    public void onUpdate(Admin admin) {
        int index = this.tabelMakanan.getSelectedRow();
        this.tabelModel.set(index, admin);
    }

    @Override
    public void onDelete() {
        int index = this.tabelMakanan.getSelectedRow();
        this.tabelModel.remove(index);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try{
            Admin admin = tabelModel.get(tabelMakanan.getSelectedRow());
            
            this.inputIDMakanan.setText(String.valueOf(admin.getId()));
            this.inputNamaMakanan.setText(admin.getNama());
            this.inputHargaMakanan.setText(String.valueOf(admin.getHarga()));
        }catch(IndexOutOfBoundsException ex){}
    }
    
    public void loadDatabase() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        this.tabelModel.setList(dao.selectAllData("makanan"));
    }
}
