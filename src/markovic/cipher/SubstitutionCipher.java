package markovic.cipher;
public class SubstitutionCipher extends MonoAlphabeticCipher{
	
	public SubstitutionCipher() {
		super();
	}
	public SubstitutionCipher(String secretAlphabet) throws inseption{
		super.setSecretAlphabet(secretAlphabet);
		
	}
	public void setSecretAlphabet(String secretAlphabet) throws inseption{
		super.setSecretAlphabet(secretAlphabet);
	}
}