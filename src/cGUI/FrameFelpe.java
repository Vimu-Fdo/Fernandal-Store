package cGUI;
import bDao.*;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameFelpe {

	public JFrame frame;
	Prodotto p;
	ArrayList<Prodotto> felpe;
    FelpeDao fDao=new FelpeDao();
    private JTable table;
    StoreController ctrl= new StoreController();
    private JButton btnIndietro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameFelpe window = new FrameFelpe();
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
	public FrameFelpe() {
		initialize();
		Riempi();
	}
	
	public void Riempi() {
		Object[] righe= new Object[4];
		felpe=new ArrayList<Prodotto>(fDao.MostraFelpe());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:felpe) {
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
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 78, 250, 119);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnIndietro = new JButton("Indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ApriCategoriaUomo();
				frame.dispose();
			}
		});
		btnIndietro.setBounds(293, 210, 97, 25);
		frame.getContentPane().add(btnIndietro);
	}

}
