package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin negatif veya pozitif
		 * oldugunu, tek mi cift mi oldugunu ve 100�den buyukse birler,onlar ve yuzler
		 * basamagindaki rakamlarin toplamini, 100�den kucukse sadece 1�ler basamagini
		 * yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen b�r tam say� g�r�n�z");
		int say� = scan.nextInt();

		pozitifNegatif(say�);// g�r�len say� argument�n�n poz�t�f yada negat�f oldugunu yazd�rs�n
		tekm�C�ftm�(say�);
	if (say�>100) {
		yuzdenBuyuk(say�);
	} else {
        yuzdenKucuk(say�);
	}
	}

	private static void yuzdenKucuk(int say�) {
		System.out.println(say�%10);
	}

	public static void yuzdenBuyuk(int say�) {
	int rakamlarToplam�=0;
	rakamlarToplam�=say�%10;
	say�/=10;
	rakamlarToplam�+=say�%10;
	say�/=10;
	rakamlarToplam�+=say�%10;
	System.out.println(rakamlarToplam�);
	}

	public static void tekm�C�ftm�(int say�) {
		if (say�%2 == 0) {
			System.out.println("say� cift");
		} else {
			System.out.println("say� tek");
		}
		
	}

	
	

	public static void pozitifNegatif(int say�) { // parametre yazarken data t�p�n� de yazmal�y�z

		System.out.println(say� > 0 ? "pozitif" : (say� < 0 ? "negatif" : "pozitif yada negatif deg�l"));

	}

}
