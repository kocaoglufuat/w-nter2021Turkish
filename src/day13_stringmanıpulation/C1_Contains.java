package day13_stringman�pulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {

		// kullan�c�dan b�r cumle ve aramak �sted�g� b�r Str�ng �stey�n
		// cumle String i �cer�yorsa "basar�l�" deg�lse "basar�s�z" yazd�r�n.

		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("lutfen cumle yaz�n�z");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("l�tfen aramam� �sted�g�n�z String'i giriniz");
		String aranan = scan.nextLine().toLowerCase();

		// bu �slem�n sonucu boolean, ben�m bunu yaz�ya cev�rmem laz�m
		System.out.println(cumle.contains(aranan) ? "basar�l�" : "basar�s�z");
         */
		// kullan�c�dan ma�l adres�n� �stey�n ma�l adres� @gmail.com iceriyorsa
		// "ma�l�n�z kayded�ld�", yoksa "lutfen gma�l adres�n�z� g�r�n�z"yazd�r�n

		System.out.println("lutfen ma�l adres�n� g�r�n�z");
		String Ema�l = scan.next();
		int sondam�= Ema�l.indexOf("@gmail.com",Ema�l.length()-10);
		if (Ema�l.contains("@gmail.com")) {
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("lutfen gecerl� gmail adresinizi giriniz");
		}

		//eger @gmail.com'un en sonda oldugunu kontrol etmek �stersek
		
		scan.close();
	}

}
