package aplikasiRestoran.kelompok6.apps.entity;

import java.util.Objects;

public class Transaksi {
    
    private String idTransaksi;
    private String namaPelanggan;
    private String namaMakanan;
    private String hargaMakanan;
    private String jumlahMakanan;
    private String namaMinuman;
    private String hargaMinuman;
    private String jumlahMinuman;
    private String totalBayar;
    
    public Transaksi(){}
    
    public Transaksi(String idTransaksi,String namaPelanggan, 
                     String namaMakanan, String hargaMakanan, 
                     String jumlahMakanan, String namaMinuman,
                     String hargaMinuman, String jumlahMinuman,
                     String totalBayar){
        this.idTransaksi = idTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.jumlahMakanan = jumlahMakanan;
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
        this.jumlahMinuman = jumlahMinuman;
        this.totalBayar = totalBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String getJumlahMakanan() {
        return jumlahMakanan;
    }

    public void setJumlahMakanan(String jumlahMakanan) {
        this.jumlahMakanan = jumlahMakanan;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public String getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(String hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public String getJumlahMinuman() {
        return jumlahMinuman;
    }

    public void setJumlahMinuman(String jumlahMinuman) {
        this.jumlahMinuman = jumlahMinuman;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idTransaksi);
        hash = 67 * hash + Objects.hashCode(this.namaPelanggan);
        hash = 67 * hash + Objects.hashCode(this.namaMakanan);
        hash = 67 * hash + Objects.hashCode(this.hargaMakanan);
        hash = 67 * hash + Objects.hashCode(this.jumlahMakanan);
        hash = 67 * hash + Objects.hashCode(this.namaMinuman);
        hash = 67 * hash + Objects.hashCode(this.hargaMinuman);
        hash = 67 * hash + Objects.hashCode(this.jumlahMinuman);
        hash = 67 * hash + Objects.hashCode(this.totalBayar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaksi other = (Transaksi) obj;
        if (!Objects.equals(this.idTransaksi, other.idTransaksi)) {
            return false;
        }
        if (!Objects.equals(this.namaPelanggan, other.namaPelanggan)) {
            return false;
        }
        if (!Objects.equals(this.namaMakanan, other.namaMakanan)) {
            return false;
        }
        if (!Objects.equals(this.hargaMakanan, other.hargaMakanan)) {
            return false;
        }
        if (!Objects.equals(this.jumlahMakanan, other.jumlahMakanan)) {
            return false;
        }
        if (!Objects.equals(this.namaMinuman, other.namaMinuman)) {
            return false;
        }
        if (!Objects.equals(this.hargaMinuman, other.hargaMinuman)) {
            return false;
        }
        if (!Objects.equals(this.jumlahMinuman, other.jumlahMinuman)) {
            return false;
        }
        if (!Objects.equals(this.totalBayar, other.totalBayar)) {
            return false;
        }
        return true;
    }

    
    
    
}
