package aplikasiRestoran.kelompok6.apps.database;

import aplikasiRestoran.kelompok6.apps.Impl.AdminDaoImpl;
import aplikasiRestoran.kelompok6.apps.Impl.PelangganDaoImpl;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import aplikasiRestoran.kelompok6.apps.service.PelangganDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

public class AplikasiRestoranDB {

    private static Connection connection;
    private static AdminDao adminDao;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
    
        if(connection == null){
            try{
            //Buat koneksi
            MysqlDataSource dataSource = new MysqlDataSource();
            
            //Set Nilai URL, username, & password dari db yg diacu
            dataSource.setURL("jdbc:mysql://localhost/aplikasirestoran_db");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            //Isi atribut connection dengan informasi database(db_rest)
            connection = (Connection) dataSource.getConnection();
            }catch (Exception e){
            
            } 
        }
        return connection;
    
    } 
    
    public static AdminDao getData() throws SQLException{
        
        if(adminDao == null){
            adminDao = new AdminDaoImpl(getConnection());
        }
        
        return adminDao;
        
    }
    
    public static PelangganDao getTransaksi() throws SQLException{
        if(pelangganDao == null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        
        return pelangganDao;
    }
    
}
