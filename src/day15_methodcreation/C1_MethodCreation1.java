package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin negatif veya pozitif
		 * oldugunu, tek mi cift mi oldugunu ve 100’den buyukse birler,onlar ve yuzler
		 * basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler basamagini
		 * yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen býr tam sayý gýrýnýz");
		int sayý = scan.nextInt();

		pozitifNegatif(sayý);// gýrýlen sayý argumentýnýn pozýtýf yada negatýf oldugunu yazdýrsýn
		tekmýCýftmý(sayý);
	if (sayý>100) {
		yuzdenBuyuk(sayý);
	} else {
        yuzdenKucuk(sayý);
	}
	}

	private static void yuzdenKucuk(int sayý) {
		System.out.println(sayý%10);
	}

	public static void yuzdenBuyuk(int sayý) {
	int rakamlarToplamý=0;
	rakamlarToplamý=sayý%10;
	sayý/=10;
	rakamlarToplamý+=sayý%10;
	sayý/=10;
	rakamlarToplamý+=sayý%10;
	System.out.println(rakamlarToplamý);
	}

	public static void tekmýCýftmý(int sayý) {
		if (sayý%2 == 0) {
			System.out.println("sayý cift");
		} else {
			System.out.println("sayý tek");
		}
		
	}

	
	

	public static void pozitifNegatif(int sayý) { // parametre yazarken data týpýný de yazmalýyýz

		System.out.println(sayý > 0 ? "pozitif" : (sayý < 0 ? "negatif" : "pozitif yada negatif degýl"));

	}

}
