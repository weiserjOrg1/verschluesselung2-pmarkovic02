package markovic.cipher;
import java.awt.*;
import javax.swing.*;

public class PanelKlasse extends JPanel{
	//Attribute
	private MonoAlphabeticCipher m1;
	
	//Konstruktor
	public PanelKlasse(MonoAlphabeticCipher m) {
		System.out.println("Programmstart");
		this.m1=m;
	}
	
	protected void paintComponent(Graphics g) {
		System.out.println("Es wird gezeichnet!");
		super.paintComponent(g);
		
	}
}
