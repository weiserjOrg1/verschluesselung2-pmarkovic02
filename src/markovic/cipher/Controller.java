package markovic.cipher;
import java.awt.event.*;
import javax.swing.*;


public class Controller implements ActionListener, FocusListener{
	
	private View v1;
	private Model m1; 
	public Controller() {
		this.m1=new Model(); 
		this.v1=new View(this, this.m1); 
	}
	public void focusGained(FocusEvent e) {
		if(this.v1.isSubstitution(e.getSource())) {
			this.v1.changeSubShi(Model.SUB);
		} else if(this.v1.isShift(e.getSource())) {
			this.v1.changeSubShi(Model.SHIFT);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(this.v1.isgenerierenButton	(e.getSource())) {
			if(this.v1.isSubstitutionSelected()) {
				this.m1.changeMode(this.v1.getSubField());
			} else {
				this.m1.changeMode(this.v1.getShiftField());
			}
		} else if(this.v1.iszurucksetztenButton(e.getSource())) {
			this.m1.resetAlp();
		} else if(this.v1.isencryptButton(e.getSource())) {
			this.v1.setausgabe(this.m1.encrypt(this.v1.getIn()));
		} else if(this.v1.isdecryptButton(e.getSource())) {
			this.v1.setausgabe(this.m1.decrypt(this.v1.getIn()));			
		} else if(this.v1.isSubstitution(e.getSource())) {
			this.v1.changeSubShi(Model.SUB);
		} else if(this.v1.isShift(e.getSource())) {
			this.v1.changeSubShi(Model.SHIFT);
		}
	}
	public void focusLost(FocusEvent e) {
		
	}
}