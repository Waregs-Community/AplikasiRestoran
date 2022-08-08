package aplikasiRestoran.kelompok6.apps.service;

import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;


public interface PelangganDao {
    
    public void insertPesanan(Pelanggan pesanan) throws PelangganException;
    public Pelanggan getHMakananById(Integer id) throws PelangganException;
    public Pelanggan getHMinumanById(Integer id) throws PelangganException;
    public Pelanggan getIdByName(String namaMakanan, String namaMinuman) throws PelangganException;
    
}
