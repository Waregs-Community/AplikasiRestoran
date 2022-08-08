package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.Impl.PelangganDaoImpl;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.PelangganModel;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PelangganController{
    
    private PelangganModel model;
    
    public PelangganModel getModel() {
        return model;
    } 
    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void kirimPesanan(PelangganView view) throws SQLException, PelangganException{
        
            String namaPemesan = view.getTxtNamaPemesan().getText();
            String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
            String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
            String hargaMakanan = view.getTxtHargaMakanan().getText();
            String hargaMinuman = view.getTxtHargaMinuman().getText();
            String qtyMakanan = view.getTxtQtyMakanan().getText();
            String qtyMinuman = view.getTxtQtyMinuman().getText();
            String totalBayar = view.getTxtTotalHarga().getText();
        
            if(namaPemesan.equals("") && namaMakanan.equals("") & namaMinuman.equals("") && hargaMakanan.equals("") && hargaMinuman.equals("") 
                && qtyMakanan.equals("") && qtyMinuman.equals("") && totalBayar.equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan Pilih Menu Terlebih Dahulu");
            }else {
                model.setNamaPemesan(namaPemesan);
                model.setNamaMakanan(namaMakanan);
                model.setNamaMinuman(namaMinuman);
                model.setHargaMakanan(Integer.valueOf(hargaMakanan));
                model.setHargaMinuman(Integer.valueOf(hargaMinuman));
                model.setQtyMakanan(Integer.valueOf(qtyMakanan));
                model.setQtyMinuman(Integer.valueOf(qtyMinuman));
                model.setTotalHarga(Integer.valueOf(totalBayar));
                
                try{
                    model.kirimPesanan();
                    model.resetPesanan();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(view, new Object[]{
                        "Terjadi Error Di Database Dengan Pesan ", ex.getMessage()
                });
            }           
        } 
    }

    
    public void resetPesanan(PelangganView view){
        model.resetPesanan();
    }
}
