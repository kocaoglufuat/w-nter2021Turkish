package day16_Forloop;

import java.util.Scanner;

public class C5_Forloop5 {

	public static void main(String[] args) {

		// interview question Kullan�c�dan 100'den kucuk b�r tamsay� �stey�n
		// say� 3'un kat� �se say� yer�ne "java" yazd�r�n
		// say� 5'in kat� �se say� yer�ne "guzeld�r" yazd�r�n.
		// say� hem 3'un hem 5'�n kat� �se say� yer�ne "java guzeld�r" yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 100'den kucuk b�r tamsay� g�r�n�z");
		int say� = scan.nextInt();

		for (int i = 0; i <= say�; i++) {
			if (i % 15 == 0) {
				System.out.println("java guzeld�r"+" ");
			} else if (i % 5 == 0) {
				System.out.print("guzeld�r"+" ");
			} else if (i % 3 == 0) {
				System.out.print("java"+ " ");
			} else {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
