package cGUI;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
		
		uomo.setLocationRelativeTo(null);
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
//	public void ApriInfoProdotti(){
//		CategoriaUomo catuomo= new CategoriaUomo();
//		try {
//			InfoProdottoFrame info=new InfoProdottoFrame();
//			int index=catuomo.tablePantaloni.getSelectedRow();
//   		javax.swing.table.TableModel model=catuomo.tablePantaloni.getModel();
//   		String nome= model.getValueAt(index, 0).toString();
//   		String prezzo=model.getValueAt(index, 1).toString();
//   		ImageIcon image1 = (ImageIcon)catuomo.tablePantaloni.getValueAt(index, 3);
//        Image image2 = image1.getImage().getScaledInstance(catuomo.lblImage.getWidth(), catuomo.lblImage.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image3 = new ImageIcon(image2);
//        info.lblFoto.setIcon(image3);
//   		info.setVisible(true);
//
//   		info.setLocationRelativeTo(null);
//   		
//   		info.setDefaultCloseOperation(CategoriaUomo.DISPOSE_ON_CLOSE);
//   		
//   		info.txtNome.setText(nome);
//   		info.txtPrezzo.setText(prezzo);
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Selezionare prodotto", "ERROR", JOptionPane.ERROR_MESSAGE);
//		}
//	}
	

}
