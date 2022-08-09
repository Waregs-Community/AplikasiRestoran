package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.model.AdminModel;
import aplikasiRestoran.kelompok6.apps.view.Admin.DataMinumanView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MinumanController {
    
    AdminModel model;

    public void setModel(AdminModel model) {
        this.model = model;
    }
    
    public void insertData(DataMinumanView view) throws SQLException, AdminException{
        
        String id = view.getInputIDMinuman().getText();
        String nama = view.getInputNamaMinuman().getText();
        String harga = view.getInputHargaMinuman().getText();
        
        if(id.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field ID Tidak Boleh Kosong.");
        }else if(id.equals("0")){
            JOptionPane.showMessageDialog(view, "Field ID Tidak Boleh 0.");
        }else if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Nama Tidak Boleh Kosong.");
        }else if(harga.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Harga Tidak Boleh Kosong.");
        }else {
            model.setId(Integer.parseInt(id));
            model.setNama(nama);
            model.setHarga(Integer.parseInt(harga));
            
            try{
                model.insertData();
                JOptionPane.showMessageDialog(view, "Minuman Telah Ditambahkan");
                model.resetData();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi Error Di Database Dengan Pesan ", ex.getMessage()
                });
            }
        }
        
    }
    
    public void updateData(DataMinumanView view) throws SQLException, AdminException{
        
        String id = view.getInputIDMinuman().getText();
        String nama = view.getInputNamaMinuman().getText();
        String harga = view.getInputHargaMinuman().getText();
        
        if(id.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field ID Tidak Boleh Kosong.");
        }else if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Nama Tidak Boleh Kosong.");
        }else if(harga.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Field Harga Tidak Boleh Kosong.");
        }else {
            model.setId(Integer.parseInt(id));
            model.setNama(nama);
            model.setHarga(Integer.parseInt(harga));
            
            try{
                model.updateData();
                JOptionPane.showMessageDialog(view, "Minuman Telah Diubah");
                model.resetData();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi Error Di Database Dengan Pesan ", ex.getMessage()
                });
            }
        }
        
    }
    
    public void deleteData(DataMinumanView view) throws SQLException, AdminException{
        
        if(view.getTabelMinuman().getSelectedRow() == 0){
            JOptionPane.showMessageDialog(view, "Silahkan Pilih Data Yang Akan Dihapus");
        }
        
        if(JOptionPane.showConfirmDialog(view, "Apakah Anda Yakin Menghapus Data ?") == JOptionPane.OK_OPTION){
            int id = Integer.valueOf(view.getInputIDMinuman().getText());
            model.setId(id);
            
            try{
            model.deleteData();
            JOptionPane.showMessageDialog(view, "Minuman Dengan ID: "+id+" Berhasil Dihapus");
            model.resetData();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi Error Di Database Dengan Pesan ", ex.getMessage()
                });
            }
        }   
        
        
        
    }
    
    
}
