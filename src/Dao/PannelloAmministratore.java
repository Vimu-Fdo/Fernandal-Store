package Dao;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
class PannelloAmministratore extends javax.swing.JTable{

	private JFrame frame;
	private JTable table;
	private JComboBox comboBox;
	Pantalone p;
	ArrayList<Pantalone> panta;
	PantaloneDao pDao=new PantaloneDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PannelloAmministratore window = new PannelloAmministratore();
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
	public PannelloAmministratore() {
		initialize();
		Riempi();
	}
	
	public void Riempi() {
		Object[][] righe= new Object[panta.size()][5];
		panta=pDao.MostraPantalone();
		comboBox.removeAllItems();
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità","image"};
		
		panta.addAll(pDao.MostraPantalone());
		for (int i=0; i<panta.size();i++) {
			righe[i][0]=panta.get(i).getID();
			righe[i][1]=panta.get(i).getNomeProdotto();
			righe[i][2]=panta.get(i).getPrezzo();
			righe[i][3]=panta.get(i).getQuantità();		
            if (panta.get(i).getImage() != null) {
				ImageIcon image=new ImageIcon(new ImageIcon(panta.get(i).getImage()).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
            	righe[i][4]=image;
			}else {
				righe[i][4]=null;
			}
		}
		TableModel tab=new TableModel(righe,nomeColonna);
		table.setModel(tab);
	    table.setRowHeight(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
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
