package day12_stringmanupul�t�on;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  bir cumle girinz");
		String str = scan.nextLine().toUpperCase();

		System.out.println("g�rd�g�n�z cumlen�n son harf� :" + str.charAt(str.length() - 3));

		// length methodu g�r�len Str�ng in uzunlugunu ver�r
		System.out.println(str);// kullan�c� ne g�rd�yse buyuk harfle yazd�r�r.

		String str3 = null; // null h�c demek
							// normalde String'ler "" icine yaz�l�r ama null �c�n buna gerek yoktur.
							// null case sens�t�ved�r,dolay�s�yla NULL veya null yaz�lmaz.
							// nul b�r deger deg�ld�r,sadece h�cl�g� gosteren b�r po�nter'dir.

		// System.out.println(str3.length()); // RTE verir.
		
		scan.close();
	}

}
