package cGUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.Prodotto;
import bDao.FelpeDao;
import bDao.GiaccheDao;
import bDao.MaglieriaDao;
import bDao.PantaloneDao;

import javax.swing.ImageIcon;
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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;

public class CategoriaUomo extends JFrame {

	private JPanel contentPane;
	StoreController ctrl=new StoreController();
	private final JPanel parentPanel = new JPanel();
	Prodotto p;
	ArrayList<Prodotto> prodotti;
	PantaloneDao pDao=new PantaloneDao();
	MaglieriaDao mDao=new MaglieriaDao();
	FelpeDao fDao=new FelpeDao();
	GiaccheDao gDao=new GiaccheDao();
	DefaultTableModel tab;
	private JTable tableFelpe;
	private JTable tableMaglieria;
	private JTable tablePantaloni;
	private JTable tableGiacche;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoriaUomo frame = new CategoriaUomo();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
	public void RiempiGiacche() {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>(gDao.MostraGiacche());
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
		
		tableGiacche.setModel(tab);
	}	

	/**
	 * Create the frame.
	 */
	public CategoriaUomo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		parentPanel.setBounds(0, 270, 1172, 423);
		contentPane.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel pantaloni = new JPanel();
		parentPanel.add(pantaloni, "t1");
		pantaloni.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1172, 422);
		pantaloni.add(scrollPane);
		
		tablePantaloni = new JTable();
		scrollPane.setViewportView(tablePantaloni);
		
		JPanel felpe = new JPanel();
		parentPanel.add(felpe, "t2");
		felpe.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(0, 0, 1172, 423);
		felpe.add(scrollPane1);
		
		tableFelpe = new JTable();
		scrollPane1.setViewportView(tableFelpe);
		
		JPanel maglieria = new JPanel();
		parentPanel.add(maglieria, "t3");
		maglieria.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1172, 423);
		maglieria.add(scrollPane_1);
		
		tableMaglieria = new JTable();
		scrollPane_1.setViewportView(tableMaglieria);
		
		JPanel giacche = new JPanel();
		parentPanel.add(giacche, "name_160515266982800");
		giacche.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1172, 423);
		giacche.add(scrollPane_2);
		
		tableGiacche = new JTable();
		scrollPane_2.setViewportView(tableGiacche);
		
		JPanel panelSup = new JPanel();
		panelSup.setBackground(new Color(153,0,0));
		panelSup.setBounds(0, 0, 1172, 270);
		contentPane.add(panelSup);
		panelSup.setLayout(null);
		
		JPanel PantaloniPanel = new JPanel();
		PantaloniPanel.setBackground(new Color(255, 204, 0));
		PantaloniPanel.setBounds(0, 232, 170, 38);
		panelSup.add(PantaloniPanel);
		PantaloniPanel.setLayout(null);
		
		JLabel lblPantaloni = new JLabel("Pantaloni");
		lblPantaloni.addMouseMotionListener(new MouseMotionAdapter() {

		});
		lblPantaloni.setBounds(0, 0, 170, 38);
		PantaloniPanel.add(lblPantaloni);
		lblPantaloni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPantaloni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RiempiPantaloni();
				PantaloniPanel.setBackground(new Color(102, 0, 0));
				pantaloni.setVisible(true);
				felpe.setVisible(false);
				maglieria.setVisible(false);
				giacche.setVisible(false);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PantaloniPanel.setBackground(new Color(255, 204, 0));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				PantaloniPanel.setBackground(new Color(255, 255, 204));
			}
			
			
		});
		lblPantaloni.setBackground(Color.GRAY);
		lblPantaloni.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel FelpePanel = new JPanel();
		FelpePanel.setLayout(null);
		FelpePanel.setBounds(168, 232, 170, 38);
		panelSup.add(FelpePanel);
		
		JLabel lblFelpe = new JLabel("Felpe");
		lblFelpe.setBackground(new Color(255, 255, 255));
		lblFelpe.setBounds(0, 0, 170, 38);
		FelpePanel.add(lblFelpe);
		lblFelpe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RiempiFelpe();
				pantaloni.setVisible(false);
				felpe.setVisible(true);
				maglieria.setVisible(false);
				giacche.setVisible(false);
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		lblFelpe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFelpe.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel MaglieriaPanel = new JPanel();
		MaglieriaPanel.setLayout(null);
		MaglieriaPanel.setBounds(337, 232, 170, 38);
		panelSup.add(MaglieriaPanel);
		
		JLabel lblMaglieria = new JLabel("Maglieria");
		lblMaglieria.setBounds(0, 0, 170, 38);
		MaglieriaPanel.add(lblMaglieria);
		lblMaglieria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RiempiMaglieria();
				pantaloni.setVisible(false);
				felpe.setVisible(false);
				maglieria.setVisible(true);
				giacche.setVisible(false);
			}
		});
		lblMaglieria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaglieria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(12, 30, 189, 170);
		panelSup.add(lblLogo);
		ImageIcon logoicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/FERNANDAL (1).png")));
		   Image logoimage=logoicon.getImage();
		   Image logomodificata=logoimage.getScaledInstance(lblLogo.getWidth(),lblLogo.getHeight(), Image.SCALE_SMOOTH);
		   ImageIcon finale=new ImageIcon(logomodificata);
		   lblLogo.setIcon(finale);
		   
		   JPanel GiacchePanel = new JPanel();
		   GiacchePanel.setLayout(null);
		   GiacchePanel.setBounds(506, 232, 170, 38);
		   panelSup.add(GiacchePanel);
		   
		   JLabel lblGiacche = new JLabel("Giacche");
		   lblGiacche.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseClicked(MouseEvent e) {
		   		RiempiGiacche();
		   		pantaloni.setVisible(false);
				felpe.setVisible(false);
				maglieria.setVisible(false);
				giacche.setVisible(true);
		   	}
		   });
		   lblGiacche.setHorizontalAlignment(SwingConstants.CENTER);
		   lblGiacche.setFont(new Font("Tahoma", Font.PLAIN, 18));
		   lblGiacche.setBounds(0, 0, 170, 38);
		   GiacchePanel.add(lblGiacche);
	}
}
