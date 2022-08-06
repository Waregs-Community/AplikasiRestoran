package aplikasiRestoran.kelompok6.apps.event;

import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.model.AdminModel;

public interface AdminListener {
    
    void onChange(AdminModel admin);
    void onInsert(Admin admin);
    void onUpdate(Admin admin);
    void onDelete();
}
