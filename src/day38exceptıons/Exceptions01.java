package day38exceptýons;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//kullanýcýdan 2 tamsayý alýn ve bolumlerýný yazdýýrýn
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen bolunecek tamsayýyý gýrýnýz");
		int sayý1=scan.nextInt();
		System.out.println("lutfen kaca bolmek ýstedýgýnýzý yazýn");
		int sayý2=scan.nextInt();
//java excaptions'i handle etmek ýcýn try-catch blogu olusturmus
	
		try {
			System.out.println("bolme ýslemýnýn sonucu :"+ sayý1/sayý2);
		}catch(ArithmeticException e) {
			System.out.println("Sayýyý sýfýra bolemezsýn");
		}
	
	
	}

}
