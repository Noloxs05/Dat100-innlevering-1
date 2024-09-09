package no.hvl.dat100;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
public class O2 {
	
	public static void main(String[] args) {
		String test=JOptionPane.showInputDialog("skriv inn inntekt");
		int inntekt=Integer.parseInt(test);
		int x=inntekt;
		if(inntekt>=1350001) {
		System.out.println( "17,6%");
		double prosent=17.6;
		double resultat= inntekt* (prosent/100);
		System.out.println(resultat);
		}
		else if (inntekt<= 1350000 && inntekt>=937901) {
			System.out.println("16,6%");
			double prosent=16.6;
			double resultat= inntekt* (prosent/100);
			System.out.println(resultat);
		}
		else if (inntekt<= 937900 && inntekt>=670001) {
			System.out.println("13,6");
			double prosent=13.6;
			double resultat= inntekt* (prosent/100);
			System.out.println(resultat);
		}
		else if (inntekt<=670000 && inntekt>= 292851) {
			System.out.println("4,0");
			double prosent=4.0;
			double resultat= inntekt* (prosent/100);
			System.out.println(resultat);
		}
		else if (inntekt<=292850 && inntekt>=208850) {
			System.out.println("1,7");
			double prosent=1.7;
			double resultat= inntekt* (prosent/100);
			System.out.println(resultat);
		}
		else {
			System.out.println("0%");
			double prosent=0;
			double resultat= inntekt* (prosent/100);
			System.out.println(resultat);
		}
	}

}


