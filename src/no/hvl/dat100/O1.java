package no.hvl.dat100;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class O1 {


	public static void main(String[] args) {
		for( int i= 1; i<=10; i++) {
		String karakter = JOptionPane.showInputDialog("skriv inn poengsum ");
		int poengsum= Integer.parseInt(karakter);
		if(poengsum<=100 && poengsum>=90){
			System.out.println("A");
		}
		else if (poengsum<=89 && poengsum>=80) {
			System.out.println("B");
		}
		else if (poengsum<=79 && poengsum>=60) {
			System.out.println("C");
		}
		else if (poengsum<=59 && poengsum>=50) {
			System.out.println("D");
		}
		else if ( poengsum<=49 && poengsum>=40) {
			System.out.println("E");
		}
		else if (poengsum<=39 && poengsum>=0) {
			System.out.println("F");
		
		}
		else {
			i=i-1;
		}
		}
		
		

	}

}
