package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.Impl.PelangganDaoImpl;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.PelangganModel;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PelangganController{
    
    private PelangganModel model;
    private PelangganView view;
    private PelangganDaoImpl daoImpl;


    public PelangganModel getModel() {
        return model;
    } 
    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public PelangganDaoImpl getDaoImpl() {
        return daoImpl;
    }
    public void setDaoImpl(PelangganDaoImpl daoImpl) {
        this.daoImpl = daoImpl;
    }
    
    public PelangganView getView() {
        return view;
    }
    public void setView(PelangganView view){
        this.view = view;
    }
    
    public void kirimPesanan(PelangganView view) throws SQLException, PelangganException{
            String namaPemesan = view.getTxtNamaPemesan().getText();
            int idMakanan = view.getCmbMakanan().getSelectedIndex();
            int idMinuman = view.getCmbMinuman().getSelectedIndex();
            String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
            String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
            String hargaMakanan = view.getTxtHargaMakanan().getText();
            String hargaMinuman = view.getTxtHargaMinuman().getText();
            String qtyMakanan = view.getTxtQtyMakanan().getText();
            String qtyMinuman = view.getTxtQtyMinuman().getText();
            String totalBayar = view.getTxtTotalHarga().getText();
        
            if(namaPemesan.equals("") && namaMakanan.equals("") & namaMinuman.equals("") && hargaMakanan.equals("") && hargaMinuman.equals("") 
                && qtyMakanan.equals("") && qtyMinuman.equals("") && totalBayar.equals("")){
                //do nothing
            }else {
                model.setNamaPemesan(namaPemesan);
                model.setIdMakanan(idMakanan);
                model.setIdMinuman(idMinuman);
                model.setHargaMakanan(Integer.valueOf(hargaMakanan));
                model.setHargaMinuman(Integer.valueOf(hargaMinuman));
                model.setQtyMakanan(Integer.valueOf(qtyMakanan));
                model.setQtyMinuman(Integer.valueOf(qtyMinuman));
                model.setTotalHarga(Integer.valueOf(totalBayar));
                
                try{
                model.kirimPesanan(view);
                JOptionPane.showMessageDialog(null, "Pesanan Anda \n Nama : "+namaPemesan+" \n makanan : "+namaMakanan+" \n harga makanan : "+
                    hargaMakanan+" \n Qty : "+qtyMakanan+" \n Minuman : "+namaMinuman+" \n harga minuman : "+hargaMinuman+
                            " \n Qty : "+qtyMinuman+" \n Total Bayar : "+totalBayar+"\n SILAHKAN BAYAR KE KASIR"); 
                model.resetPesanan(view);
                }catch(Exception ex){
                JOptionPane.showMessageDialog(view, new Object[]{
                                      "Terjadi Error Di Database Dengan Pesan ", ex.getMessage()
                });
            }           
        } 
    }

    
    public void resetPesanan(PelangganView view){
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
            //do nothing
        }else {
            getModel().resetPesanan(view);
        }
        
    }
}
