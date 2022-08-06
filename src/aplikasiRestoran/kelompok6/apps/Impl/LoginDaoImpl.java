package aplikasiRestoran.kelompok6.apps.Impl;

import aplikasiRestoran.kelompok6.apps.entity.Login;
import aplikasiRestoran.kelompok6.apps.exception.LoginException;
import aplikasiRestoran.kelompok6.apps.service.LoginDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author X260
 */
public class LoginDaoImpl implements LoginDao{
    private Connection connection;
    
    private final String getByUsernamePassword = "SELECT * FROM login whereusername =? AND password = ?";

    public LoginDaoImpl(Connection connection){
        this.connection = connection;
    }
  

    @Override
    public Login getLoginId(int id) throws LoginException {
        PreparedStatement statement = null;
        
        try{
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByUsernamePassword);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Login login = null;
            
            if(result.next()){
                
                login = new Login();
                login.setUsername(result.getString("username"));
                login.setPassword(result.getString("password"));
            }else{
                throw new LoginException("Username atau Password Salah");
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

    @Override
    public void readLogin(Login login) throws LoginException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Login> selectAllData() throws LoginException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLoginId(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
