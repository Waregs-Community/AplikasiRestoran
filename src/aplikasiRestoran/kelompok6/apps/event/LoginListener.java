package aplikasiRestoran.kelompok6.apps.event;

import aplikasiRestoran.kelompok6.apps.model.LoginModel;

public interface LoginListener {
    
    public void onChange (LoginModel model);
    //Event yang akan terjadi jika ada perubahan data pada model
}
