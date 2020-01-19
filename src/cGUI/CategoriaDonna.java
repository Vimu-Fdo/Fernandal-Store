package cGUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class CategoriaDonna extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoriaDonna frame = new CategoriaDonna();
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
	public CategoriaDonna() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CategoriaDonna.class.getResource("/Immagini/Foto Schermata Iniziale.jpg")));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 648);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBounds(0, 273, 879, 328);
		contentPane.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.WHITE);
		parentPanel.add(blue, "t1");
		blue.setLayout(null);
		
		JPanel rosso = new JPanel();
		rosso.setBackground(Color.RED);
		parentPanel.add(rosso, "t2");
		
		JPanel verde = new JPanel();
		verde.setBackground(Color.GREEN);
		parentPanel.add(verde, "t3");
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 13, 799, 211);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBlue = new JLabel("blue");
		lblBlue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				blue.setVisible(true);
				rosso.setVisible(false);
				verde.setVisible(false);
			}
		});
		lblBlue.setBounds(74, 96, 82, 41);
		panel.add(lblBlue);
		lblBlue.setBackground(Color.BLUE);
		
		JLabel lblRosso = new JLabel("rosso");
		lblRosso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				blue.setVisible(false);
				rosso.setVisible(true);
				verde.setVisible(false);
			}
		});
		lblRosso.setBounds(207, 96, 73, 41);
		panel.add(lblRosso);
		lblRosso.setBackground(Color.RED);
		
		JLabel lblVerde = new JLabel("verde");
		lblVerde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				blue.setVisible(false);
				rosso.setVisible(false);
				verde.setVisible(true);
			}
		});
		lblVerde.setBounds(310, 108, 82, 29);
		panel.add(lblVerde);
		lblVerde.setBackground(Color.GREEN);
	}
}
