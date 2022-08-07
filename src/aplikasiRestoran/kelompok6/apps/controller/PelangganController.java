package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.Impl.PelangganDaoImpl;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.PelangganModel;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;

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
        String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
        String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
        String hargaMakanan = view.getTxtHargaMakanan().getText();
        String hargaMinuman = view.getTxtHargaMinuman().getText();
        String qtyMakanan = view.getTxtQtyMakanan().getText();
        String qtyMinuman = view.getTxtQtyMinuman().getText();
        String totalBayar = view.getTxtTotalHarga().getText();
        
        getModel().kirimPesanan(view);
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
