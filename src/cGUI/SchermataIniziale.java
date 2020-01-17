package cGUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SchermataIniziale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchermataIniziale frame = new SchermataIniziale();
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
	public SchermataIniziale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 809);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(SchermataIniziale.class.getResource("/Immagini/FERNANDAL (1).png")));
		
		JButton btnDonna = new JButton("Donna");
		btnDonna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Donna framedonna= new Donna();
				framedonna.setVisible(true);
				dispose();
			}
		});
		
		JButton btnUomo = new JButton("Uomo");
		btnUomo.setFont(new Font("Trebuchet MS", Font.PLAIN, 35));
		
		btnUomo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Uomo frameuomo=new Uomo();
				frameuomo.setVisible(true);
				dispose();
			}
		
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(278)
					.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(231))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(214)
					.addComponent(btnUomo, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
					.addGap(98)
					.addComponent(btnDonna, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
					.addGap(157))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUomo, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addComponent(btnDonna, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
					.addGap(9))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
