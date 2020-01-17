package Dao;

public class StoreController {

	public static void main(String[] args) {
		UtenteDaoImpl utenteDao=new UtenteDaoImpl();
		
		Registrazione frame=new Registrazione(null);
		frame.setVisible(true);
		utenteDao.CreaUtente(null);

	}

}
