package day13_stringmanýpulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {

		// kullanýcýdan býr cumle ve aramak ýstedýgý býr Strýng ýsteyýn
		// cumle String i ýcerýyorsa "basarýlý" degýlse "basarýsýz" yazdýrýn.

		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("lutfen cumle yazýnýz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("lütfen aramamý ýstedýgýnýz String'i giriniz");
		String aranan = scan.nextLine().toLowerCase();

		// bu ýslemýn sonucu boolean, beným bunu yazýya cevýrmem lazým
		System.out.println(cumle.contains(aranan) ? "basarýlý" : "basarýsýz");
         */
		// kullanýcýdan maýl adresýný ýsteyýn maýl adresý @gmail.com iceriyorsa
		// "maýlýnýz kaydedýldý", yoksa "lutfen gmaýl adresýnýzý gýrýnýz"yazdýrýn

		System.out.println("lutfen maýl adresýný gýrýnýz");
		String Emaýl = scan.next();
		int sondamý= Emaýl.indexOf("@gmail.com",Emaýl.length()-10);
		if (Emaýl.contains("@gmail.com")) {
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("lutfen gecerlý gmail adresinizi giriniz");
		}

		//eger @gmail.com'un en sonda oldugunu kontrol etmek ýstersek
		
		scan.close();
	}

}
