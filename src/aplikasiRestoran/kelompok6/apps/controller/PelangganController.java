package aplikasiRestoran.kelompok6.apps.controller;

import aplikasiRestoran.kelompok6.apps.model.PelangganModel;
import aplikasiRestoran.kelompok6.apps.view.PelangganView;

public class PelangganController {
    
    private PelangganModel model;


    public PelangganModel getModel() {
        return model;
    }
    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void kirimPesanan(){
    
    }

    
    public void resetPesanan(PelangganView view){
        String namaPemesan = view.getTxtNamaPemesan().getText();
        String namaMakanan = view.getCmbMakanan().getSelectedItem().toString();
        String namaMinuman = view.getCmbMinuman().getSelectedItem().toString();
        String hargaMakanan = view.getTxtHargaMakanan().getText();
        String hargaMinuman = view.getTxtHargaMinuman().getText();
        String qtyMakanan = view.getTxtQtyMakanan().getText();
        String qtyMinuman = view.getTxtQtyMinuman().getText();
        String totalBayar = view.getTxtTotalHarga().getText();
        
        if(namaPemesan.equals("") && namaMakanan.equals("") & namaMinuman.equals("") && hargaMakanan.equals("") && hargaMinuman.equals("") 
                && qtyMakanan.equals("") && qtyMinuman.equals("") && totalBayar.equals("")){
            //do nothing
        }else {
            model.resetPesanan(view);
        }
        
    }
}
