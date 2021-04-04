package day19_dowhileloop;

import java.util.Scanner;

public class C5_D�Wh�leLoop {

	public static void main(String[] args) {

		/*
		 * soru5 ) kullan�c�dan b�r s�fre g�rmes�n� �stey�n girilen s�frey� asag�dak�
		 * sartlara gore kontrol ed�n ve s�fredek� hatalar� yazd�r�n kullan�c� gecerl�
		 * b�r s�fre g�r�nceye kadar bu �slem� tekrar ed�n. ve gecerl� s�fre g�rd�g�nde
		 * "s�fren�z kabul ed�lm�st�r"yazd�r�n. -sifre kucuk harf �cermel�d�r -s�fre
		 * buyuk harf �cermel�d�r -s�fre ozel karakter �cermel�d�r -s�fre en az 8
		 * karakter olmal�d�r
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String s�fre = "";
		int sonuc = 0;
		do {
			System.out.println("lutfen s�fren�z� g�r�n�z");
			s�fre = scan.nextLine();
			sonuc = kucukHarfVarm�(s�fre) + buyukHarfVarm�(s�fre) + ozelKarHarfVarm�(s�fre) + uzunlukUygunmu(s�fre);

		} while (sonuc != 4);
		System.out.println("s�fren�z basar� �le kayded�ld�");

	}

	public static int uzunlukUygunmu(String s�fre) {
		
		int sonucUzunluk=0;
		if(s�fre.length()<8) {
			System.out.println("sifre en az 8 karakter olmal�d�r");
			
		}else {
			sonucUzunluk=1;
		}
		return sonucUzunluk;
	}



	public static int ozelKarHarfVarm�(String s�fre) {

		int flagozelKar = 0;
		int index = 0;
		while (index < s�fre.length()) {
			if (s�fre.charAt(index) > ' ' && s�fre.charAt(index) < '/') {
				flagozelKar = 1;
			}
			index++;
		}
		if (flagozelKar == 0) {
			System.out.println("s�fre ozel karakter �cermelidir");
		}
		return flagozelKar;
	}

	public static int buyukHarfVarm�(String s�fre) {
		int flagBuyuk = 0;
		int index = 0;
		while (index < s�fre.length()) {
			if (s�fre.charAt(index) > 'A' && s�fre.charAt(index) < 'Z') {
				flagBuyuk = 1;
			}
			index++;
		}
		if (flagBuyuk == 0) {
			System.out.println("s�fre buyuk harf �cermelidir");
		}
		return flagBuyuk;

	}

	public static int kucukHarfVarm�(String s�fre) { // s�fre=MehmetJava123
		int flagKucuk = 0;
		int index = 0;
		while (index < s�fre.length()) {
			if (s�fre.charAt(index) > 'a' && s�fre.charAt(index) < 'z') {
				flagKucuk = 1;
			}
			index++;
		}
		if (flagKucuk == 0) {
			System.out.println("s�fre kucuk harf �cermelidir");
		}
		return flagKucuk;
	}

}
