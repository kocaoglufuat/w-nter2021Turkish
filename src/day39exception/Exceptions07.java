package day39exception;

import java.util.Scanner;

public class Exceptions07 {

	public static void main(String[] args) {
	/*
	 Kullacýdan carpma yapmak ýcýn býr strýng ýsteyýn
	 kullanýcýdan gýrdýgý strýng sadece sayýlardan olusuyorsa
	 sayýyý 2 ýle carpýp sonucu yazdýrýn
	 kullanýcý sayýlardan olusmayan býr strýng gýrerse
	 "Girdiginiz string sayýya cevrýlmez" yazdýrýn.
	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 ile carpmak ýcýn býr strýng gýrýn");
		String str=scan.nextLine();
		
		try {
			System.out.println(2*Integer.parseInt(str));
		} catch(NumberFormatException e) {
			System.out.println("gýrdýgýnýz strýng sayýya cevrýlmez");
		}
		
		
	}

}
