package aplikasiRestoran.kelompok6.apps.service;

import aplikasiRestoran.kelompok6.apps.entity.Login;
import aplikasiRestoran.kelompok6.apps.exception.LoginException;
import java.util.List;

public interface LoginDao {
    
    public void readLogin(Login login) throws LoginException;
    //Abstrak Method untuk melakukan operasi login read
    public Login getLoginId(int id)throws LoginException;
    public List<Login> selectAllData() throws LoginException;

    public void getLoginId(Login login);
    
}
