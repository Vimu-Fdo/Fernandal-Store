package cGUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.FelpeDao;
import bDao.MaglieriaDao;
import bDao.PantaloneDao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class CategoriaUomo extends JFrame {

	private JPanel contentPane;
	StoreController ctrl=new StoreController();
	private final JPanel parentPanel = new JPanel();
	private JTable tablePantaloni;
	Prodotto p;
	ArrayList<Prodotto> prodotti;
	PantaloneDao pDao=new PantaloneDao();
	MaglieriaDao mDao=new MaglieriaDao();
	FelpeDao fDao=new FelpeDao();
	DefaultTableModel tab;
	private JTable tableFelpe;
	private JTable tableMaglieria;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoriaUomo frame = new CategoriaUomo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void RiempiPantaloni() {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>(pDao.MostraPantaloni());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:prodotti) {
			righe[0]=v.getID();
			righe[1]=v.getNomeProdotto();
			righe[2]=v.getPrezzo();
			righe[3]=v.getQuantità();		
            tab.addRow(righe);
		
	    }
		
		tablePantaloni.setModel(tab);
	    
	}
	public void RiempiMaglieria() {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>(mDao.MostraMaglieria());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:prodotti) {
			righe[0]=v.getID();
			righe[1]=v.getNomeProdotto();
			righe[2]=v.getPrezzo();
			righe[3]=v.getQuantità();		
            tab.addRow(righe);
		
	    }
		
		tableMaglieria.setModel(tab);
	    
	}
	public void RiempiFelpe() {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>(fDao.MostraFelpe());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:prodotti) {
			righe[0]=v.getID();
			righe[1]=v.getNomeProdotto();
			righe[2]=v.getPrezzo();
			righe[3]=v.getQuantità();		
            tab.addRow(righe);
		
	    }
		
		tableFelpe.setModel(tab);
	    
	}

	/**
	 * Create the frame.
	 */
	public CategoriaUomo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		parentPanel.setBounds(0, 282, 1282, 441);
		contentPane.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel pantaloni = new JPanel();
		parentPanel.add(pantaloni, "t1");
		pantaloni.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1282, 441);
		pantaloni.add(scrollPane);
		
		tablePantaloni = new JTable();
		scrollPane.setViewportView(tablePantaloni);
		
		JPanel felpe = new JPanel();
		parentPanel.add(felpe, "t2");
		felpe.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(0, 0, 1282, 441);
		felpe.add(scrollPane1);
		
		tableFelpe = new JTable();
		scrollPane1.setViewportView(tableFelpe);
		
		JPanel maglieria = new JPanel();
		parentPanel.add(maglieria, "t3");
		maglieria.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1282, 441);
		maglieria.add(scrollPane_1);
		
		tableMaglieria = new JTable();
		scrollPane_1.setViewportView(tableMaglieria);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(0, 0, 1286, 284);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pantaloniPanel = new JPanel();
		pantaloniPanel.setBounds(0, 213, 175, 38);
		panel.add(pantaloniPanel);
		pantaloniPanel.setLayout(null);
		
		JLabel lblPantaloni = new JLabel("Pantaloni");
		lblPantaloni.setBounds(0, 10, 175, 38);
		pantaloniPanel.add(lblPantaloni);
		lblPantaloni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPantaloni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RiempiPantaloni();
				
				pantaloni.setVisible(true);
				felpe.setVisible(false);
				maglieria.setVisible(false);
				
			}
		});
		lblPantaloni.setBackground(Color.GRAY);
		lblPantaloni.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(175, 213, 175, 38);
		panel.add(panel_1);
		
		JLabel lblFelpe = new JLabel("Felpe");
		lblFelpe.setBounds(0, 0, 175, 38);
		panel_1.add(lblFelpe);
		lblFelpe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RiempiFelpe();
				pantaloni.setVisible(false);
				felpe.setVisible(true);
				maglieria.setVisible(false);
				
				
			}
		});
		lblFelpe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFelpe.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(350, 213, 175, 38);
		panel.add(panel_2);
		
		JLabel lblMaglieria = new JLabel("Maglieria");
		lblMaglieria.setBounds(0, 0, 175, 38);
		panel_2.add(lblMaglieria);
		lblMaglieria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RiempiMaglieria();
				pantaloni.setVisible(false);
				felpe.setVisible(false);
				maglieria.setVisible(true);
			}
		});
		lblMaglieria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaglieria.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}
