package cGUI;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.*;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class FrameMaglieria {

	public JFrame frame;
	private JTable table;
	Prodotto p;
	ArrayList<Prodotto> maglieria;
	MaglieriaDao mDao=new MaglieriaDao();
	private JButton btnIndietro;
	StoreController ctrl= new StoreController();
	private JTable table_1;

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
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantitï¿½",};
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
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 803, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setName("");
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(new Color(240, 128, 128));
		scrollPane.setBounds(68, 71, 320, 110);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.ORANGE);
		table.setBackground(Color.RED);
		scrollPane.setViewportView(table);
		
		btnIndietro = new JButton("Indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.ApriCategoriaUomo();
				frame.dispose();
			}
		});
		btnIndietro.setBounds(291, 215, 97, 25);
		frame.getContentPane().add(btnIndietro);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(112, 311, 545, 229);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(table_1);
	}

	public void setVisible(boolean b) {
		
		
	}
}
