package cGUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.*;
import bDao.FelpeDao;
import bDao.GiaccheDao;
import bDao.MaglieriaDao;
import bDao.PantaloneDao;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.util.Locale;
import javax.swing.ListSelectionModel;

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
	public JTable tableFelpe;
	public JTable tableMaglieria;
	public JTable tablePantaloni;
	public JTable tableGiacche;
	TableModel table=new TableModel();
	InfoProdottoFrame info=new InfoProdottoFrame();
	public JPanel pantaloni;
	

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
//	public void RiempiPantaloni(JTable table) {
//		Object[] righe= new Object[4];
//		prodotti=new ArrayList<Prodotto>(pDao.MostraPantaloni());
//		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità",};
//		DefaultTableModel tab= new DefaultTableModel(null,nomeColonna);
////		panta.addAll(pDao.MostraPantalone());
//		for (Prodotto v:prodotti) {
//			righe[0]=v.getID();
//			righe[1]=v.getNomeProdotto();
//			righe[2]=v.getPrezzo();
//			righe[3]=v.getQuantità();		
//            tab.addRow(righe);
//		
//	    }
//		
//		table.setModel(tab);
//		header(table);
//	    
//	}
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
		header(tableMaglieria);
	    
	}
	public void RiempiFelpe() {
		Object[] righe= new Object[4];
		prodotti=new ArrayList<Prodotto>(fDao.MostraFelpe());
		String[] nomeColonna= {"ID","Nome","Prezzo","Quantità","immagine"};
		tab= new DefaultTableModel(null,nomeColonna);
//		panta.addAll(pDao.MostraPantalone());
		for (Prodotto v:prodotti) {
			righe[0]=v.getID();
			righe[1]=v.getNomeProdotto();
			righe[2]=v.getPrezzo();
			righe[3]=v.getQuantità();		
            tab.addRow(righe);
		
	    }
		
		tableFelpe.setModel(tab);
		header(tableFelpe);
	}
	
	public void header(JTable table) {
		table.getTableHeader().setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground((new Color(139, 16, 26)));
        table.getTableHeader().setForeground(new Color(255,255, 255));
		
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
		header(tableGiacche);
	}
	
	private void setColor(JPanel panel) {
		panel.setBackground(new Color(255, 188, 86));
	}
	
	private void resetColor(JPanel panel) {
		panel.setBackground(new Color(177, 95, 102));
	}
	
	private void enteredColor(JPanel panel) {
		panel.setBackground(new Color(245, 245, 245));
	}
	private void exitedColor(JPanel panel) {
		panel.setBackground(new Color(240, 240, 240));
	}

	/**
	 * Create the frame.
	 */
	public CategoriaUomo() {
		
		setTitle("FERN&NDAL Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CategoriaUomo.class.getResource("/icons/Market Square_40px.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 767);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		parentPanel.setBounds(281, 166, 1059, 450);
		parentPanel.setBackground(Color.WHITE);
		contentPane.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		
		JPanel FelpePanel = new JPanel();
		JPanel MaglieriaPanel = new JPanel();
		JPanel GiacchePanel = new JPanel();
		
		JPanel pantaloni=new JPanel();
		pantaloni.setBackground(Color.WHITE);
		parentPanel.add(pantaloni, "t1");
		pantaloni.setLayout(null);
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(759, 0, 292, 450);
		pantaloni.add(lblImage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(0, 0, 736, 450);
		pantaloni.add(scrollPane);
		
		tablePantaloni = new JTable();
		tablePantaloni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i =tablePantaloni.getSelectedRow();
		        if(tablePantaloni.getValueAt(i, 3) != null)
		        {
		        ImageIcon image1 = (ImageIcon)tablePantaloni.getValueAt(i, 3);
		        Image image2 = image1.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight()
		                 , Image.SCALE_SMOOTH);
		        ImageIcon image3 = new ImageIcon(image2);
		        lblImage.setIcon(image3);
		        }
		        else{
		            System.out.println("No Image");
		        }
			}
		});
		tablePantaloni.setRowHeight(120);
		tablePantaloni.setFillsViewportHeight(true);
		scrollPane.setViewportView(tablePantaloni);
		
		JPanel felpe = new JPanel();
		felpe.setBackground(Color.WHITE);
		parentPanel.add(felpe, "t2");
		felpe.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		scrollPane1.setForeground(Color.RED);
		scrollPane1.setOpaque(false);
		scrollPane1.setBounds(0, 0, 909, 450);
		felpe.add(scrollPane1);
		
		tableFelpe = new JTable();
		tableFelpe.setIntercellSpacing(new Dimension(0, 0));
		tableFelpe.setSurrendersFocusOnKeystroke(true);
		tableFelpe.setBorder(new EmptyBorder(0, 0, 0, 0));
		tableFelpe.setShowVerticalLines(false);
		tableFelpe.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tableFelpe.setSelectionBackground(new Color(255, 188, 86));
		tableFelpe.setLocale(Locale.ITALY);
		tableFelpe.setRowHeight(600);
		tableFelpe.setGridColor(new Color(255, 188, 86));
		tableFelpe.setSize(new Dimension(20, 100));
		tableFelpe.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		tableFelpe.setFillsViewportHeight(true);
		tableFelpe.setBackground(Color.WHITE);
		scrollPane1.setViewportView(tableFelpe);
		
		JPanel maglieria = new JPanel();
		maglieria.setBackground(Color.WHITE);
		parentPanel.add(maglieria, "t3");
		maglieria.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 921, 450);
		maglieria.add(scrollPane_1);
		
		tableMaglieria = new JTable();
		tableMaglieria.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(tableMaglieria);
		
		JPanel giacche = new JPanel();
		giacche.setBackground(Color.WHITE);
		parentPanel.add(giacche, "name_160515266982800");
		giacche.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 921, 450);
		giacche.add(scrollPane_2);
		
		tableGiacche = new JTable();
		tableGiacche.setFillsViewportHeight(true);
		tableGiacche.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(tableGiacche);
		
		JPanel latPanel = new JPanel();
		latPanel.setBounds(0, 0, 275, 732);
		latPanel.setBackground(Color.WHITE);
		contentPane.add(latPanel);
		latPanel.setLayout(null);
		
		JPanel PantaloniPanel = new JPanel();
		PantaloniPanel.setBackground(new Color(177, 95, 102));
		PantaloniPanel.setBounds(6, 299, 263, 38);
		latPanel.add(PantaloniPanel);
		PantaloniPanel.setLayout(null);
		
		JLabel lblPantaloni = new JLabel("    Pantaloni");
		lblPantaloni.setBounds(12, 0, 251, 38);
		PantaloniPanel.add(lblPantaloni);
		lblPantaloni.setForeground(Color.WHITE);
		lblPantaloni.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Trousers_25px_1.png")));
		lblPantaloni.addMouseMotionListener(new MouseMotionAdapter() {

		});
		lblPantaloni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPantaloni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				table.RiempiPantaloni(tablePantaloni);
