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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(SchermataIniziale.class.getResource("/Immagini/FERNANDAL (1).png")));
		label.setBounds(305, 0, 581, 237);
		contentPane.add(label);
		
		JButton btnDonna = new JButton("Donna");
		btnDonna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Donna framedonna= new Donna();
				framedonna.setVisible(true);
				dispose();
			}
		});
		btnDonna.setBounds(661, 276, 400, 550);
		contentPane.add(btnDonna);
		
		JButton btnUomo = new JButton("Uomo");
		btnUomo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Uomo frameuomo=new Uomo();
				frameuomo.setVisible(true);
				dispose();
			}
		});
		btnUomo.setBounds(130, 276, 400, 550);
		contentPane.add(btnUomo);
	}
}
