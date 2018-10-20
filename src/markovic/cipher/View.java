//imports
package markovic.cipher;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.*; 

public class View extends JFrame{
	//Attribute
	private JTextField shiftField; 
	private JTextField subField; 
	private JTextField inField;
	private JTextField outField;
	private JLabel eingabe; 
	private JLabel ausgabe; 
	private JRadioButton auswahl01; //Substitution
	private JRadioButton auswahl02; //ShiftCipher
	private JLabel eingabe01; //Substitution Eingabe
	private JLabel eingabe02; //ShiftCipher Eingabe
	//Buttons
	private ButtonGroup gruppe01; 
	private JButton encryptButton; 
	private JButton decryptButton;
	private JButton generierenButton;
	private JButton zurucksetztenButton;
	private JPanel selbox;
	private JPanel alphbox;
	private JPanel enDePanel; 
	private JPanel inOutPanel;
	private Controller c1;
	private Model m1; 
	
	//Konstruktor
	public View(Controller c, Model m){
		this.c1=c; 
		this.m1=m; 
		this.setTitle("Verschlüsselung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout()); 
		this.setSize(500, 250);
		

		this.auswahl01= new JRadioButton("Sub",true);
		this.auswahl02= new JRadioButton("Shift");
		this.auswahl01.addActionListener((ActionListener) this.c1);
		this.auswahl01.addFocusListener((FocusListener) this.c1);
		this.auswahl02.addActionListener((ActionListener) this.c1);
		this.auswahl02.addFocusListener((FocusListener) this.c1);
		this.gruppe01= new ButtonGroup(); 
		this.gruppe01.add(this.auswahl01);
		this.gruppe01.add(this.auswahl02);
		this.generierenButton=new JButton("Generieren");
		this.generierenButton.addActionListener((ActionListener) this.c1);
		this.zurucksetztenButton= new JButton("Zurücksetzen"); 
		this.zurucksetztenButton.addActionListener((ActionListener) this.c1);
		this.encryptButton= new JButton("Encrypt");
		this.encryptButton.addActionListener((ActionListener)this.c1);
		this.decryptButton= new JButton("Decrypt");
		this.decryptButton.addActionListener((ActionListener)this.c1);
		this.selbox= new JPanel(); 
		this.add(this.selbox, BorderLayout.CENTER);
		this.alphbox= new JPanel(); 
		this.add(this.alphbox, BorderLayout.NORTH);
		this.inOutPanel=new JPanel(); 
		this.add(this.inOutPanel, BorderLayout.SOUTH);
		this.enDePanel=new JPanel();
		this.add(this.enDePanel, BorderLayout.WEST);
		this.selbox.add(this.auswahl01);
		this.selbox.add(this.auswahl02);
		this.eingabe01= new JLabel("Normal:"); 
		this.eingabe02= new JLabel ("Shift:");
		this.shiftField= new JTextField();
		this.subField=new JTextField(); 
		this.alphbox.setLayout(new GridLayout(3,2));
		this.alphbox.add(this.eingabe01);
		this.alphbox.add(this.subField);
		this.alphbox.add(this.eingabe02);
		this.alphbox.add(this.shiftField);
		this.alphbox.add(this.generierenButton);
		this.alphbox.add(this.zurucksetztenButton);
		this.eingabe=new JLabel("Eingabe: ");
		this.inField=new JTextField(); 
		this.inOutPanel.setLayout(new GridLayout(4,1));
		this.inOutPanel.add(this.eingabe);
		this.inOutPanel.add(this.inField); 
		this.ausgabe=new JLabel("Ausgabe: "); 
		this.outField= new JTextField();
		this.inOutPanel.add(this.ausgabe);
		this.inOutPanel.add(this.outField);
		this.outField.setEditable(false);
		this.enDePanel.add(this.encryptButton, BorderLayout.SOUTH);
		this.enDePanel.add(this.decryptButton);
		this.setVisible(true);		
	}
	
	public boolean isSubstitutionSelected() {
		boolean sel;
		if(this.auswahl01.isSelected()) {
			sel=true;
		} else {
			sel=false;
		}
		return sel;
	}
	
	public boolean isSubstitution(Object o) {
		if(o==this.auswahl01) return true; 
		return false; 
	}
	public boolean isgenerierenButton(Object o) {
		if(o==this.generierenButton) return true;
		return false;
	}
	public boolean isShiftSelected() {
		boolean sel;
		if(this.auswahl02.isSelected()) {
			sel=true;
		} else {
			sel=false;
		}
		return sel;
	}
	public String getShiftField() {
		return this.shiftField.getText();
	}
	public String getSubField() {
		return this.subField.getText();
	}
	public String getIn() {
		return this.inField.getText();
	}
	public void setausgabe(String ausgabe) {
		this.outField.setText(ausgabe);
	}
	public boolean isShift(Object o) {
		if(o==this.auswahl02) return true; 
		return false; 
	}
	//Layout wechseln
	public void changeSubShi(int value) {
		if(value == Model.SHIFT) {
			this.shiftField.setEditable(true);
			this.subField.setEditable(false);
			this.m1.setMode(Model.SHIFT);
		} else {
			this.subField.setEditable(true);
			this.shiftField.setEditable(false);
			this.m1.setMode(Model.SUB);
		}
	}
	public boolean iszurucksetztenButton(Object o) {
		if(o==this.zurucksetztenButton) return true;
		return false;
	}
	
	public boolean isencryptButton(Object o) {
		if(o==this.encryptButton) return true;
		return false;
	}
	
	public boolean isdecryptButton(Object o) {
		if(o==this.decryptButton) return true;
		return false;
	}
}