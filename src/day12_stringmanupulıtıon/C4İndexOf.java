package day12_stringmanupulýtýon;

import java.util.Scanner;

public class C4ÝndexOf {

	public static void main(String[] args) {

		// indexof() methodu býze ýstedýgýmýz karakterlerýn ýndexýný döndürür

		String str = "java ogren,iþ sahýbý ol";
		System.out.println(str.charAt(6));

		System.out.println(str.indexOf("bý"));
		System.out.println("baslangýc ýndexý ýle" + str.indexOf('i', '7'));

		Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine().toLowerCase();
		// int sonuc = cumle.indexOf("java");
		// System.out.println(sonuc==-1 ? "java ýcermýyor" : "java ýcerýyor");

		if (cumle.indexOf("java")>= 0) {// java kelýmesýnýn ýndex ýnýn 0 veya daha buyuk old kon edýyor.
			System.out.println("cumle java ýcerýyor");

		} else {
			System.out.println("cumle java ýcermýyor");
		}

		
	}
}
