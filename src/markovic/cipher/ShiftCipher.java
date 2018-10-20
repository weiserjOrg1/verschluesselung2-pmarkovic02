package markovic.cipher;

public class ShiftCipher extends MonoAlphabeticCipher{
	public ShiftCipher(int value) throws inseption{
	}
	
	public void setShiftCipher(int value) throws inseption{
		String defaultAlph="abcdefghijklmnopqrstuvwxyzäöüß";
		String newAlph="";
		int stelle = 0;
		
		//Benutzer gibt eine Zahl ein und defaultAlph soll
		//um eingegebene Zahl verschoben werden
		
		if(value == 0)	return;
		
		if(value > 0) {
			newAlph = defaultAlph.substring(value);
			newAlph += defaultAlph.substring(0, value);
			super.setSecretAlphabet(newAlph);
		}else {
			newAlph = defaultAlph.substring(value + 29);
			newAlph += defaultAlph.substring(0, value+29);
			super.setSecretAlphabet(newAlph);
		}
	}
}
