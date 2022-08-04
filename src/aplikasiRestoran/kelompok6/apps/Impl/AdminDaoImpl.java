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
    private final String insertData = "INSERT INTO makanan VALUES (?,?,?)";
    private final String updateData = "UPDATE makanan SET nama_makanan = ?, harga_makanan =? where id_makanan =?";
    private final String deleteData = "DELETE FROM makanan WHERE id_makanan = ?";
    private final String getById = "SELECT * FROM makanan WHERE id=?";
    private final String selectAll = "SELECT * FROM makanan";
    
    public AdminDaoImpl(Connection connection){
        this.connection = connection;
    }
    

    @Override
    public void insertData(Admin admin) throws AdminException {
        
        PreparedStatement statement = null;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertData);
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
    public void updateData(Admin admin) throws AdminException {
        PreparedStatement statement = null;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateData);
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
            if(statement != null){
                try{
                    statement.close();
                } catch(SQLException ex){
                    
                }
            }
        }
    }

    @Override
    public void deleteData(int id) throws AdminException {
        
        PreparedStatement statement = null;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteData);
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
    public Admin getDataId(int id) throws AdminException {
        PreparedStatement statement = null;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Admin admin = null;
            
            if(result.next()){
                
                admin = new Admin();
                admin.setId(result.getInt("id"));
                admin.setNama(result.getString("nama"));
                admin.setHarga(result.getInt("id"));
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
    public List<Admin> selectAllData() throws AdminException {
        PreparedStatement statement = null;
        List<Admin> list = new ArrayList<Admin>();
        
        try{
            connection.setAutoCommit(false);
            statement = (PreparedStatement) connection.createStatement();
            ResultSet result = statement.executeQuery(selectAll);
            
            while(result.next()){
                Admin admin = new Admin();
                admin.setId(result.getInt("id"));
                admin.setNama(result.getString("nama"));
                admin.setHarga(result.getInt("harga"));
                
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
