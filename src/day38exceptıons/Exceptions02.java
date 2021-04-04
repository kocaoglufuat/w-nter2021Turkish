package day38exceptýons;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
//kullanýcýdan 2 tamsayý alýn ve bolumlerýný yazdýrýn
		int count = 1;
		Scanner scan = new Scanner(System.in);
		while (count < 100) {

			System.out.println("lütfen bolunecek tamsayýyý gýrýnýz");
			int sayý1 = scan.nextInt();
			System.out.println("lutfen kaca bolmek ýstedýgýnýzý yazýn");
			int sayý2 = scan.nextInt();
			// java excaptions'i handle etmek ýcýn try-catch blogu olusturmus
			// java exception ýle karsýlastýgýnda calýsmayý durdurur(stops execution)
			// throws exception (exception fýrlatýr)(problemýn kaynagýný býze gosterýr)

			// tum aplicatýon durmus olur..
			// musterýnýn kullandýgý býr uygulama ýcýn bu KABUL EDILEMEZ
			// Bunun ýcýn kod yazan kýsý muhtemel sorunlarý ongormelý ve
			// java'ya bu sorunla handle edebilmesi icin yol gostermelidir
			System.out.println("iþlem no :" + count);
			try {
				System.out.println("bolme ýslemýnýn sonucu :" + sayý1 / sayý2);
			} catch (ArithmeticException e) {
				System.out.println("sayýyý sýfýra bolemezsýn");

			}

			count++;

		}

	}

}
