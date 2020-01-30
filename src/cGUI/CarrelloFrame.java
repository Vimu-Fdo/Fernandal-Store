package cGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CarrelloFrame extends JFrame {

	private JPanel contentPane;
	public JTable carrello;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblCarrello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrelloFrame frame = new CarrelloFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CarrelloFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 767);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 164, 1340, 477);
		contentPane.add(scrollPane);
		
		carrello = new JTable();
		carrello.setFillsViewportHeight(true);
		carrello.setBackground(Color.WHITE);
		scrollPane.setViewportView(carrello);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(543, 0, 147, 134);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 141, 1340, 2);
		contentPane.add(panel);
		
		lblCarrello = new JLabel("CARRELLO");
		lblCarrello.setFont(new Font("Yu Gothic UI", Font.PLAIN, 30));
		lblCarrello.setBounds(12, 101, 180, 33);
		contentPane.add(lblCarrello);
	}
}
