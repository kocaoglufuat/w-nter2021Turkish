package day38except�ons;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//kullan�c�dan 2 tamsay� al�n ve bolumler�n� yazd��r�n
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen bolunecek tamsay�y� g�r�n�z");
		int say�1=scan.nextInt();
		System.out.println("lutfen kaca bolmek �sted�g�n�z� yaz�n");
		int say�2=scan.nextInt();
//java excaptions'i handle etmek �c�n try-catch blogu olusturmus
	
		try {
			System.out.println("bolme �slem�n�n sonucu :"+ say�1/say�2);
		}catch(ArithmeticException e) {
			System.out.println("Say�y� s�f�ra bolemezs�n");
		}
	
	
	}

}
