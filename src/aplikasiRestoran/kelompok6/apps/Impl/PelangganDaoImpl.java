package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PelangganDaoImpl implements PelangganDao{
    
    private PelangganView view;
    private Connection connection;
    private final String insertPesanan = "INSERT INTO transaksi"
                                        + "(nama_pelanggan, id_makanan,harga_makanan,total_makanan, id_minuman,harga_minuman,total_minuman,total_bayar)"
                                        + "VALUES ( ?, ?, ?, ?, ?, ?, ?,?)";
    private final String selectAllMakanan  = "SELECT * FROM makanan";
    private final String selectAllMinuman  = "SELECT * FROM minuman";
    private final String getHMakananById = "SELECT * FROM makanan WHERE id_makanan =?";
    private final String getHMinumanById = "SELECT * FROM minuman WHERE id_minuman =?";
    
    public PelangganDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    //Method utk menampilkan harga makanan by id
    @Override
    public Pelanggan getHMakananById(Integer id) throws PelangganException {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(getHMakananById);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Pelanggan harga = null;
            
            if(result.next()){
                harga = new Pelanggan();
                harga.setHargaMakanan(result.getInt("harga_makanan"));
                
            }else{
                throw new PelangganException("Data Harga Makanan dengan ID = "+id
                                            +" Tidak Ditemukan di DataBase");
            }
            return harga;
        }catch(SQLException ex){
            throw new PelangganException(ex.getMessage());
        }
        finally{
            if(statement != null){
                try{
                    statement.close();
                } catch(SQLException ex){
                    
                }
            }
        }
    }

    //Method utk menampilkan harga minuman by id
    @Override
    public Pelanggan getHMinumanById(Integer id) throws PelangganException {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(getHMinumanById);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Pelanggan harga = null;
            
            if(result.next()){
                harga = new Pelanggan();
                harga.setHargaMinuman(result.getInt("harga_minuman"));
                
            }else{
                throw new PelangganException("Data Harga Minuman dengan ID = "+id
                                            +" Tidak Ditemukan di DataBase");
            }
            return harga;
        }catch(SQLException ex){
            throw new PelangganException(ex.getMessage());
        }
        finally{
            if(statement != null){
                try{
                    statement.close();
                } catch(SQLException ex){
                    
                }
            }
        }
    }
    
    //Method untuk insert pesanan ke tabel transaksi
    @Override
    public void insertPesanan(Pelanggan pesanan) throws PelangganException {
        PreparedStatement statement = null;
        
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPesanan);
            
            statement.setString(1, pesanan.getNamaPemesan());
            statement.setInt(2, pesanan.getIdMakanan());
            statement.setInt(3, pesanan.getHargaMakanan());
            statement.setInt(4, pesanan.getQtyMakanan());
            statement.setInt(5, pesanan.getIdMinuman());
            statement.setInt(6, pesanan.getHargaMinuman());
            statement.setInt(7, pesanan.getQtyMinuman());
            statement.setInt(8, pesanan.getTotalHarga());
            statement.executeUpdate();    
            
            connection.commit();
        } catch (SQLException ex) {
            try{
                connection.rollback();
            } catch(SQLException e){
            
            }
            throw new PelangganException(ex.getMessage());
        } 
        finally{
            try{
                connection.setAutoCommit(true);
            } catch(SQLException e){
            
            }
            if(statement != null){
                try{
                    statement.close();
                } catch(SQLException ex){
                
                }
            }
        } 
    }
}
