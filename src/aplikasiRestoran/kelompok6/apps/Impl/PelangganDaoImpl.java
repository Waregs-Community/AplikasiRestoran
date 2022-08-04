package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Pelanggan;
import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    private final String insertPesanan = "INSERT INTO transaksi"
                                        + "(nama_pelanggan, id_makanan,harga_makanan,total_makanan, id_minuman,harga_minuman,total_minuman,total_bayar)"
                                        + "VALUES ( ?, ?, ?, ?, ?, ?, ?,?)";
    private final String getMakananId  = "SELECT * FROM makanan";
    
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
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(getMakananId);
            
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Pelanggan pelanggan = null;
            if(result.next()){
                pelanggan = new Pelanggan();
                pelanggan.setHargaMakanan(result.getInt("Id"));
//                getNamaMakanan().addItem(result.getString("nama_makanan"));
            }else {
                throw new PelangganException("Data Makanan dengan ID = " + id
                                            + " Tidak Ada");
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

    @Override
    public Pelanggan getCmbMinumanPerformed(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pelanggan> selectAllMakanan() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
//        PreparedStatement statement = null;
//        try{
//            statement = connection.prepareStatement(getMakananId);
//            
//            statement.setInt(1, id);
//            ResultSet result = statement.executeQuery();
//            
//            Pelanggan pelanggan = null;
//            if(result.next()){
//                pelanggan = new Pelanggan();
//                pelanggan.setHargaMakanan(result.getInt("Id"));
////                getNamaMakanan().addItem(result.getString("nama_makanan"));
//            }else {
//                throw new PelangganException("Data Makanan dengan ID = " + id
//                                            + " Tidak Ada");
//            }
//            return pelanggan;
//        }catch(SQLException ex){
//            throw new PelangganException(ex.getMessage());
//        }
//        finally{
//            if(statement != null){
//                try{
//                    statement.close();
//                } catch(SQLException ex){
//                
//                }
//            }
//        }
    

    @Override
    public List<Pelanggan> selectAllMinuman() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
