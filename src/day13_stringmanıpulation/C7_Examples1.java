package day13_stringmanýpulation;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {

		// kullanýcýdan 4 harflý býr kelýme ýsteyýn ve gýrýlen kelýmeyý tersten
		// yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("4 harflý býr kelime giriniz");
		String str = scan.nextLine();
		if (str.length() != 4) {
			System.out.println("lütfen 4 karakterli býr kelýme gýrýnýz");
		} else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
		}

	}

}
