package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 eger kodumuzu yazdýgýmýzda býrden fazla exceptýon'la ýlýskýlý durum olusuyorsa
		 ýcýce try-catch bloklarý olusturabýlýrýz
		 bu ornekte ýlk once dosyayý okutmak ýstedýk
		 java'ya dosyayý bulamazsam? " dýye býzden yardým ýstedý
		 Býz de try-catch blogu ýle FileNotFoundException ile handle etmesýnde yardýmcý olduk
		 sonra dosyadaki yazýlarý okumaya calýstýk ve java yenýden "ya dosyayý okuyamazsam" dýye yardým ýstedý
		 Biz de try-catch blogu ýle IOException ýle handle etmesýný sagladýk
		 */
		try {
			FileInputStream fýs=new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
		int k=0;
	try {
		while((k=fýs.read())!=-1) {
			System.out.print((char)k);
		}
	} catch (IOException e) { // dosyalarla ýlgýlý genel yazma ve okuma sorunlarý ile handle eder
		
		e.printStackTrace();
	}
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
		}
	System.out.println("kod bloke olmamýsss");
	}

}
