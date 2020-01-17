package cGUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.*;

import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

class FramePantaloni extends javax.swing.JTable{

	private JFrame frame;
	private JTable table;
	private JComboBox comboBox;
	Prodotto p;
	ArrayList<Prodotto> pantaloni;
	PantaloneDao pDao=new PantaloneDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePantaloni window = new FramePantaloni();
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
	public FramePantaloni() {
		initialize();
		Riempi();
	}
	
	public void Riempi() {
		Object[] righe= new Object[4];
		pantaloni=new ArrayList<Prodotto>(pDao.MostraPantaloni());
		
		comboBox.removeAllItems();
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:pantaloni) {
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
		frame.setBounds(100, 100, 809, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(191, 244, 409, 237);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		comboBox = new JComboBox();
		comboBox.setBounds(101, 49, 146, 22);
		frame.getContentPane().add(comboBox);
	}
	
}
