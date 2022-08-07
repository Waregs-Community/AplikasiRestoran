package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.entity.Admin;
import aplikasiRestoran.kelompok6.apps.entity.Transaksi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelTransaksiModel extends AbstractTableModel{

    List<Transaksi> list = new ArrayList<Transaksi>();

    public void setList(List<Transaksi> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getIdTransaksi();
            case 1:
                return list.get(rowIndex).getNamaPelanggan();
            case 2:
                return list.get(rowIndex).getNamaMakanan();
            case 3:
                return list.get(rowIndex).getHargaMakanan();
            case 4:
                return list.get(rowIndex).getJumlahMakanan();
            case 5:
                return list.get(rowIndex).getNamaMinuman();
            case 6:
                return list.get(rowIndex).getHargaMinuman();
            case 7:
                return list.get(rowIndex).getJumlahMinuman();
            case 8:
                return list.get(rowIndex).getTotalBayar();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int index){
        switch(index){
            case 0:
                return "ID Transaksi";
            case 1:
                return "Nama Pelanggan";
            case 2:
                return "Nama Makanan";
            case 3:
                return "Harga Makanan";
            case 4:
                return "Jumlah Makanan";
            case 5:
                return "Nama Minuman";
            case 6:
                return "Harga Minuman";
            case 7:
                return "Jumlah Minuman";
            case 8:
                return "Total Bayar";
            default:
                return null;
        }
    }

    public Transaksi get(int i) {
        return list.get(i);
    }

    
}