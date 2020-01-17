package Dao;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.*;

public class prova extends JFrame {

	private JPanel contentPane;
	JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prova frame = new prova();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	ImageIcon provaicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/Foto Schermata Iniziale.jpg")));
//	Image provaimage=provaicon.getImage();
//	Image provamodificata=provaimage.getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_SMOOTH);
//    ImageIcon finale=new ImageIcon(provamodificata);
//    public prova() {
//    	initco
    	
    
	/**
	 * Create the frame.
	 */
	public prova() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setBounds(57, 61, 389, 212);
		contentPane.add(label);
	}
}
