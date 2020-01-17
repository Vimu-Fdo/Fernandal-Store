package zBin;


import javax.swing.table.AbstractTableModel;
import javax.swing.*;

public class TableModel extends AbstractTableModel {

	private String[] colonne;
	private Object[][] righe;
	
	public TableModel () {
		
	}
	
	public TableModel(Object[][] data,String[] nomecolonne ) {
		this.righe = data;
		this.colonne = nomecolonne;
		
	}


	public Class getColumnClass(int colonna) {
		if (colonna==4) {
			return Icon.class;
			
		}else {
			return getValueAt(0, colonna).getClass();
		}
		
		
		
	}
	
	
	public int getRowCount() {
		
		return this.righe.length;
	}

	public int getColumnCount() {
		return this.colonne.length;
		
	}
	
	public Object getValueAt(int indiceRighe, int indiceColonne) {
		
		return this.righe[indiceRighe][indiceColonne];
	}


	public String getColumnName(int col) {
		return this.colonne[col];
	}
	
	

}
