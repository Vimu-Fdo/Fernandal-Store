package Dao;

import java.sql.*;
import java.util.*;

public class PantaloneDao {
	PreparedStatement pst=null;
	ResultSet rs=null;
	Connessione c=new Connessione();
	Pantalone p;
	
	Connection con() throws SQLException,ClassNotFoundException{
		Class.forName(c.getDriver());
		return DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
		
	}
	
	public ArrayList<Pantalone> MostraPantalone(){
		ArrayList<Pantalone> panta=new ArrayList<Pantalone>();
		try {
			pst=con().prepareStatement("SELECT * FROM `pantalone`");
			rs=pst.executeQuery();
			while (rs.next()){
				p= new Pantalone(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getBytes(6));
				panta.add(p);
			}
			
		} catch (Exception e) {
			
		}
		return panta;
		
		
		
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
