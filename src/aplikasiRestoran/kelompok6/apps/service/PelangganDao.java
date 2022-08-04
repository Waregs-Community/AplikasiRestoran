package aplikasiRestoran.kelompok6.apps.service;

import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import java.util.List;


public interface PelangganDao {
    public void insertPesanan(Pelanggan pesanan) throws PelangganException;
    
    public Pelanggan getCmbMakananPerformed(Integer id) throws PelangganException;
    
    public Pelanggan getCmbMinumanPerformed(Integer id) throws PelangganException;
    
    public List<Pelanggan> selectAllMakanan() throws PelangganException;
    
    public List<Pelanggan> selectAllMinuman() throws PelangganException;
    
}
