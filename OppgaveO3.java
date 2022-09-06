package Programmering3;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		String n_input = showInputDialog("Heltall");
		int n = parseInt(n_input);
		if (n > 0)
			n = ((n-1)*n);
		System.out.println(n);	
	}
}