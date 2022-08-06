package aplikasiRestoran.kelompok6.apps.service;

import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.exception.AdminException;
import java.util.List;

public interface AdminDao {
    
    public void insertData(Admin admin, String pilih) throws AdminException;
    public void updateData(Admin admin, String pilih) throws AdminException;
    public void deleteData(int id, String pilih) throws AdminException;
    public Admin getDataId(int id, String pilih) throws AdminException;
    public List<Admin> selectAllData(String pilih) throws AdminException;
    
    
}
