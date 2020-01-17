package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class UtenteDaoImpl implements UtenteDao {
	String SqlAggiungiUtente="INSERT INTO `utente`(`Nome`, `Cognome`, `ID`, `E-mail` ,`Password`) VALUES (?,?,?,?)";
	String SqlMostraUtenti ="SELECT Nome, Cognome, ID, E-mail FROM utente ";
	String SqlAggiornaUtente= "UPDATE utente SET Nome=? , Cognome=? , E-mail=? , Password=? WHERE ID = ?";
	String SqlEliminaUtente="DELETE FROM utente WHERE id = ?";
	String SqlMostraUtente="SELECT ID, Nome, Cognome, E-mail FROM utente WHERE ID = ?";
	
	public int CreaUtente(Utente utente) {
		Connection con = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        try{  
        	Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fernandal_store","root","");
			pst= con.prepareStatement(SqlAggiungiUtente);
			
			
		   
			
			
		}catch(Exception ex) {
			
			
		}
		return 0;
		
	}

	
	
     
}
