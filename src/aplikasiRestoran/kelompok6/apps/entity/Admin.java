package aplikasiRestoran.kelompok6.apps.entity;

import java.util.Objects;

public class Admin {
    
    private int id;
    private String nama;
    private int harga;
    
    
    public Admin(){}
    
    public Admin(int id, String nama, int harga){
    
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nama);
        hash = 23 * hash + this.harga;
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
        final Admin other = (Admin) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.harga != other.harga) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return true;
    }
    
    
}
