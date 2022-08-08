package aplikasiRestoran.kelompok6.apps.controller;


import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.LoginModel;
import aplikasiRestoran.kelompok6.apps.view.LoginView;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginController {
    
    private LoginModel model;

    public void setModel(LoginModel model) {
        this.model = model;
    }
    
    public void login(LoginView view) {
        
        
    String username = view.getTxtUsername().getText();
    String password = view.getTxtPassword().getText();
    
    try{
        if(username.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Username Tidak Boleh Kosong");
        }else if(password.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Password Tidak Boleh Kosong");
        }else{
            
            model.setUsername(username);
            model.setPassword(password);
            
            try{
                model.login(view);
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi Error Di Database Dengan Pesan", ex.getMessage()
                });
            }
            
        }
    }catch(Exception ex){}
    }
   
    public void loginView(){
        LoginView tampil = new LoginView();
        tampil.setVisible(true);
    }
    
    public void tampilPelangganView() throws PelangganException, SQLException{
        PelangganView tampil = new PelangganView();
        tampil.setVisible(true);
    }
    
    
    
}
