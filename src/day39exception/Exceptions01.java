package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Exceptions01 {

	public static void main(String[] args)  {
		//java'ya b�r dosyay� veya dosyaya yazmas�n� soyled�g�m�zde
		//java "ya dosyay� bulamazsam" der ve b�zden cozum uretmem�z� bekler
		//dosya bulma ile ilgili exception turu : FileNoTFoundException
		//java kodu yazar yazmaz burdak� olas� problem� gorur ve CTE ver�r
		//kodumuzu yazd�g�m�z anda ortaya c�kan bu tur exception'lara Checked Exceptions diyoruz
		
		try {
			FileInputStream f�s=new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmam�sss");
	}
}
