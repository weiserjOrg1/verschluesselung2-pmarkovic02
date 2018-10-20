package markovic.cipher;

import java.awt.event.ActionEvent;

public class Controller {
	private MonoAlphabeticCipher m1;
	private View v1;
	private PanelKlasse p1;
	
	public Controller() {
		this.m1 = new MonoAlphabeticCipher();
		this.p1 = new PanelKlasse(this.m1);
		this.v1 = new View(this.m1, this, this.p1);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.v1) {
			
		}
	}
}
