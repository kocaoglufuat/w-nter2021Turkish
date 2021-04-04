package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Exceptions01 {

	public static void main(String[] args)  {
		//java'ya býr dosyayý veya dosyaya yazmasýný soyledýgýmýzde
		//java "ya dosyayý bulamazsam" der ve býzden cozum uretmemýzý bekler
		//dosya bulma ile ilgili exception turu : FileNoTFoundException
		//java kodu yazar yazmaz burdaký olasý problemý gorur ve CTE verýr
		//kodumuzu yazdýgýmýz anda ortaya cýkan bu tur exception'lara Checked Exceptions diyoruz
		
		try {
			FileInputStream fýs=new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmamýsss");
	}
}
