package day13_stringmanýpulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "java hayat ne guzel";
		System.out.println(str.endsWith("zel"));// TRUE
		System.out.println(str.endsWith("ne guzel"));// TRUE

		// Kullanýcýdan býr email isteyin
		// eger @ iþareti ýcermýyorsa "girdiginiz bilgi email degýl"
		// eger @ isareti ýcerýyor ama @gmail.com ýcermýyorsa"lutfen gmail adresi yazýn
		// eger ilk iki sartý saglýyor ama @gmail.com ile bitmiyorsa "gecersiz gmail
		// adresi" yazsýn

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen email giriniz");
		String email = scan.next();
		if (!email.contains("@")) {
			System.out.println("@ gýrdýgýnýz býlgý email degýl");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yazýn");

		} else if (email.endsWith("@gmail.com")) {
			System.out.println("email'niz basarýyla kaydedýldý");
		} else
			System.out.println("gecersýz gmail adresi");
		scan.close();
	}

}
