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
		System.out.println("ne olursa olsun bu satýr yazýlsýn");
	}
		
		System.out.println("kod bloke olmamýs");
		// Finally blogu try-catch blogu ýle veya sadece try blogu ýle calýsabýlýr
        // finally blogu catch ile ongordugum býr sorun oldugunda calýstýgý gýbý
		//ongormedýgým býr exceptýon olustugunda da calýsýr...
	}

}
