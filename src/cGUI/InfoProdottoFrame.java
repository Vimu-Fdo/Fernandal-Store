package cGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import aDeafultPackage.*;
import bDao.FelpeDao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class InfoProdottoFrame extends JFrame {

	private JPanel contentPane;
	public JTextField txtNome;
	public JTextField txtPrezzo;
	private JComboBox comboBox;
	public JLabel lblFoto;
	Colori colori=new Colori();
	public JTextField txtQuantità;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoProdottoFrame frame = new InfoProdottoFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InfoProdottoFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 565);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setIgnoreRepaint(true);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFoto = new JLabel("");
		lblFoto.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		lblFoto.setBounds(23, 0, 295, 531);
		contentPane.add(lblFoto);
		
		txtNome = new JTextField();
		txtNome.setEnabled(false);
		txtNome.setFont(new Font("Yu Gothic UI", Font.PLAIN, 30));
		txtNome.setBorder(null);
		txtNome.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtNome.setAlignmentY(Component.TOP_ALIGNMENT);
		txtNome.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtNome.setForeground(Color.BLACK);
		txtNome.setDisabledTextColor(Color.BLACK);
		txtNome.setBounds(347, 43, 266, 47);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
	    txtPrezzo = new JTextField();
	    txtPrezzo.setDisabledTextColor(Color.BLACK);
	    txtPrezzo.setEnabled(false);
	    txtPrezzo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
	    txtPrezzo.setIgnoreRepaint(true);
	    txtPrezzo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    txtPrezzo.setBorder(null);
	    txtPrezzo.setForeground(Color.BLACK);
		txtPrezzo.setColumns(10);
		txtPrezzo.setBounds(347, 137, 266, 44);
		contentPane.add(txtPrezzo);
		
		comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setName("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL"}));
		comboBox.setBounds(347, 293, 51, 22);
		contentPane.add(comboBox);
		
		JPanel annullaPanel = new JPanel();
		annullaPanel.setBounds(347, 418, 550, 35);
		contentPane.add(annullaPanel);
		annullaPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Annulla");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				colori.bianco(annullaPanel);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				colori.grigioChiaro(annullaPanel);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel.setBounds(0, 0, 550, 35);
		annullaPanel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		lblNewLabel.setIcon(new ImageIcon(InfoProdottoFrame.class.getResource("/icons/Cancel_28px_1.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(347, 121, 550, 2);
		contentPane.add(panel_1);
		
		JLabel lblSelezionareTaglia = new JLabel("Selezionare Taglia");
		lblSelezionareTaglia.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblSelezionareTaglia.setBounds(347, 258, 158, 22);
		contentPane.add(lblSelezionareTaglia);
		
		JPanel aggiungiPanel = new JPanel();
		aggiungiPanel.setBackground(Color.BLACK);
		aggiungiPanel.setLayout(null);
		aggiungiPanel.setBounds(347, 359, 550, 35);
		contentPane.add(aggiungiPanel);
		
		JLabel lblAggiungiAlCarrello = new JLabel("Aggiungi al carrello");
		lblAggiungiAlCarrello.setForeground(Color.WHITE);
		lblAggiungiAlCarrello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				colori.verdeacqua(aggiungiPanel);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				colori.nero(aggiungiPanel);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
//				String[] riga= {"Nome","Prezzo","Quantità"};
//				DefaultTableModel model=new DefaultTableModel(null,riga);
//				model.addRow(new Object[] {txtNome.getText(),txtPrezzo.getText(),txtQuantità.getText()					
//				});
////				CarrelloFrame carrello=new CarrelloFrame();
//				carrello.setModel(model);
				double prezzo=Double.parseDouble(txtPrezzo.getText());
				int quantità=Integer.parseInt(txtQuantità.getText());
//				Prodotto p=new Prodotto(txtNome.getText(), prezzo, quantità);
				FelpeDao fDao= new FelpeDao();
				fDao.InserisciFelpe(txtNome.getText(),prezzo,quantità);
			}
		});
		lblAggiungiAlCarrello.setIcon(new ImageIcon(InfoProdottoFrame.class.getResource("/icons/Add Shopping Cart_28px_1.png")));
		lblAggiungiAlCarrello.setHorizontalAlignment(SwingConstants.CENTER);
		lblAggiungiAlCarrello.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lblAggiungiAlCarrello.setBounds(0, 0, 550, 35);
		aggiungiPanel.add(lblAggiungiAlCarrello);
		
		txtQuantità = new JTextField();
		txtQuantità.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		txtQuantità.setDisabledTextColor(Color.BLACK);
		txtQuantità.setBorder(null);
		txtQuantità.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtQuantità.setEnabled(false);
		txtQuantità.setBounds(347, 229, 116, 22);
		contentPane.add(txtQuantità);
		txtQuantità.setColumns(10);
		
		JLabel lblQuantita = new JLabel("Disponibilit\u00E0");
		lblQuantita.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblQuantita.setBounds(347, 194, 102, 22);
		contentPane.add(lblQuantita);
		
		
	}
}
