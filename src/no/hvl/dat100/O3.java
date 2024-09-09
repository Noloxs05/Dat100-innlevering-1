package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
	 String test=JOptionPane.showInputDialog("skriv inn eit heltall");
	int n= Integer.parseInt(test);
	int fakultet=1;
	
	for(int i=1; i <=n; i++) {
		fakultet *=i;
	}
	System.out.println("fakultet av" + n + "er"+ fakultet);
	}
}


