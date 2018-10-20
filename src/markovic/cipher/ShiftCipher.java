package markovic.cipher;
public class ShiftCipher extends MonoAlphabeticCipher{
	public ShiftCipher() {
		super();
	}
	public void setShiftValue(int value) throws inseption {
		String nAlph ="abcdefghijklmnopqrstuvwxyzäöüß";
		String sAlph ="";
		while(value>=nAlph.length()) {
			value -= 30; 
		}
		while(value<0) {
			value += 30; 
		}
		for(int i=0; i<30; i++) {
			sAlph += nAlph.charAt(value);
			value++;	
			if(value>=nAlph.length()) {
				value-=30;
			}
		}
		this.setSecretAlphabet(sAlph);
	}
	public ShiftCipher(int value) throws inseption {
		this.setShiftValue(value);
	}
}