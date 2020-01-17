

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Uomo extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//	EventQueue.invokeLater(new Runnable() {
//	public void run() {
//	try {
//	Uomo frame = new Uomo();
//frame.setVisible(true);
//	} catch (Exception e) {
//	e.printStackTrace();
//	}
//	}
//}
//);
//	}

	/**
	 * Create the frame.
	 */
	public Uomo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 1000);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("PANTALONI");
		btnNewButton.setBounds(70, 323, 179, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MAGLIERIA");
		btnNewButton_1.setIcon(new ImageIcon(Uomo.class.getResource("/Immagini/big_431620.jpg")));
		btnNewButton_1.setBounds(290, 323, 336, 172);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("GIUBBOTTI");
		btnNewButton_3.setBounds(636, 323, 179, 74);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon provaicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/FERNANDAL (1).png")));
		Image provaimage=provaicon.getImage();
		Image provamodificata=provaimage.getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon finale=new ImageIcon(provamodificata);
	    lblNewLabel.setIcon(new ImageIcon(Uomo.class.getResource("/Immagini/FERNANDAL (1).png")));
		lblNewLabel.setBounds(112, -28, 1242, 340);
		contentPane.add(lblNewLabel);
	}
}
