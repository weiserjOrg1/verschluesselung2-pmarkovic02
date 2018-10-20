package markovic.cipher;
public class inseption extends Exception{
	
	public inseption() {
		super("Falsches Alphabet");
	}
	
	public inseption(String txt) {
		super(txt);
		
	}
}