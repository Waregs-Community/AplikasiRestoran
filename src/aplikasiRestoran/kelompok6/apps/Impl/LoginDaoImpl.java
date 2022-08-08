package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Login;
import aplikasiRestoran.kelompok6.apps.exception.LoginException;
import aplikasiRestoran.kelompok6.apps.service.LoginDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginDaoImpl implements LoginDao{
    
    private Connection connection;
    
    private final String getData = "SELECT * FROM login";

    public LoginDaoImpl(Connection connection){
        this.connection = connection;
    }
  

    @Override
    public Login getDataLogin() throws LoginException {
        PreparedStatement statement = null;
        
        String sql = getData;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            
            Login login = null;
            
            if(result.next()){
                
                login = new Login();
                login.setUs(result.getString("username"));
                login.setPs(result.getString("password"));
            }else{
                throw new LoginException("Data Login Tidak Ditemukan Didalam Database.");
            }
            connection.commit();
            return login;
        } catch (SQLException ex) {
            try{
                connection.rollback();
            }catch(SQLException x){
                
            }
            throw new LoginException(ex.getMessage());
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
