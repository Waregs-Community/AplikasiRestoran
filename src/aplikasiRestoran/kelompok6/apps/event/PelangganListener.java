package aplikasiRestoran.kelompok6.apps.event;
import aplikasiRestoran.kelompok6.apps.model.PelangganModel;


public interface PelangganListener {
    
    void onChange(PelangganModel pelanggan);
    void onInsert(PelangganModel pelanggan);
}
