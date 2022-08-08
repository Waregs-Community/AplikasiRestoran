package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.event.PelangganListener;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.sql.SQLException;


public class PelangganModel {
    
    private String namaPemesan;
    private int idMakanan;
    private int hargaMakanan;
    private int qtyMakanan;
    private int idMinuman;
    private int hargaMinuman;
    private int qtyMinuman;
    private int totalHarga;
    private PelangganListener pelangganListener;


    public String getNamaPemesan() {
        return namaPemesan;
    }
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getIdMakanan() {
        return idMakanan;
    }
    public void setIdMakanan(int idMakanan) {
        this.idMakanan = idMakanan;
    }

    public int getHargaMakanan() {
        return hargaMakanan;
    }
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getQtyMakanan() {
        return qtyMakanan;
    }
    public void setQtyMakanan(int qtyMakanan) {
        this.qtyMakanan = qtyMakanan;
    }

    public int getIdMinuman() {
        return idMinuman;
    }
    public void setIdMinuman(int idMinuman) {
        this.idMinuman = idMinuman;
    }

    public int getHargaMinuman() {
        return hargaMinuman;
    }
    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }
    
    public int getQtyMinuman() {
        return qtyMinuman;
    }
    public void setQtyMinuman(int qtyMinuman) {
        this.qtyMinuman = qtyMinuman;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    


    
    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }
    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
        this.fireOnChange();
    }
    
    
    protected void fireOnChange(){
        if(getPelangganListener() != null){
            this.getPelangganListener().onChange(this);
        }
    }
    
    protected void fireOnInsert(Pelanggan pelanggan){
        if(pelangganListener != null){
            pelangganListener.onInsert(this);
        }
    }
    
    public void kirimPesanan(PelangganView view) throws SQLException, PelangganException{
        PelangganDao dao = AplikasiRestoranDB.getDataPesanan();
        Pelanggan pesanan = new Pelanggan();
               
        dao.insertPesanan(pesanan);
        this.fireOnChange();
        this.fireOnInsert(pesanan);
    }
    
    public void resetPesanan(PelangganView view){
        view.getCmbMakanan().setSelectedIndex(0);
        view.getCmbMinuman().setSelectedIndex(0);
        view.getTxtQtyMakanan().setText("");
        view.getTxtQtyMinuman().setText("");
        view.getTxtHargaMakanan().setText("");
        view.getTxtHargaMinuman().setText("");
        view.getTxtNamaPemesan().setText("");
        view.getTxtTotalHarga().setText("");
        
        this.fireOnChange();
    }
    
}
