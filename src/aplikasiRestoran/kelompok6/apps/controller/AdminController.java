package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.view.Admin.AdminView;
import aplikasiRestoran.kelompok6.apps.view.Admin.DataMakananView;
import aplikasiRestoran.kelompok6.apps.view.Admin.DataMinumanView;
import aplikasiRestoran.kelompok6.apps.view.Admin.DataTransaksiView;
import aplikasiRestoran.kelompok6.apps.view.Admin.TentangKamiView;

public class AdminController {
    
    private DataMakananView dataMakananView;
    private DataMinumanView dataMinumanView;
    private DataTransaksiView dataTransaksiView;
    private TentangKamiView tentangKamiView;
    

    public void setDataMakananView(DataMakananView DataMakananView) {
        this.dataMakananView = DataMakananView;
    }

    public void setDataMinumanView(DataMinumanView dataMinumanView) {
        this.dataMinumanView = dataMinumanView;
    }

    public void setDataTransaksiView(DataTransaksiView dataTransaksiView) {
        this.dataTransaksiView = dataTransaksiView;
    }

    public void setTentangKamiView(TentangKamiView tentangKamiView) {
        this.tentangKamiView = tentangKamiView;
    }
    
    
    
    public void removePanel(AdminView admin){
        admin.getPanelMain().removeAll();
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
    }
    
    public void Home(AdminView admin){
        
        removePanel(admin);
        
        admin.getPanelMain().add(admin.getPanelHome());
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
        
    }
    
    public void dataMakanan(AdminView admin){
        
        removePanel(admin);
        
        admin.getPanelMain().add(dataMakananView.getPanelDataMakanan());
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
        
    }
    
    public void dataMinuman(AdminView admin){
        
        removePanel(admin);
        
        admin.getPanelMain().add(dataMinumanView.getPanelDataMinuman());
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
        
    }
    
    public void dataTransaksi(AdminView admin){
        
        removePanel(admin);
        
        admin.getPanelMain().add(dataTransaksiView.getPanelDataTransaksi());
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
        
    }
    
    public void tentangKami(AdminView admin){
        
        removePanel(admin);
        
        admin.getPanelMain().add(tentangKamiView.getPanelTentangKami());
        admin.getPanelMain().repaint();
        admin.getPanelMain().revalidate();
        
    }
    
}
