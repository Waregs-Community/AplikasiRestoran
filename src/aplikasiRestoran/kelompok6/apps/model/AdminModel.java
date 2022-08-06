package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.database.AplikasiRestoranDB;
import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.event.AdminListener;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import aplikasiRestoran.kelompok6.apps.service.AdminDao;
import java.sql.SQLException;

public class AdminModel {
    
    private int id;
    private String nama;
    private int harga;
    private AdminListener listener;

    public AdminListener getListener() {
        return listener;
    }
    public void setListener(AdminListener listener) {
        this.listener = listener;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    protected void fireOnChange(){
        if(listener != null){
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Admin admin){
        if(listener != null){
            listener.onInsert(admin);
            this.fireOnChange();
        }
    }
    
    protected void fireOnUpdate(Admin admin){
        if(listener != null){
            listener.onUpdate(admin);
            this.fireOnChange();
        }
    }
    
    protected void fireOnDelete(){
        if(listener != null){
            listener.onDelete();
            this.fireOnChange();
        }
    }
    
    public void insertData() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        Admin admin = new Admin();
        
        admin.setId(this.id);
        admin.setNama(this.nama);
        admin.setHarga(this.harga);
        
        dao.insertData(admin, "makanan");
        this.fireOnInsert(admin);
    }
    
    public void updateData() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        Admin admin = new Admin();
        
        admin.setId(this.id);
        admin.setNama(this.nama);
        admin.setHarga(this.harga);
        
        dao.updateData(admin, "makanan");
        this.fireOnUpdate(admin);
    }
    
    public void deleteData() throws SQLException, AdminException{
        AdminDao dao = AplikasiRestoranDB.getData();
        dao.deleteData(id, "makanan");
        this.fireOnDelete();
    }
    
    public void resetData(){
        
        setId(0);
        setNama("");
        setHarga(0);
        this.fireOnChange();
    }
}
