package markovic.cipher;
import javax.swing.JOptionPane;

public class Model {
	//Attribute
	public static final int SUB=0;
	public static final int SHIFT=1;
	private int ausgewahlterModus;
	private SubstitutionCipher subst;
	private ShiftCipher shiftc;
	
	public Model() {
		this.ausgewahlterModus=SHIFT;
		this.subst=new SubstitutionCipher();
		this.shiftc=new ShiftCipher();
	}
	
	public void changeMode(String input) {
		try {
			if (this.ausgewahlterModus == SUB) {
				this.subst.setSecretAlphabet(input);
				JOptionPane.showMessageDialog(null, "Geändert");
			} else {
				try {
					int inp= Integer.parseInt(input);
					this.shiftc.setShiftValue(inp);
					JOptionPane.showMessageDialog(null, "Geändert");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Zahl wurde eingegeben", "Fehler",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch (inseption e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
			
		}		
	}
	public String encrypt(String text) {
		String re;
		if(this.ausgewahlterModus==SUB) {
			re=this.subst.encrypt(text);
		} else {
			re=this.shiftc.encrypt(text);
		}
		return re;
	}
	public String decrypt(String text) {
		String re;
		if(this.ausgewahlterModus==SUB) {
			re=this.subst.decrypt(text);
		} else {
			re=this.shiftc.decrypt(text);
		}
		
		return re;
	}
	public void resetAlp() {
		this.subst=new SubstitutionCipher(); 
		this.shiftc= new ShiftCipher(); 
		JOptionPane.showMessageDialog(null, "Zurückgesetzt");
	}
	public void setMode(int value) {
		this.ausgewahlterModus=value; 
	}
	
	public int getausgewahlterModus() {
		return this.ausgewahlterModus;
	}	
}