package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    private final String insertPesanan = "INSERT INTO transaksi"
                                        + "(nama_pelanggan, id_makanan,harga_makanan,total_makanan, id_minuman,harga_minuman,total_minuman,total_bayar)"
                                        + "VALUES ( ?, ?, ?, ?, ?, ?, ?,?)";
    private final String selectAllMakanan  = "SELECT * FROM makanan";
    private final String selectAllMinuman  = "SELECT * FROM minuman";
    
    public PelangganDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    
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

    @Override
    public Pelanggan getCmbMakananPerformed(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pelanggan getCmbMinumanPerformed(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //
    @Override
    public List<Pelanggan> selectAllMakanan() throws PelangganException {
        Statement statement = null;
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        
        try{
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectAllMakanan);
            
            while(result.next()){
                Pelanggan makanan = new Pelanggan();
                makanan.setNamaMakanan(result.getString("nama_makanan"));
                
                list.add(makanan);
            }
            
            return list;
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
    public List<Pelanggan> selectAllMinuman() throws PelangganException {
        Statement statement = null;
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        
        try{
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectAllMinuman);
            
            while(result.next()){
                Pelanggan minuman = new Pelanggan();
                minuman.setNamaMinuman(result.getString("nama_minuman"));
                
                list.add(minuman);
            }
            
            return list;
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
