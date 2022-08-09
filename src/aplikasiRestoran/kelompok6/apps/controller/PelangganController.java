package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.PelangganModel;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
        
            if(namaPemesan.equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan Masukan Nama Anda");
            }else if(namaMakanan.equals("      -- PILIH MAKANAN --")){
                JOptionPane.showMessageDialog(view, "Silahkan Pilih Makanan Yang Akan Dibeli");
            }else if(qtyMakanan.equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan Masukan Jumlah Makanan Yang Akan Dibeli");
            }else if(namaMinuman.equals("      -- PILIH MINUMAN --")){
                JOptionPane.showMessageDialog(view, "Silahkan Pilih Minuman Yang Akan Dibeli");
            }else if(qtyMinuman.equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan Masukan Jumlah Minuman Yang Akan Dibeli");
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
                    try{
                        File namafile = new File("src/aplikasiRestoran/kelompok6/laporan/StrukPembelian.jasper");
                        JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, AplikasiRestoranDB.getConnection());
                        JasperViewer.viewReport(jp, false);
                    }catch(Exception x){
                        JOptionPane.showMessageDialog(null, x.getMessage());
                    }
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
