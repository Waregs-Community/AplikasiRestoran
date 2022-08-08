package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Home;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import aplikasiRestoran.kelompok6.apps.view.Admin.AdminView;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;

public class HomeModel {
    
    public String formatRP(Home home){
        int angka = Integer.valueOf(home.getTotalPenghasilan());
        
        String convert = NumberFormat.getNumberInstance(Locale.US).format(angka);
        convert=convert.replace(",",".");
        return ("Rp. "+ String.format(convert));

    }
    
    public void tampilDataHome(AdminView view) throws SQLException, AdminException {
        Home home;
        AdminDao dao = AplikasiRestoranDB.getData();
        home = dao.getDataHome();
        
        view.getTxtTotalProduk().setText(home.getTotalProduk());
        view.getTxtTotalPenjualan().setText(home.getTotalPenjualan());
        view.getTxtTotalPenghasilan().setText(this.formatRP(home));

    }
    
    
    
}
