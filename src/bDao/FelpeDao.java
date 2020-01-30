package bDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import aDeafultPackage.Prodotto;

public class FelpeDao {
	PreparedStatement pst=null;
	ResultSet rs=null;
	Connessione c=new Connessione();
	Prodotto p;
	
	Connection con() throws SQLException,ClassNotFoundException{
		Class.forName(c.getDriver());
		return DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
		
	}
	
	public ArrayList<Prodotto> MostraFelpe(){
		ArrayList<Prodotto> felpe=new ArrayList<Prodotto>();
		try {
			pst=con().prepareStatement("SELECT * FROM `prodotti` WHERE Sesso='Uomo'AND categoria='Felpa'");
			rs=pst.executeQuery();
			while (rs.next()){
				p= new Prodotto(rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getBytes(7));
				felpe.add(p);
			}
			
		} catch (Exception e) {
			
		}
		return felpe;
		
		
		
	}
	
	public int InserisciFelpe(String nome,double prezzo,int quantit�) {
		int n=0;
		try {
			pst=con().prepareStatement("insert into carrello(Nome,Prezzo,Quantit�) values(?,?,?");
			pst.setString(1, nome);
			pst.setDouble(2, prezzo);
			pst.setInt(3, quantit�);
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int AggiornaFelpe() {
		int n=0;
		try {
			pst=con().prepareStatement("update prodotti set nome=?,prezzo=?,quantit�=? where id=?");
			pst.setString(1, p.getNomeProdotto());
			pst.setDouble(2, p.getPrezzo());
			pst.setInt(3, p.getQuantit�());
//			pst.setInt(4, p.getID());
			
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return n;
	}
	
	public int EliminaMaglieria() {
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
