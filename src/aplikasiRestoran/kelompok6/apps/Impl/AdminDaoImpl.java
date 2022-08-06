package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao{
    
    private Connection connection;
    private final String insertDataMakanan = "INSERT INTO makanan VALUES (?,?,?)";
    private final String updateDataMakanan = "UPDATE makanan SET nama_makanan = ?, harga_makanan = ? where id_makanan =?";
    private final String deleteDataMakanan = "DELETE FROM makanan WHERE id_makanan = ?";
    private final String getByIdMakanan = "SELECT * FROM makanan WHERE id_makanan=?";
    private final String selectAllMakanan = "SELECT * FROM makanan";
    
    private final String insertDataMinuman = "INSERT INTO minuman VALUES (?,?,?)";
    private final String updateDataMinuman = "UPDATE makanan SET nama_makanan = ?, harga_makanan = ? where id_makanan =?";
    private final String deleteDataMinuman = "DELETE FROM makanan WHERE id_makanan = ?";
    private final String getByIdMinuman = "SELECT * FROM makanan WHERE id_makanan=?";
    private final String selectAllMinuman = "SELECT * FROM makanan";
    
    private final String selectAllTransaksi = "SELECT * FROM transaksi";
    
    public AdminDaoImpl(Connection connection){
        this.connection = connection;
    }
    

    @Override
    public void insertData(Admin admin, String pilih) throws AdminException {
        
        PreparedStatement statement = null;
        
        String sql = null;
        
        if("makanan".equals(pilih)){
            sql = insertDataMakanan;
        }else{
            sql = insertDataMinuman;
        }
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            statement.setInt(1, admin.getId());
            statement.setString(2, admin.getNama());
            statement.setInt(3, admin.getHarga());
            statement.executeUpdate();
            
            connection.commit();
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new AdminException(ex.getMessage());
        } finally {
            try{
                connection.setAutoCommit(true);
            }catch(SQLException x){    
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
    public void updateData(Admin admin, String pilih) throws AdminException {
        PreparedStatement statement = null;
        
        String sql = null;
        
        if("makanan".equals(pilih)){
            sql = updateDataMakanan;
        }else{
            sql = updateDataMinuman;
        }
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            statement.setString(1, admin.getNama());
            statement.setInt(2, admin.getHarga());
            statement.setInt(3,admin.getId() );
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new AdminException(ex.getMessage());
        } finally {
            if(statement != null){
                try{
                    statement.close();
                } catch(SQLException ex){
                    
                }
            }
        }
    }

    @Override
    public void deleteData(int id, String pilih) throws AdminException {
        
        PreparedStatement statement = null;
        
        String sql = null;
        
        if("makanan".equals(pilih)){
            sql = deleteDataMakanan;
        }else{
            sql = deleteDataMinuman;
        }
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new AdminException(ex.getMessage());
        } finally {
            try{
                connection.setAutoCommit(true);
            }catch(SQLException x){    
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
    public Admin getDataId(int id, String pilih) throws AdminException {
        PreparedStatement statement = null;
        
        String sql = null;
        
        if("makanan".equals(pilih)){
            sql = getByIdMakanan;
        }else{
            sql = getByIdMinuman;
        }
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Admin admin = null;
            
            if(result.next()){
                
                admin = new Admin();
                admin.setId(result.getInt("id_makanan"));
                admin.setNama(result.getString("nama_makanan"));
                admin.setHarga(result.getInt("harga_makanan"));
            }else{
                throw new AdminException("Data Anggota dengan ID = " + id+ " Tidak Ditemukan Didalam Database.");
            }
            connection.commit();
            return admin;
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new AdminException(ex.getMessage());
        } finally {
            try{
                connection.setAutoCommit(true);
            }catch(SQLException x){    
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
    public List<Admin> selectAllData(String pilih) throws AdminException {
        
        PreparedStatement statement = null;
        String sql = null;
        
        if("makanan".equals(pilih)){
            sql = selectAllMakanan;
        }else if("minuman".equals(pilih)){
            sql = selectAllMinuman;
        }else{
            sql = selectAllTransaksi;
        }
        List<Admin> list = new ArrayList<Admin>();
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                Admin admin = new Admin();
                admin.setId(result.getInt("id_makanan"));
                admin.setNama(result.getString("nama_makanan"));
                admin.setHarga(result.getInt("harga_makanan"));
                
                list.add(admin);
            }
            connection.commit();
            return list;
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new AdminException(ex.getMessage());
        } finally {
            try{
                connection.setAutoCommit(true);
            }catch(SQLException x){    
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