//				header(tablePantaloni);
				pantaloni.setVisible(true);
				felpe.setVisible(false);
				maglieria.setVisible(false);
				giacche.setVisible(false);
							
			}
			
			
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(PantaloniPanel);
				resetColor(FelpePanel);
				resetColor(MaglieriaPanel);
				resetColor(GiacchePanel);
				
				
			}
		});
		lblPantaloni.setBackground(Color.GRAY);
		lblPantaloni.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		FelpePanel.setBackground(new Color(177, 95, 102));
		FelpePanel.setLayout(null);
		FelpePanel.setBounds(6, 339, 263, 38);
		latPanel.add(FelpePanel);
		
		JLabel lblFelpe = new JLabel("    Felpe");
		lblFelpe.setBounds(12, 0, 251, 38);
		FelpePanel.add(lblFelpe);
		lblFelpe.setForeground(Color.BLACK);
		lblFelpe.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Jacket_25px.png")));
		lblFelpe.setBackground(new Color(255, 255, 255));
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
			public void mousePressed(MouseEvent e) {
				setColor(FelpePanel);
				resetColor(PantaloniPanel);
				resetColor(MaglieriaPanel);
				resetColor(GiacchePanel);
			}
		});
		lblFelpe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFelpe.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		MaglieriaPanel.setBackground(new Color(177, 95, 102));
		MaglieriaPanel.setLayout(null);
		MaglieriaPanel.setBounds(6, 379, 263, 38);
		latPanel.add(MaglieriaPanel);
		
		JLabel lblMaglieria = new JLabel("    Maglieria");
		lblMaglieria.setForeground(Color.BLACK);
		lblMaglieria.setBounds(12, 0, 251, 38);
		MaglieriaPanel.add(lblMaglieria);
		lblMaglieria.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Jumper_25px.png")));
		lblMaglieria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RiempiMaglieria();
				pantaloni.setVisible(false);
				felpe.setVisible(false);
				maglieria.setVisible(true);
				giacche.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(MaglieriaPanel);
				resetColor(PantaloniPanel);
				resetColor(FelpePanel);
				resetColor(GiacchePanel);
			}
		});
		lblMaglieria.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaglieria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(33, 31, 189, 170);
		latPanel.add(lblLogo);
		ImageIcon logoicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/Fernandal Logo.png")));
		   Image logoimage=logoicon.getImage();
		   Image logomodificata=logoimage.getScaledInstance(lblLogo.getWidth(),lblLogo.getHeight(), Image.SCALE_SMOOTH);
		   ImageIcon finale=new ImageIcon(logomodificata);
		   lblLogo.setIcon(finale);
		   
		   
		   GiacchePanel.setBackground(new Color(177, 95, 102));
		   GiacchePanel.setBounds(6, 419, 263, 38);
		   latPanel.add(GiacchePanel);
		   GiacchePanel.setLayout(null);
		   
		   JLabel lblGiacche = new JLabel("    Giacche");
		   lblGiacche.setForeground(Color.BLACK);
		   lblGiacche.setBounds(12, 0, 251, 38);
		   GiacchePanel.add(lblGiacche);
		   lblGiacche.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Coat_25px.png")));
		   lblGiacche.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseClicked(MouseEvent e) {
		   		RiempiGiacche();
		   		pantaloni.setVisible(false);
				felpe.setVisible(false);
				maglieria.setVisible(false);
				giacche.setVisible(true);
		   	}
		   	@Override
		   	public void mousePressed(MouseEvent e) {
		   		setColor(GiacchePanel);
		   		resetColor(PantaloniPanel);
				resetColor(FelpePanel);
				resetColor(MaglieriaPanel);
				
		   	}
		   });
		   lblGiacche.setHorizontalAlignment(SwingConstants.LEFT);
		   lblGiacche.setFont(new Font("Tahoma", Font.PLAIN, 18));
		   
		   JLabel lblCategorie = new JLabel("Categorie");
		   lblCategorie.setForeground(Color.BLACK);
		   lblCategorie.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 21));
		   lblCategorie.setBounds(12, 254, 139, 27);
		   latPanel.add(lblCategorie);
		   
		   JPanel panel_1 = new JPanel();
		   panel_1.setBackground(Color.BLACK);
		   panel_1.setBounds(12, 210, 239, 2);
		   latPanel.add(panel_1);
		   
		   JPanel supPanel = new JPanel();
		   supPanel.setBounds(281, 50, 1059, 70);
		   supPanel.setBackground(new Color(255, 187, 84));
		   contentPane.add(supPanel);
		   supPanel.setLayout(null);
		   
		   JPanel cartPanel = new JPanel();
		   cartPanel.setBackground(new Color(255, 188, 86));
		   cartPanel.setBounds(955, 0, 52, 70);
		   supPanel.add(cartPanel);
		   cartPanel.setLayout(null);
		   
		   JLabel label = new JLabel("");
		   label.setBounds(0, 0, 52, 70);
		   cartPanel.add(label);
		   label.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseEntered(MouseEvent e) {
		   		enteredColor(cartPanel);
		   	}
		   	@Override
		   	public void mouseExited(MouseEvent e) {
		   		cartPanel.setBackground(new Color(255, 188, 86));
		   	}
		   	@Override
		   	public void mouseClicked(MouseEvent e) {
		   		CarrelloFrame carrello=new CarrelloFrame();
		   		carrello.setVisible(true);
		   		
		   	}
		   });
		   label.setHorizontalAlignment(SwingConstants.CENTER);
		   label.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Shopping Cart_40px.png")));
		   
		   JPanel userPanel = new JPanel();
		   userPanel.setLayout(null);
		   userPanel.setBackground(new Color(255, 188, 86));
		   userPanel.setBounds(1007, 0, 52, 70);
		   supPanel.add(userPanel);
		   
		   JLabel lblUser = new JLabel("");
		   lblUser.setBounds(0, 0, 52, 70);
		   userPanel.add(lblUser);
		   lblUser.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseEntered(MouseEvent e) {
		   		enteredColor(userPanel);
		   		
		   	}
		   	@Override
		   	public void mouseExited(MouseEvent e) {
		   		userPanel.setBackground(new Color(255, 188, 86));
		   	}
		   });
		   lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		   lblUser.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Gender Neutral User_35px_7.png")));
		   
		   JPanel indietroPanel = new JPanel();
		   indietroPanel.setBounds(343, 653, 142, 41);
		   contentPane.add(indietroPanel);
		   indietroPanel.setLayout(null);
		   
		   JLabel lblIndietro = new JLabel(" Indietro");
		   lblIndietro.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseEntered(MouseEvent arg0) {
		   		setColor(indietroPanel);
		   		
		   		
		   	}
		   	@Override
		   	public void mouseExited(MouseEvent e) {
		   		exitedColor(indietroPanel);
		   	}
		   });
		   lblIndietro.setBounds(12, 0, 130, 41);
		   indietroPanel.add(lblIndietro);
		   lblIndietro.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Undo_25px.png")));
		   lblIndietro.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		   lblIndietro.setHorizontalAlignment(SwingConstants.LEFT);
		   
		   JPanel aggiungiPanel = new JPanel();
		   aggiungiPanel.setBounds(816, 653, 151, 41);
		   contentPane.add(aggiungiPanel);
		   aggiungiPanel.setLayout(null);
		   
		   JLabel lblAggiungi = new JLabel(" Aggiungi");
		   lblAggiungi.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseEntered(MouseEvent e) {
		   		setColor(aggiungiPanel);
		   	}
		   	@Override
		   	public void mouseExited(MouseEvent e) {
		   		exitedColor(aggiungiPanel);
		   	}
		   	@Override
		   	public void mouseClicked(MouseEvent arg0) {
		   		try {
					int index=tablePantaloni.getSelectedRow();
		   		javax.swing.table.TableModel model=tablePantaloni.getModel();
		   		String nome= model.getValueAt(index, 0).toString();
		   		String prezzo=model.getValueAt(index, 1).toString();
		   		String quantità=model.getValueAt(index, 2).toString();
		   		ImageIcon image1 = (ImageIcon)tablePantaloni.getValueAt(index, 3);
		        Image image2 = image1.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight()
		                 , Image.SCALE_SMOOTH);
		        ImageIcon image3 = new ImageIcon(image2);
		        info.lblFoto.setIcon(image3);
		   		info.setVisible(true);

		   		info.setLocationRelativeTo(null);
		   		
		   		info.setDefaultCloseOperation(CategoriaUomo.DISPOSE_ON_CLOSE);
		   		info.txtQuantità.setText(quantità);
		   		info.txtNome.setText(nome);
		   		info.txtPrezzo.setText(prezzo);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Selezionare prodotto", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
		   		
		   		
		   	}
		   });
		   lblAggiungi.setHorizontalAlignment(SwingConstants.LEFT);
		   lblAggiungi.setIcon(new ImageIcon(CategoriaUomo.class.getResource("/icons/Add Shopping Cart_28px.png")));
		   lblAggiungi.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		   lblAggiungi.setBounds(12, 0, 139, 41);
		   aggiungiPanel.add(lblAggiungi);
	}
}
