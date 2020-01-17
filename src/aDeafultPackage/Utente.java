package aDeafultPackage;

public class Utente {
	private String Nome;
	private String Cognome;
	private String Id;
	private String CF;
	
	public Utente(String nome, String cognome, String id, String cF) {
		super();
		Nome = nome;
		Cognome = cognome;
		Id = id;
		CF = cF;
	}
	
	

	public Utente(String nome, String cognome) {
		super();
		Nome = nome;
		Cognome = cognome;
	}



	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}



	public String getCF() {
		return CF;
	}



	public void setCF(String cF) {
		CF = cF;
	}
	
	
	
	
	
	

}
