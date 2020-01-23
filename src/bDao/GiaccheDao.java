package bDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import aDeafultPackage.Prodotto;

public class GiaccheDao {
	PreparedStatement pst=null;
	ResultSet rs=null;
	Connessione c=new Connessione();
	Prodotto p;
	
	Connection con() throws SQLException,ClassNotFoundException{
		Class.forName(c.getDriver());
		return DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
		
	}
	
	public ArrayList<Prodotto> MostraGiacche(){
		ArrayList<Prodotto> giacche=new ArrayList<Prodotto>();
		try {
			pst=con().prepareStatement("SELECT * FROM `prodotti` WHERE Sesso='Uomo'AND categoria='Giacche'");
			rs=pst.executeQuery();
			while (rs.next()){
				p= new Prodotto(rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
				giacche.add(p);
			}
			
		} catch (Exception e) {
			
		}
		return giacche;
		
		
		
	}
	
	public int InserisciGiacche() {
		int n=0;
		try {
			pst=con().prepareStatement("insert into prodotti(nome,prezzo,quantit�) values(?,?,?");
			pst.setString(1, p.getNomeProdotto());
			pst.setDouble(2, p.getPrezzo());
			pst.setInt(3, p.getQuantit�());
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int AggiornaGiacche() {
		int n=0;
		try {
			pst=con().prepareStatement("update prodotti set nome=?,prezzo=?,quantit�=? where id=?");
			pst.setString(1, p.getNomeProdotto());
			pst.setDouble(2, p.getPrezzo());
			pst.setInt(3, p.getQuantit�());
			pst.setInt(4, p.getID());
			
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int EliminaGiacche() {
		int n=0;
		try {
			pst=con().prepareStatement("delete from prodotti where id=?");
			pst.setInt(4, p.getID());
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}

}
