package day40exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		//

		int arr[] = { 1, 4, 7, 8 };
		try {
			System.out.println(arr[20]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	finally {
		System.out.println("ne olursa olsun bu sat�r yaz�ls�n");
	}
		
		System.out.println("kod bloke olmam�s");
		// Finally blogu try-catch blogu �le veya sadece try blogu �le cal�sab�l�r
        // finally blogu catch ile ongordugum b�r sorun oldugunda cal�st�g� g�b�
		//ongormed�g�m b�r except�on olustugunda da cal�s�r...
	}

}
