package day40exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream f�s = new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");

		// try-catch blogu except�on �le handle etmekde kullan�l�r
		//throws keyword'u �se sadece declarat�on'd�r,dolay�s�yla
		//throws kullan�lan b�r method'da except�on olusursa KOD BLOKE OLUR
		int k = 0;
		
		while((k=f�s.read())!=-1) {
			System.out.print((char)k);
	}

		//eger b�rden fazla except�on �c�n throws keyword'u kullanacaksak
		//yazacag�m�z except�onlar�n aras�ndak� �l�sk�s� ve s�ralama oneml� olur
		//eger yazd�g�m�z exception'lar aras�nda parent-ch�ld �l�sk�s� varsa
		//once ch�ld exception yaz�lmal�d�r,aks� takd�rde ch�ld exc,er�s�lmez olur
		
		//eger yazacaklar�m�z aras�nda parent-ch�ld �l�sk�s� varsa
		//
}
}