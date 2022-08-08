package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Login;
import aplikasiRestoran.kelompok6.apps.event.LoginListener;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.exception.LoginException;
import aplikasiRestoran.kelompok6.apps.service.LoginDao;
import aplikasiRestoran.kelompok6.apps.view.Admin.AdminView;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginModel {
    
    private String username;
    private String password;
    private LoginListener listener;

    public LoginListener getListener() {
        return listener;
    }

    public void setListener(LoginListener listener) {
        this.listener = listener;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
        this.fireOnChange();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
        this.fireOnChange();
    }
    
    protected void fireOnChange(){
        if(listener != null){
            listener.onChange(this);
        }
    }
    
    public void login() throws SQLException, LoginException, AdminException{
        LoginDao dao = AplikasiRestoranDB.getDataLogin();
        Login login = new Login();
        
        login = dao.getDataLogin();;
        
        login.setUsername(this.username);
        login.setPassword(this.password);
        this.fireOnChange();
        
        if(!login.getUs().equals(login.getUsername())){
            JOptionPane.showMessageDialog(null, "Username atau Password Salah");
        }else{
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            tampilAdminView();
        }
    }
    
    public void tampilAdminView() throws SQLException, AdminException{
        AdminView tampil = new AdminView();
        tampil.setVisible(true);
    }
    
}
