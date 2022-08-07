package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.exception.PelangganException;
import aplikasiRestoran.kelompok6.apps.model.LoginModel;
import aplikasiRestoran.kelompok6.apps.view.LoginView;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;
import aplikasiRestoran.kelompok6.apps.view.PilihLoginView;
import java.sql.SQLException;


public class LoginController {
    
    private PilihLoginView pilihLoginView;
    private LoginView loginView;
    private PelangganView pelangganView;

    public PilihLoginView getPilihLoginView() {
        return pilihLoginView;
    }
    private LoginModel model;

    public LoginModel getModel() {
        return model;
    }

    public void setModel(LoginModel model) {
        this.model = model;
    }

   
    

    public void setPilihLoginView(PilihLoginView pilihLoginView) {
        this.pilihLoginView = pilihLoginView;
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public PelangganView getPelangganView() {
        return pelangganView;
    }

    public void setPelangganView(PelangganView pelangganView) {
        this.pelangganView = pelangganView;
    }
    
   
    public void tampilPelangganView() throws PelangganException, SQLException{
        PelangganView tampil = new PelangganView();
        tampil.setVisible(true);
        
    }
    public void tampilAdminView(){
        LoginView tampil = new LoginView();
        tampil.setVisible(true);
    }
    
    
    
}
