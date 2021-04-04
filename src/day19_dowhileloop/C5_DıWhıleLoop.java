package day19_dowhileloop;

import java.util.Scanner;

public class C5_DýWhýleLoop {

	public static void main(String[] args) {

		/*
		 * soru5 ) kullanýcýdan býr sýfre gýrmesýný ýsteyýn girilen sýfreyý asagýdaký
		 * sartlara gore kontrol edýn ve sýfredeký hatalarý yazdýrýn kullanýcý gecerlý
		 * býr sýfre gýrýnceye kadar bu ýslemý tekrar edýn. ve gecerlý sýfre gýrdýgýnde
		 * "sýfrenýz kabul edýlmýstýr"yazdýrýn. -sifre kucuk harf ýcermelýdýr -sýfre
		 * buyuk harf ýcermelýdýr -sýfre ozel karakter ýcermelýdýr -sýfre en az 8
		 * karakter olmalýdýr
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String sýfre = "";
		int sonuc = 0;
		do {
			System.out.println("lutfen sýfrenýzý gýrýnýz");
			sýfre = scan.nextLine();
			sonuc = kucukHarfVarmý(sýfre) + buyukHarfVarmý(sýfre) + ozelKarHarfVarmý(sýfre) + uzunlukUygunmu(sýfre);

		} while (sonuc != 4);
		System.out.println("sýfrenýz basarý ýle kaydedýldý");

	}

	public static int uzunlukUygunmu(String sýfre) {
		
		int sonucUzunluk=0;
		if(sýfre.length()<8) {
			System.out.println("sifre en az 8 karakter olmalýdýr");
			
		}else {
			sonucUzunluk=1;
		}
		return sonucUzunluk;
	}



	public static int ozelKarHarfVarmý(String sýfre) {

		int flagozelKar = 0;
		int index = 0;
		while (index < sýfre.length()) {
			if (sýfre.charAt(index) > ' ' && sýfre.charAt(index) < '/') {
				flagozelKar = 1;
			}
			index++;
		}
		if (flagozelKar == 0) {
			System.out.println("sýfre ozel karakter ýcermelidir");
		}
		return flagozelKar;
	}

	public static int buyukHarfVarmý(String sýfre) {
		int flagBuyuk = 0;
		int index = 0;
		while (index < sýfre.length()) {
			if (sýfre.charAt(index) > 'A' && sýfre.charAt(index) < 'Z') {
				flagBuyuk = 1;
			}
			index++;
		}
		if (flagBuyuk == 0) {
			System.out.println("sýfre buyuk harf ýcermelidir");
		}
		return flagBuyuk;

	}

	public static int kucukHarfVarmý(String sýfre) { // sýfre=MehmetJava123
		int flagKucuk = 0;
		int index = 0;
		while (index < sýfre.length()) {
			if (sýfre.charAt(index) > 'a' && sýfre.charAt(index) < 'z') {
				flagKucuk = 1;
			}
			index++;
		}
		if (flagKucuk == 0) {
			System.out.println("sýfre kucuk harf ýcermelidir");
		}
		return flagKucuk;
	}

}
