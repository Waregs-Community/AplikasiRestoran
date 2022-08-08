package aplikasiRestoran.kelompok6.apps.service;

import aplikasiRestoran.kelompok6.apps.entity.Login;
import aplikasiRestoran.kelompok6.apps.exception.LoginException;
import java.util.List;

public interface LoginDao {
    
    public Login getDataLogin() throws LoginException;
    
}
