package day39exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		//icice try-catch yer�ne
		// 1tane try ve multiple catch blogu kullanab�l�r�z
		//ancak bu durumda yazd�g�m�z except�onlar aras�nda parent-ch�ld �l�sk�s� varsa
		//once ch�ld class'� yazmal�y�z
		//aks� takd�rde (yan� once parent yaz�l�rsa) ch�ld'a �s kalmaz
		//java er�s�lemez catch-blogu d�yerek CTE ver�r
		try {
			FileInputStream f�s = new FileInputStream("C:\\Users\\fuat\\eclipse-workspace\\winter2021turkish\\src\\day39exception\\file");
				int k = 0;
			try {
				while ((k = f�s.read()) != -1) {
					System.out.print((char) k);
				}
			} catch (FileNotFoundException e) { // once ch�ld exception'� yazd�k
				e.printStackTrace();
			}
		
		} catch (IOException e) {//sonra parent exception'i yazd�k

			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("kod bloke olmam�sss");
	}

}
