package aDeafultPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import bDao.*;


public class TableModel {
	Prodotto p;
	ArrayList<Prodotto> prodotti;
	PantaloneDao pDao=new PantaloneDao();
	MaglieriaDao mDao=new MaglieriaDao();
	FelpeDao fDao=new FelpeDao();
	GiaccheDao gDao=new GiaccheDao();
	

	
	public void header(JTable table) {
		table.getTableHeader().setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground((new Color(139, 16, 26)));
        table.getTableHeader().setForeground(new Color(255,255, 255));
      
		
	}
	

	private void nascondiColonna3(JTable table) {
		TableColumn colonna = null;
		colonna = table.getColumnModel().getColumn(3);
		colonna.setMaxWidth(0);
		colonna.setMinWidth(0);
		colonna.setWidth(0);
		colonna.setPreferredWidth(0);
		
	}
    

	public void RiempiPantaloni(JTable table) {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>();
		String[] nomeColonna= {"Nome","Prezzo","Quantità","Immagine"};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna)
		{
            @Override
            public Class<?> getColumnClass(int column) {
                if (column==3) return ImageIcon.class;
                return Object.class;
            }
        };
		
		prodotti.addAll(pDao.MostraPantaloni());
		for (Prodotto v:prodotti) {
			
			righe[0]=v.getNomeProdotto();
			righe[1]="£ "+v.getPrezzo();
			righe[2]=v.getQuantità();
		    righe[3]=new ImageIcon(v.getImage());
            tab.addRow(righe);
         }
		table.setModel(tab);
        header(table);
		nascondiColonna3(table);
	}
	
	





	

}
