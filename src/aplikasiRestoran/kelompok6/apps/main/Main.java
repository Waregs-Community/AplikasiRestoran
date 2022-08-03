package aplikasiRestoran.kelompok6.apps.main;
import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import java.sql.SQLException;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        //Main method sebagai class testing
        
        AplikasiRestoranDB.getConnection(); //Testing koneksi ke DataBase
    }
}
