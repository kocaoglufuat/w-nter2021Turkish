package day12_stringmanupulýtýon;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  bir cumle girinz");
		String str = scan.nextLine().toUpperCase();

		System.out.println("gýrdýgýnýz cumlenýn son harfý :" + str.charAt(str.length() - 3));

		// length methodu gýrýlen Strýng in uzunlugunu verýr
		System.out.println(str);// kullanýcý ne gýrdýyse buyuk harfle yazdýrýr.

		String str3 = null; // null hýc demek
							// normalde String'ler "" icine yazýlýr ama null ýcýn buna gerek yoktur.
							// null case sensýtývedýr,dolayýsýyla NULL veya null yazýlmaz.
							// nul býr deger degýldýr,sadece hýclýgý gosteren býr poýnter'dir.

		// System.out.println(str3.length()); // RTE verir.
		
		scan.close();
	}

}
