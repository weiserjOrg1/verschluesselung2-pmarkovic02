package markovic.cipher;

public class inseption extends Exception{
	public inseption() {
		//Standartfehlermeldung
		super("Pita ausverkauft");
	}
	public inseption(String fehlermessage) {
		//Benutzerdefinierte Fehlermeldung
		super(fehlermessage);
	}
}
