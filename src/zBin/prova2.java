package zBin;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class prova2 {

	private JFrame frame;
	JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prova2 window = new prova2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prova2() {
		initialize();
//		ImageIcon provaicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/FERNANDAL (1).png")));
//		Image provaimage=provaicon.getImage();
//		Image provamodificata=provaimage.getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_SMOOTH);
//	    ImageIcon finale=new ImageIcon(provamodificata);
//	    label.setIcon(finale);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 766, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 216, 198);
		frame.getContentPane().add(label);
//		ImageIcon saldiicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/FERNANDAL (1).png")));
//		Image saldiimage=saldiicon.getImage();
//		Image saldimodificata=saldiimage.getScaledInstance(lblSaldi.getWidth(),lblSaldi.getHeight(), Image.SCALE_SMOOTH);
//	    ImageIcon finale=new ImageIcon(saldimodificata);
//	    lblSaldi.setIcon(finale);
	}

}
