package markovic.cipher;

public class Testklasse {
	public static void main(String[] args) {
		try {
			ShiftCipher s = new ShiftCipher(1);
			System.out.println(s.encrypt("phillip Testausgabe2"));
			System.out.println(s.decrypt(s.encrypt("phillip Testausgabe2")));
		}catch(inseption e) {
			e.getMessage();
		}
	}
}
