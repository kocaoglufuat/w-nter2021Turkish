package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 eger kodumuzu yazd�g�m�zda b�rden fazla except�on'la �l�sk�l� durum olusuyorsa
		 �c�ce try-catch bloklar� olusturab�l�r�z
		 bu ornekte �lk once dosyay� okutmak �sted�k
		 java'ya dosyay� bulamazsam? " d�ye b�zden yard�m �sted�
		 B�z de try-catch blogu �le FileNotFoundException ile handle etmes�nde yard�mc� olduk
		 sonra dosyadaki yaz�lar� okumaya cal�st�k ve java yen�den "ya dosyay� okuyamazsam" d�ye yard�m �sted�
		 Biz de try-catch blogu �le IOException �le handle etmes�n� saglad�k
		 */
		try {
			FileInputStream f�s=new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
		int k=0;
	try {
		while((k=f�s.read())!=-1) {
			System.out.print((char)k);
		}
	} catch (IOException e) { // dosyalarla �lg�l� genel yazma ve okuma sorunlar� ile handle eder
		
		e.printStackTrace();
	}
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
		}
	System.out.println("kod bloke olmam�sss");
	}

}
