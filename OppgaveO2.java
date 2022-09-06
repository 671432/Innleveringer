package Programmering3;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		int numberRead = 0;
		while(true) {
			if(numberRead == 10) {
				break;
			}
			String karakter = showInputDialog("Hvor mye poeng fikk eleven? ");
			int grade = parseInt(karakter);
			if(grade<0) {
				System.out.println("Ugyldig. skriv på nytt.");
				numberRead = numberRead-1;
			}
			else if(grade<=39) {
				System.out.println("Karakter: F");
			}
			else if(grade<=49) {
				System.out.println("Karakter: E");
			}
			else if(grade<=59) {
				System.out.println("Karakter: D");
			}
			else if(grade<=79) {
				System.out.println("Karakter: C");
			}
			else if(grade<=89) {
				System.out.println("Karakter: B");}
			else if(grade<=100) {
				System.out.println("Karakter: A");}
			else {
				System.out.println("Ugyldig. skriv på nytt.");
				numberRead = numberRead-1;
				}
			numberRead = numberRead+1;
		}		
	}
}