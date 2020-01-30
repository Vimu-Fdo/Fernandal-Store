package aDeafultPackage;

public class Carta {
	private String Codice;
	private int Pin;
	
	public Carta(String codice, int pin) {
		super();
		Codice = codice;
		Pin = pin;
	}

	public String getCodice() {
		return Codice;
	}

	public void setCodice(String codice) {
		Codice = codice;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}
	
	
	
    

}
