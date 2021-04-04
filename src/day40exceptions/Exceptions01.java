package day40exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan
		// kucuk bir sayi girerse Exception verecek sekilde yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yasýnýzý gýrýnýz");
		int yas = scan.nextInt();

		if (yas >= 0) {
			System.out.println("girdiginiz yas :" + yas);
		} else {
			throw new IllegalArgumentException();
		}

		System.out.println("kod bloke olmamýs");
		// java ya býr exception throw ettýrmek ýcýn "throw" ve "new" keywordlarý
		// kullanýlýr

		// bu sekýlde yazdýgýmýzda java exception throw eder ama
		// kodumuz da bloke olmus olur
		// bloke olmasýný engellemek ýstersenýz kodu try catch ýle surround yapabýlýrýz
		/*
		  try { if (yas > 0) { 
		  System.out.println("girdiginiz yas :" + yas); 
		  } else {
		  throw new IllegalArgumentException(); } 
		  } catch (IllegalArgumentException e)
		  { e.printStackTrace(); 
		  }
		   System.out.println("kod bloke olmamýs");
		 */
	}

}
