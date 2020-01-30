package bDao;

import java.sql.*;
import java.util.*;

import aDeafultPackage.Prodotto;

public class PantaloneDao {
	PreparedStatement pst=null;
	ResultSet rs=null;
	Connessione c=new Connessione();
	Prodotto p;
	
	Connection con() throws SQLException,ClassNotFoundException{
		Class.forName(c.getDriver());
		return DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
		
	}
	
	public ArrayList<Prodotto> MostraPantaloni(){
		ArrayList<Prodotto> pantaloni=new ArrayList<Prodotto>();
		try {
			pst=con().prepareStatement("SELECT * FROM `prodotti` WHERE Sesso='Uomo'AND categoria='Pantalone'");
			rs=pst.executeQuery();
			while (rs.next()){
				p= new Prodotto(rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getBytes(7));
				pantaloni.add(p);
			}
			
		} catch (Exception e) {
			
		}
		return pantaloni;
		
		
		
	}
	
	public int InserisciPantalone() {
		int n=0;
		try {
			pst=con().prepareStatement("insert into pantalone(nome,prezzo,quantità) values(?,?,?");
			pst.setString(1, p.getNomeProdotto());
			pst.setDouble(2, p.getPrezzo());
			pst.setInt(3, p.getQuantità());
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int AggiornaPantalone() {
		int n=0;
		try {
			pst=con().prepareStatement("update test set nome=?,prezzo=?,quantità=? where id=?");
			pst.setString(1, p.getNomeProdotto());
			pst.setDouble(2, p.getPrezzo());
			pst.setInt(3, p.getQuantità());
			pst.setInt(4, p.getID());
			
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int EliminaPantalone() {
		int n=0;
		try {
			pst=con().prepareStatement("delete from pantalone where id=?");
			pst.setInt(4, p.getID());
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	
	
	
}
