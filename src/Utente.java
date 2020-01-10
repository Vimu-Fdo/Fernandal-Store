
public class Utente {
	private String Nome;
	private String Cognome;
	private String Id;
	
	public Utente(String nome, String cognome, String id) {
		super();
		Nome = nome;
		Cognome = cognome;
		Id = id;
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
	
	
	
	
	

}
