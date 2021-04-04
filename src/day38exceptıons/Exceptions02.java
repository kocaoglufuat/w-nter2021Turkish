package day38except�ons;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
//kullan�c�dan 2 tamsay� al�n ve bolumler�n� yazd�r�n
		int count = 1;
		Scanner scan = new Scanner(System.in);
		while (count < 100) {

			System.out.println("l�tfen bolunecek tamsay�y� g�r�n�z");
			int say�1 = scan.nextInt();
			System.out.println("lutfen kaca bolmek �sted�g�n�z� yaz�n");
			int say�2 = scan.nextInt();
			// java excaptions'i handle etmek �c�n try-catch blogu olusturmus
			// java exception �le kars�last�g�nda cal�smay� durdurur(stops execution)
			// throws exception (exception f�rlat�r)(problem�n kaynag�n� b�ze goster�r)

			// tum aplicat�on durmus olur..
			// muster�n�n kulland�g� b�r uygulama �c�n bu KABUL EDILEMEZ
			// Bunun �c�n kod yazan k�s� muhtemel sorunlar� ongormel� ve
			// java'ya bu sorunla handle edebilmesi icin yol gostermelidir
			System.out.println("i�lem no :" + count);
			try {
				System.out.println("bolme �slem�n�n sonucu :" + say�1 / say�2);
			} catch (ArithmeticException e) {
				System.out.println("say�y� s�f�ra bolemezs�n");

			}

			count++;

		}

	}

}
