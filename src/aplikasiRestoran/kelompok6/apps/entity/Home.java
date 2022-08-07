package aplikasiRestoran.kelompok6.apps.entity;

import java.util.Objects;

public class Home {
    
    private String totalProduk;
    private String totalPenjualan;
    private String totalPenghasilan;
    
    public Home(){}
    
    public Home(String totalProduk, String totalPenjualan, String totalPenghasilan){
        this.totalProduk = totalProduk;
        this.totalPenjualan = totalPenjualan;
        this.totalPenghasilan = totalPenghasilan;
    }

    public String getTotalProduk() {
        return totalProduk;
    }

    public void setTotalProduk(String totalProduk) {
        this.totalProduk = totalProduk;
    }

    public String getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(String totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    public String getTotalPenghasilan() {
        return totalPenghasilan;
    }

    public void setTotalPenghasilan(String totalPenghasilan) {
        this.totalPenghasilan = totalPenghasilan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.totalProduk);
        hash = 13 * hash + Objects.hashCode(this.totalPenjualan);
        hash = 13 * hash + Objects.hashCode(this.totalPenghasilan);
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
        final Home other = (Home) obj;
        if (!Objects.equals(this.totalProduk, other.totalProduk)) {
            return false;
        }
        if (!Objects.equals(this.totalPenjualan, other.totalPenjualan)) {
            return false;
        }
        if (!Objects.equals(this.totalPenghasilan, other.totalPenghasilan)) {
            return false;
        }
        return true;
    }
    
    
    
}
