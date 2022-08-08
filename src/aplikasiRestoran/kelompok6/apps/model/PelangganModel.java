package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.event.PelangganListener;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PelangganModel {
    
    private String namaPemesan;
    private int idMakanan;
    private String namaMakanan;
    private int hargaMakanan;
    private int qtyMakanan;
    private int idMinuman;
    private String namaMinuman;
    private int hargaMinuman;
    private int qtyMinuman;
    private int totalHarga;
    
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
    
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

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }
    
    
    protected void fireOnChange(){
        if(listener != null){
            listener.onChange(this);
        }
    }
    
    public void kirimPesanan() throws SQLException, PelangganException{
        PelangganDao dao = AplikasiRestoranDB.getDataPesanan();
        Pelanggan pelanggan = new Pelanggan();
        
        pelanggan = dao.getIdByName(namaMakanan, namaMinuman);
        
        pelanggan.setNamaPemesan(namaPemesan);
        pelanggan.setNamaMakanan(namaMakanan);
        pelanggan.setHargaMakanan(hargaMakanan);
        pelanggan.setQtyMakanan(qtyMakanan);
        pelanggan.setNamaMinuman(namaMinuman);
        pelanggan.setHargaMinuman(hargaMinuman);
        pelanggan.setQtyMinuman(qtyMinuman);
        pelanggan.setTotalHarga(totalHarga);
        
        dao.insertPesanan(pelanggan);
        JOptionPane.showMessageDialog(null, "Pesanan Anda \n Nama : "+namaPemesan+" \n makanan : "+pelanggan.getIdMakanan()+" \n harga makanan : "+
                        hargaMakanan+" \n Qty : "+qtyMakanan+" \n Minuman : "+pelanggan.getIdMinuman()+" \n harga minuman : "+hargaMinuman+
                                " \n Qty : "+qtyMinuman+" \n Total Bayar : "+totalHarga+"\n SILAHKAN BAYAR KE KASIR"); 
        this.fireOnChange();
    }
    
    public void resetPesanan(){
        
        this.setNamaMakanan("      -- PILIH MAKANAN --");
        this.setNamaMinuman("      -- PILIH MINUMAN --");
        this.setQtyMakanan(0);
        this.setQtyMinuman(0);
        this.setHargaMakanan(0);
        this.setHargaMinuman(0);
        this.setNamaPemesan("");
        this.setTotalHarga(0);
        
        this.fireOnChange();
    }
    
}
