package markovic.cipher;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class View extends JFrame{
	private MonoAlphabeticCipher m1;
	private Controller c1;
	private PanelKlasse p1;
	private JButton start;
	
	//Konstruktor
	public View(MonoAlphabeticCipher m, Controller c, PanelKlasse p) {
		this.m1 = m;
		this.c1 = c;
		this.p1 = p;
		this.setTitle("Programm01");
		this.setSize(500, 200);
		this.setMinimumSize(new Dimension(500,700));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Strings
		
		//Inputfield
		
		//Buttons
		Container cSouth = new Container();
		cSouth.setLayout(new GridLayout());
		this.start = new JButton("Start");
		this.start.addActionListener(this.c1);
		this.setVisible(true);
	}
}
