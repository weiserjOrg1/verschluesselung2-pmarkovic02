package markovic.cipher;

public class MonoAlphabeticCipher implements Cipher{
	private String secretAlphabet;
	
	
	public MonoAlphabeticCipher() {
		this.secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	}
	
	public String getSecretAlphabet() {
		return this.secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet) {
		//Hier kommen ein TRY CATCH
		try {
            this.secretAlphabet = testerSecretAlph(secretAlphabet);
        }catch(inseption e) {
            System.out.println(e.toString());
        }
	}
	
	public String encrypt(String text) {
		String defaultAlph="abcdefghijklmnopqrstuvwxyzäöüß";
		String encryptedText="";
		text=text.toLowerCase();
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			int place=defaultAlph.indexOf(c);
			if(place==-1) {
				encryptedText=encryptedText+c;
			}else {
				encryptedText=encryptedText+this.secretAlphabet.charAt(place);
			}
		}
			return encryptedText;
	}
	
	
	public String decrypt(String text) {
		String defaultAlph="abcdefghijklmnopqrstuvwxyzäöüß";
		String decryptedText="";
		text=text.toLowerCase();
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			int place=secretAlphabet.indexOf(c);
			if(place==-1) {
				decryptedText=decryptedText+c;
			}else {
				decryptedText=decryptedText+defaultAlph.charAt(place);
			}
		}
		return decryptedText;
	}
	
	public String testerSecretAlph(String secretAlph) throws inseption {
		secretAlph = secretAlph.toLowerCase();
		//criteria 
        //30
        if(secretAlphabet.length() !=30) {
            throw new inseption("The criteria for the secret alphabet was not fulfilled! (Length is not 30!)");
        }

        //1x character
        for(int i = 0; i < secretAlphabet.length(); i++) {
            char c = secretAlphabet.charAt(i);
            if(secretAlphabet.indexOf(c) == secretAlphabet.lastIndexOf(c)) {

            }else {
                throw new inseption("The criteria for the secret alphabet was not fulfilled! (The characters of the secret alphabet are not unique!)");
            }
        }

        //invalid characters
        for(int i = 0; i < secretAlphabet.length(); i++) {
        	char c = secretAlphabet.charAt(i);
            if(c >= 97 && c <= 122 || c == 246 || c == 228 || c == 252 || c == 223) {
            }else {
                throw new inseption("The criteria for the secret alphabet was not fulfilled! (The characters of the secret alphabet are not unique!)");
            }
        }
        return secretAlph;
	}
}