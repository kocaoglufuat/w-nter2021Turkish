package day13_stringman�pulation;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {

		// kullan�c�dan 4 harfl� b�r kel�me �stey�n ve g�r�len kel�mey� tersten
		// yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfl� b�r kelime giriniz");
		String str = scan.nextLine();
		if (str.length() != 4) {
			System.out.println("l�tfen 4 karakterli b�r kel�me g�r�n�z");
		} else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
		}

	}

}
