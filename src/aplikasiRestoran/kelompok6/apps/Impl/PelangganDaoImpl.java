package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    private final String insertPesanan = "INSERT INTO transaksi (nama_pelanggan, id_makanan, harga_makanan, total_makanan, id_minuman, harga_minuman, total_minuman, total_bayar) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
    private final String getHMakananById = "SELECT * FROM makanan WHERE id_makanan =?";
    private final String getHMinumanById = "SELECT * FROM minuman WHERE id_minuman =?";
    private final String getIdByName = "SELECT id_makanan, id_minuman FROM makanan INNER JOIN minuman WHERE nama_makanan=? && nama_minuman=?;";
    
    public PelangganDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    //Method untuk insert pesanan ke tabel transaksi
    @Override
    public void insertPesanan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPesanan);
            
            statement.setString(1, pelanggan.getNamaPemesan());
            statement.setInt(2, pelanggan.getIdMakanan());
            statement.setInt(3, pelanggan.getHargaMakanan());
            statement.setInt(4, pelanggan.getQtyMakanan());
            statement.setInt(5, pelanggan.getIdMinuman());
            statement.setInt(6, pelanggan.getHargaMinuman());
            statement.setInt(7, pelanggan.getQtyMinuman());
            statement.setInt(8, pelanggan.getTotalHarga());
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

    @Override
    public Pelanggan getIdByName(String namaMakanan, String namaMinuman) throws PelangganException {
        PreparedStatement statement = null;
        
        String sql = getIdByName;
        
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1, namaMakanan);
            statement.setString(2, namaMinuman);
            ResultSet result = statement.executeQuery();
            
            Pelanggan pelanggan = null;
            
            if(result.next()){
                pelanggan = new Pelanggan();

                pelanggan.setIdMakanan(result.getInt("id_makanan"));
                pelanggan.setIdMinuman(result.getInt("id_minuman"));
                
            }else{
                throw new PelangganException("Data ID dengan nama = "+namaMakanan+namaMinuman
                                            +" Tidak Ditemukan di DataBase");
            }
            return pelanggan;
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
   
}
