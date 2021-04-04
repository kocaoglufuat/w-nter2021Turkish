package day40exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan
		// kucuk bir sayi girerse Exception verecek sekilde yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen yas�n�z� g�r�n�z");
		int yas = scan.nextInt();

		if (yas >= 0) {
			System.out.println("girdiginiz yas :" + yas);
		} else {
			throw new IllegalArgumentException();
		}

		System.out.println("kod bloke olmam�s");
		// java ya b�r exception throw ett�rmek �c�n "throw" ve "new" keywordlar�
		// kullan�l�r

		// bu sek�lde yazd�g�m�zda java exception throw eder ama
		// kodumuz da bloke olmus olur
		// bloke olmas�n� engellemek �stersen�z kodu try catch �le surround yapab�l�r�z
		/*
		  try { if (yas > 0) { 
		  System.out.println("girdiginiz yas :" + yas); 
		  } else {
		  throw new IllegalArgumentException(); } 
		  } catch (IllegalArgumentException e)
		  { e.printStackTrace(); 
		  }
		   System.out.println("kod bloke olmam�s");
		 */
	}

}
