package Programmering3;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		String fakultet = "skriv heltall: ";
		int n = parseInt(showInputDialog(fakultet));
		int x = n;
		int y=1;
		while(n>1) {
			y*=n;
			n--;
		}
		showMessageDialog(null, x+"! "+"er: "+y);
	}
}