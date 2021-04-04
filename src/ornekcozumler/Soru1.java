package ornekcozumler;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String cumle =scan.nextLine().toLowerCase();
		 int sonuc = cumle.indexOf("java");
		System.out.println(sonuc==-1 ? "java ýcermýyor" : "java ýcerýyor" );
		

	}

}
