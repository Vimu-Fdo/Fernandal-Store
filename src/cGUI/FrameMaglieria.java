package cGUI;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.*;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FrameMaglieria {

	private JFrame frame;
	private JTable table;
	Prodotto p;
	ArrayList<Prodotto> maglieria;
	MaglieriaDao mDao=new MaglieriaDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMaglieria window = new FrameMaglieria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameMaglieria() {
		initialize();
		Riempi();
	}
	
	public void Riempi() {
		Object[] righe= new Object[4];
		maglieria=new ArrayList<Prodotto>(mDao.MostraMaglieria());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:maglieria) {
			righe[0]=v.getID();
			righe[1]=v.getNomeProdotto();
			righe[2]=v.getPrezzo();
			righe[3]=v.getQuantità();		
            tab.addRow(righe);
		
	    }
		
		table.setModel(tab);
	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 71, 261, 128);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
