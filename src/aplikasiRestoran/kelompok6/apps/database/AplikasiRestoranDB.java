package aplikasiRestoran.kelompok6.apps.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

public class AplikasiRestoranDB {

    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
    
        if(connection == null){
            //Buat koneksi
            MysqlDataSource dataSource = new MysqlDataSource();
            
            //Set Nilai URL, username, & password dari db yg diacu
            dataSource.setURL("jdbc:mysql://localhost:3306/db_rest");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            //Isi atribut connection dengan informasi database(db_rest)
            connection = (Connection) dataSource.getConnection();
        }
        return connection;
    
    } 
    
}
