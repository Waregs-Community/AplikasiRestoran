package aplikasiRestoran.kelompok6.apps.entity;

import java.util.Objects;


public class Pelanggan {
    
    private int idMakanan;
    private int idMinuman;
    private String namaMakanan;
    private String namaMinuman;
    private int hargaMakanan;
    private int hargaMinuman;
    private int qtyMakanan;
    private int qtyMinuman;
    private String namaPemesan;
    private int totalHarga;

    public Pelanggan(){
    
    }
    
    public Pelanggan(int idMakanan, int idMinuman, String namaMakanan, String namaMinuman, int hargaMakanan, int hargaMinuman, int qtyMakanan, int qtyMinuman, String namaPemesan, int totalHarga){
        this.idMakanan = idMakanan;
        this.idMakanan = idMinuman;
        this.namaMakanan = namaMakanan;
        this.namaMinuman = namaMinuman;
        this.hargaMakanan = hargaMakanan;
        this.hargaMinuman = hargaMinuman;
        this.qtyMakanan = qtyMakanan;
        this.qtyMinuman = qtyMinuman;
        this.namaPemesan = namaPemesan;
        this.totalHarga = totalHarga;
    }
    
    public int getIdMakanan() {
        return idMakanan;
    }
    public void setIdMakanan(int idMakanan) {
        this.idMakanan = idMakanan;
    }

    public int getIdMinuman() {
        return idMinuman;
    }
    public void setIdMinuman(int idMinuman) {
        this.idMinuman = idMinuman;
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
    
    public int getHargaMakanan() {
        return hargaMakanan;
    }
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getHargaMinuman() {
        return hargaMinuman;
    }
    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public int getQtyMakanan() {
        return qtyMakanan;
    }
    public void setQtyMakanan(int qtyMakanan) {
        this.qtyMakanan = qtyMakanan;
    }

    public int getQtyMinuman() {
        return qtyMinuman;
    }
    public void setQtyMinuman(int qtyMinuman) {
        this.qtyMinuman = qtyMinuman;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idMakanan;
        hash = 23 * hash + this.idMinuman;
        hash = 23 * hash + Objects.hashCode(this.namaMakanan);
        hash = 23 * hash + Objects.hashCode(this.namaMinuman);
        hash = 23 * hash + this.hargaMakanan;
        hash = 23 * hash + this.hargaMinuman;
        hash = 23 * hash + this.qtyMakanan;
        hash = 23 * hash + this.qtyMinuman;
        hash = 23 * hash + Objects.hashCode(this.namaPemesan);
        hash = 23 * hash + this.totalHarga;
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
        final Pelanggan other = (Pelanggan) obj;
        if (this.idMakanan != other.idMakanan) {
            return false;
        }
        if (this.idMakanan != other.idMakanan) {
            return false;
        }
        if (!Objects.equals(this.namaMakanan, other.namaMakanan)) {
            return false;
        }
        if (!Objects.equals(this.namaMinuman, other.namaMinuman)) {
            return false;
        }
        if (this.hargaMakanan != other.hargaMakanan) {
            return false;
        }
        if (this.hargaMinuman != other.hargaMinuman) {
            return false;
        }
        if (this.qtyMakanan != other.qtyMakanan) {
            return false;
        }
        if (this.qtyMinuman != other.qtyMinuman) {
            return false;
        }
        if (this.totalHarga != other.totalHarga) {
            return false;
        }
        if (!Objects.equals(this.namaPemesan, other.namaPemesan)) {
            return false;
        }
        return true;
    }
    
}
