package day39exception;

import java.util.Scanner;

public class Exceptions07 {

	public static void main(String[] args) {
	/*
	 Kullac�dan carpma yapmak �c�n b�r str�ng �stey�n
	 kullan�c�dan g�rd�g� str�ng sadece say�lardan olusuyorsa
	 say�y� 2 �le carp�p sonucu yazd�r�n
	 kullan�c� say�lardan olusmayan b�r str�ng g�rerse
	 "Girdiginiz string say�ya cevr�lmez" yazd�r�n.
	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 ile carpmak �c�n b�r str�ng g�r�n");
		String str=scan.nextLine();
		
		try {
			System.out.println(2*Integer.parseInt(str));
		} catch(NumberFormatException e) {
			System.out.println("g�rd�g�n�z str�ng say�ya cevr�lmez");
		}
		
		
	}

}
