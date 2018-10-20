package markovic.cipher;

public class MonoAlphabeticCipher implements Cipher{
	//Attribute
	private String secretAlphabet;
	
	//Konstruktor
	public MonoAlphabeticCipher() {
		this.secretAlphabet="abcdefghijklmnopqrstuvwxyzäöüß";
	}
	public String encrypt(String text) {
		text=text.toLowerCase();
		String encText=""; 
		String nAlph="abcdefghijklmnopqrstuvwxyzäöüß";
		for(int i=0; i<text.length(); i++) {
			char a=text.charAt(i);
			int index= nAlph.indexOf(a); 
			if(index!=-1) {
				encText=encText+this.secretAlphabet.charAt(index);
			} else {
				encText=encText+a;
			}
		}		
		return encText; 
	}
	public String getSecretAlphabetic() {
		return this.secretAlphabet;
	}
	protected void setSecretAlphabet(String secretAlphabet) throws inseption{
		this.secretAlphabet= checkSecret(secretAlphabet);
	}


	
	public String decrypt(String text) {
		//text=text.toLowerCase();
		String decText="";
		String nAlph="abcdefghijklmnopqrstuvwxyzäöüß";
		for(int i=0; i<text.length(); i++) {
			char a=text.charAt(i);
			int index=this.secretAlphabet.indexOf(a);
			if(index!=-1) {
				decText= decText+nAlph.charAt(index);
			} else {
				decText= decText + a; 
			}
					
		}
		return decText; 
	}
	public String checkSecret(String secAlph) throws inseption{
		secAlph= secAlph.toLowerCase();
		
		//1)
		if(secAlph.length()>30) {
			throw new inseption("zu lang"); 
		}
		
		if(secAlph.length()<30) {
			throw new inseption("zu kurz"); 
		}
		
		//2)
		for(int i=0; i<secAlph.length(); i++) {
            int help1 = 0;
            for(int j=0; j<secAlph.length(); j++) {
                if(secAlph.charAt(i) == secAlph.charAt(j)) {
                    help1++;
                    if(help1 > 1) {
                        throw new inseption("2 gleiche Zeichen");
                    }
                }
            }
        }
		String gültig="abcdefghijklmnopqrstuvwxyzäöüß";
		int help2=0;
		for(int i=0; i<secAlph.length(); i++) {
			for(int j=0; j<secAlph.length(); j++) {
				char a= gültig.charAt(i);
				char b= secAlph.charAt(j);
				if(a==b) {
					help2++;
				}
			}
		}
		if(help2==30) {
			
		}else {
			throw new inseption("Sonderzeichen im String"); 
		}
		
		return secAlph;
	}
}