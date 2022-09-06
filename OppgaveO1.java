package Programmering3;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
			
		double skatt=0,brutto;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Hva er din brutto inntekt? ");
			brutto=sc.nextDouble();
		}
		if(brutto<=190349)
			skatt=0;
		else if(brutto<=267899)
			skatt=0.017*(brutto);
		else if(brutto<=643799)
			skatt=(0.04*(brutto));
		else if(brutto<=969199)
			skatt=(0.134*(brutto));
		else if(brutto<=1999999)
			skatt=(0.164*(brutto));
		else
			skatt=(0.174*(brutto));
		System.out.println("Skatten din er: "+skatt + "kr");
	}
}