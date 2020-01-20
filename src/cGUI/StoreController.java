package cGUI;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.MaglieriaDao;
import bDao.PantaloneDao;

public class StoreController {
	ArrayList<Prodotto> maglieria;
	MaglieriaDao mDao=new MaglieriaDao();

	public static void main(String[] args) {
		SchermataIniziale start=new SchermataIniziale();
		start.setVisible(true);

	}
	
	public void ApriCategoriaUomo() {
		CategoriaUomo uomo=new CategoriaUomo();
		uomo.setVisible(true);
		
	}
	 
	public void ApriPantaloni() {
		FramePantaloni pantaloni=new FramePantaloni();
		pantaloni.frame.setVisible(true); 
	}
	
	public void ApriFelpe() {
		FrameFelpe felpe=new FrameFelpe();
		felpe.frame.setVisible(true); 
	}
	public void ApriMaglieria() {
		FrameMaglieria maglieria=new FrameMaglieria();
		maglieria.frame.setVisible(true); 
	}
	public void ApriSchermataPrincipale() {
		SchermataIniziale start=new SchermataIniziale();
		start.setVisible(true);

	}
	public void ApriCategoriaDonna() {
		CategoriaDonna donna= new CategoriaDonna();
		donna.setVisible(true);
	}
	

}
