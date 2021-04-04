package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		//icice try-catch yerýne
		// 1tane try ve multiple catch blogu kullanabýlýrýz
		//ancak bu durumda yazdýgýmýz exceptýonlar arasýnda parent-chýld ýlýskýsý varsa
		//once chýld class'ý yazmalýyýz
		//aksý takdýrde (yaný once parent yazýlýrsa) chýld'a ýs kalmaz
		//java erýsýlemez catch-blogu dýyerek CTE verýr
		try {
			FileInputStream fýs = new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
				int k = 0;
			try {
				while ((k = fýs.read()) != -1) {
					System.out.print((char) k);
				}
			} catch (FileNotFoundException e) { // once chýld exception'ý yazdýk
				e.printStackTrace();
			}
		
		} catch (IOException e) {//sonra parent exception'i yazdýk

			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("kod bloke olmamýsss");
	}

}
