package zBin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bDao.UtenteDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Registrazione extends JFrame {

	private JPanel contentPane;
	private JTextField txtPass;
	private JTextField txtCognome;
	private JTextField txtNome;
	private JTextField txtMail;

	private JTextField txtID;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Registrazione frame = new Registrazione();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Registrazione() {
		
		setTitle("Registrazione");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 344, 82, 16);
		contentPane.add(lblPassword);
		JLabel lblUser = new JLabel("");
		lblUser.setBounds(155, 312, 167, 16);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("");
		lblPass.setBounds(155, 376, 154, 16);
		contentPane.add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setBounds(155, 341, 164, 22);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		JButton btnCreaAccount = new JButton("Crea account");
		btnCreaAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UtenteDao.CreaUtente();
				PreparedStatement pst = null;
				try {
					pst.setString(1, txtNome.getText());
					pst.setString(2, txtCognome.getText());
					pst.setString(3, txtID.getText());
					pst.setString(4, txtMail.getText());
					pst.setString(5, txtPass.getText());
					JOptionPane.showMessageDialog(null, "Account creato");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnCreaAccount.setBounds(12, 460, 140, 25);
		contentPane.add(btnCreaAccount);
		
		JButton btnBack = new JButton("Indietro");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnBack.setBounds(225, 460, 97, 25);
		contentPane.add(btnBack);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 52, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(12, 93, 56, 16);
		contentPane.add(lblCognome);
		
		JLabel lblEt = new JLabel("Email");
		lblEt.setBounds(12, 181, 56, 16);
		contentPane.add(lblEt);
		
		txtCognome = new JTextField();
		txtCognome.setColumns(10);
		txtCognome.setBounds(155, 90, 164, 22);
		contentPane.add(txtCognome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(155, 49, 164, 22);
		contentPane.add(txtNome);
		
		
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(155, 178, 164, 22);
		contentPane.add(txtMail);
		
		txtID = new JTextField();
		txtID.setBounds(139, 253, 116, 22);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		
		
	}
}
