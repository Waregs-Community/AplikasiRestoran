package aplikasiRestoran.kelompok6.apps.model;

import aplikasiRestoran.kelompok6.apps.entity.Admin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelMinumanModel extends AbstractTableModel{
    
    List<Admin> list = new ArrayList<Admin>();

    public void setList(List<Admin> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getHarga();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int index){
        switch(index){
            case 0:
                return "ID Minuman";
            case 1:
                return "Nama Minuman";
            case 2:
                return "Harga Minuman";
            default:
                return null;
        }
    }

    public boolean add(Admin e) {
        try{
            return list.add(e);
        }finally{
            this.fireTableRowsInserted(this.getRowCount()-1, this.getRowCount()-1);
        }
        
    }

    public Admin get(int i) {
        return list.get(i);
    }

    public Admin set(int i, Admin e) {
        try{
            return list.set(i, e);
        }finally{
            this.fireTableRowsUpdated(i, i);
        }
        
    }

    public Admin remove(int i) {
        try{
            return list.remove(i);
        }finally{
            this.fireTableRowsDeleted(i, i);
        }
        
    }
    
    
    
    
}
