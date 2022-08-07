package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Home;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import aplikasiRestoran.kelompok6.apps.view.Admin.AdminView;
import java.sql.SQLException;

public class HomeModel {
    
//    private String totalProduk;
//    private String totalPenjualan;
//    private String totalPenghasilan;
//
//    public String getTotalProduk() {
//        return totalProduk;
//    }
//
//    public void setTotalProduk(String totalProduk) {
//        this.totalProduk = totalProduk;
//    }
//
//    public String getTotalPenjualan() {
//        return totalPenjualan;
//    }
//
//    public void setTotalPenjualan(String totalPenjualan) {
//        this.totalPenjualan = totalPenjualan;
//    }
//
//    public String getTotalPenghasilan() {
//        return totalPenghasilan;
//    }
//
//    public void setTotalPenghasilan(String totalPenghasilan) {
//        this.totalPenghasilan = totalPenghasilan;
//    }
    
    public void tampilDataHome(AdminView view) throws SQLException, AdminException {
        Home home = new Home();
        
        view.getTxtTotalProduk().setText(home.getTotalProduk());
//        home.setTotalProduk(totalProduk);
//        home.setTotalPenjualan(totalPenjualan);
//        home.setTotalPenghasilan(totalPenghasilan);

    }
    
    
    
}
