package aDeafultPackage;


public class Prodotto {
	private String Categoria;
	private int ID;
	private String NomeProdotto;
	private Double Prezzo;
	private int Quantità;
	private byte[] Image;
	
	
	public Prodotto( int iD, String nomeProdotto, Double prezzo, int quantità) {
		super();
		
		ID = iD;
		NomeProdotto = nomeProdotto;
		Prezzo = prezzo;
		Quantità = quantità;
		
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNomeProdotto() {
		return NomeProdotto;
	}
	public void setNomeProdotto(String nomeProdotto) {
		NomeProdotto = nomeProdotto;
	}
	public Double getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(Double prezzo) {
		Prezzo = prezzo;
	}
	public int getQuantità() {
		return Quantità;
	}
	public void setQuantità(int quantità) {
		Quantità = quantità;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public byte[] getImage() {
		return Image;
	}

	public void setImage(byte[] image) {
		Image = image;
	}
	
	
	

}
