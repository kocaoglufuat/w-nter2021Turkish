package day12_stringmanupul�t�on;

import java.util.Scanner;

public class C4�ndexOf {

	public static void main(String[] args) {

		// indexof() methodu b�ze �sted�g�m�z karakterler�n �ndex�n� d�nd�r�r

		String str = "java ogren,i� sah�b� ol";
		System.out.println(str.charAt(6));

		System.out.println(str.indexOf("b�"));
		System.out.println("baslang�c �ndex� �le" + str.indexOf('i', '7'));

		Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine().toLowerCase();
		// int sonuc = cumle.indexOf("java");
		// System.out.println(sonuc==-1 ? "java �cerm�yor" : "java �cer�yor");

		if (cumle.indexOf("java")>= 0) {// java kel�mes�n�n �ndex �n�n 0 veya daha buyuk old kon ed�yor.
			System.out.println("cumle java �cer�yor");

		} else {
			System.out.println("cumle java �cerm�yor");
		}

		
	}
}
