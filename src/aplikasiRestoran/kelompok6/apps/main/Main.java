package aplikasiRestoran.kelompok6.apps.main;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.sql.SQLException;


public class Main {
    
    public static void main(String[] args) throws SQLException, AdminException {
        //Main method sebagai class testing
        
        AplikasiRestoranDB.getConnection(); //Testing koneksi ke DataBase
        
        AdminDao dao = AplikasiRestoranDB.getData();
        Admin admin = new Admin();
        
        admin.setId(9);
        admin.setNama("Keberhasilan");
        admin.setHarga(1000);
        
        dao.insertData(admin);
    }
}
