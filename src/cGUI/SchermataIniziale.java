package cGUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import aDeafultPackage.*;

public class SchermataIniziale extends JFrame {

	private JPanel contentPane;
	StoreController ctrl=new StoreController();
	JPanel sidePanel;
	Colori colori=new Colori();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchermataIniziale frame = new SchermataIniziale();
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
	public SchermataIniziale() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 767);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	    
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	    panel.setBounds(304, 202, 1036, 530);
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblUomo = new JLabel("");
	    lblUomo.setBounds(126, 62, 302, 462);
	    panel.add(lblUomo);
	    lblUomo.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		ctrl.ApriCategoriaUomo();
	    		
	    	    dispose();
	    		
	    	}
	    });
	    ImageIcon uomoicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/Uomo.jpg")));
		Image uomoimage=uomoicon.getImage();
	    Image uomomodificata=uomoimage.getScaledInstance(lblUomo.getWidth(),lblUomo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon finaleuomo=new ImageIcon(uomomodificata);
		lblUomo.setIcon(finaleuomo);
	    
	    JLabel lblDonna = new JLabel("");
	    lblDonna.setBounds(567, 67, 260, 457);
	    panel.add(lblDonna);
	    lblDonna.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		ctrl.ApriCategoriaDonna();
	    		dispose();
	    	}
	    });
	    
	   ImageIcon donnaicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/Donna.jpg")));
	   Image donnaimage=donnaicon.getImage();
	   Image donnamodificata=donnaimage.getScaledInstance(lblDonna.getWidth(),lblDonna.getHeight(), Image.SCALE_SMOOTH);
	   ImageIcon finaledonna=new ImageIcon(donnamodificata);
	   lblDonna.setIcon(finaledonna);
	   
	   JLabel lblUomo_1 = new JLabel("Uomo");
	   lblUomo_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
	   lblUomo_1.setHorizontalAlignment(SwingConstants.CENTER);
	   lblUomo_1.setBounds(120, 0, 308, 54);
	   panel.add(lblUomo_1);
	   
	   JLabel lblDonna_1 = new JLabel("Donna");
	   lblDonna_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
	   lblDonna_1.setHorizontalAlignment(SwingConstants.CENTER);
	   lblDonna_1.setBounds(544, 0, 308, 54);
	   panel.add(lblDonna_1);
	   
	   JPanel sidePanel = new JPanel();
	   sidePanel.setBackground(new Color(240, 240, 240));
	   sidePanel.setBounds(0, 202, 54, 530);
	   contentPane.add(sidePanel);
	   sidePanel.setLayout(null);
	   
	   JPanel menuPanel = new JPanel();
	   menuPanel.setBounds(0, 0, 54, 51);
	   sidePanel.add(menuPanel);
	   menuPanel.setLayout(null);
	   
	   JLabel lblMenu = new JLabel("");
	   colori.giallo(menuPanel);
	   lblMenu.setBounds(0, 0, 54, 51);
	   menuPanel.add(lblMenu);
	   lblMenu.addMouseListener(new MouseAdapter() {
	   	@Override
	   	public void mouseEntered(MouseEvent arg0) {
	   		colori.bianco(menuPanel);
	   		
	   		
	   	}
	   	@Override
	   	public void mouseExited(MouseEvent arg0) {
	   		colori.giallo(menuPanel);
	   	}
	   	@Override
	   	public void mouseClicked(MouseEvent arg0) {
	   		Thread th=new Thread() {
	   		    @Override
	   			public void run (){
	   				try {
	   					for (int i = 0; i < 6; i++) {
	   						Thread.sleep(30);
	   						if (i==1) {sidePanel.setSize(100, 530);}
	   						if (i==2) {sidePanel.setSize(125, 530);}
	   						if (i==3) {sidePanel.setSize(150, 530);}
	   						if (i==4) {sidePanel.setSize(175, 530);}
	   						if (i==5) {sidePanel.setSize(200, 530);}
	   						if (i==6) {sidePanel.setSize(231, 530);}
	   						
	   						
	   					}
	   					
	   				} catch (Exception e) {
	   					
	   				}
	   				
	   				
	   			}
	   			};th.start();
	   	}
	   });
	   lblMenu.setIcon(new ImageIcon(SchermataIniziale.class.getResource("/icons/Menu_50px.png")));
	   
	   
	   
	   JLabel lblLogo = new JLabel("");
	   lblLogo.setBounds(0, 0, 232, 201);
	   contentPane.add(lblLogo);
	   ImageIcon logoicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/FERNANDAL (1).png")));
	   Image logoimage=logoicon.getImage();
	   Image logomodificata=logoimage.getScaledInstance(lblLogo.getWidth(),lblLogo.getHeight(), Image.SCALE_SMOOTH);
	   ImageIcon finale=new ImageIcon(logomodificata);
	   lblLogo.setIcon(finale);
	   
	   JLabel lblSaldi = new JLabel("");
	   lblSaldi.setBounds(304, 13, 886, 188);
	   contentPane.add(lblSaldi);
	   lblSaldi.setBackground(new Color(240, 248, 255));
	   lblSaldi.setIcon(new ImageIcon(SchermataIniziale.class.getResource("/Immagini/Saldi.gif")));
//	   ImageIcon saldiicon=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Immagini/Saldi.gif")));
//		Image saldiimage=saldiicon.getImage();
//		Image saldimodificata=saldiimage.getScaledInstance(lblSaldi.getWidth(),lblSaldi.getHeight(), Image.SCALE_SMOOTH);
//	    ImageIcon saldifinale=new ImageIcon(saldimodificata);
//	    lblSaldi.setIcon(saldifinale);
	   
	}
}
