package day16_Forloop;

import java.util.Scanner;

public class C6_Forloop6 {

	public static void main(String[] args) {
		// soru8) Intervýew questýon kullanýcýdan býr string ýsteyýn ve
		// stringi tersýne cevýren býr program yazýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersýne cevýrmek ýcýn býr yazý gýrýnýz");
		String yazý = scan.nextLine();
		String tersyazý = "";
		for (int i = yazý.length()-1; i >= 0; i--) {

			tersyazý += yazý.charAt(i);
		}
		System.out.print("gýrdýgýnýz yazýnýn tersten yazýlýsý : "  +tersyazý);

	

	}


}