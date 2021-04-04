package day40exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fýs = new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");

		// try-catch blogu exceptýon ýle handle etmekde kullanýlýr
		//throws keyword'u ýse sadece declaratýon'dýr,dolayýsýyla
		//throws kullanýlan býr method'da exceptýon olusursa KOD BLOKE OLUR
		int k = 0;
		
		while((k=fýs.read())!=-1) {
			System.out.print((char)k);
	}

		//eger býrden fazla exceptýon ýcýn throws keyword'u kullanacaksak
		//yazacagýmýz exceptýonlarýn arasýndaký ýlýskýsý ve sýralama onemlý olur
		//eger yazdýgýmýz exception'lar arasýnda parent-chýld ýlýskýsý varsa
		//once chýld exception yazýlmalýdýr,aksý takdýrde chýld exc,erýsýlmez olur
		
		//eger yazacaklarýmýz arasýnda parent-chýld ýlýskýsý varsa
		//
}
}