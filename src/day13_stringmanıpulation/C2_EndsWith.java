package day13_stringman�pulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "java hayat ne guzel";
		System.out.println(str.endsWith("zel"));// TRUE
		System.out.println(str.endsWith("ne guzel"));// TRUE

		// Kullan�c�dan b�r email isteyin
		// eger @ i�areti �cerm�yorsa "girdiginiz bilgi email deg�l"
		// eger @ isareti �cer�yor ama @gmail.com �cerm�yorsa"lutfen gmail adresi yaz�n
		// eger ilk iki sart� sagl�yor ama @gmail.com ile bitmiyorsa "gecersiz gmail
		// adresi" yazs�n

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen email giriniz");
		String email = scan.next();
		if (!email.contains("@")) {
			System.out.println("@ g�rd�g�n�z b�lg� email deg�l");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yaz�n");

		} else if (email.endsWith("@gmail.com")) {
			System.out.println("email'niz basar�yla kayded�ld�");
		} else
			System.out.println("gecers�z gmail adresi");
		scan.close();
	}

}
