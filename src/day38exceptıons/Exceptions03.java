package day38exceptýons;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaký e nýn gorevi

		int sayý1 = 10;
		int sayý2 = 0;

		Exceptions01 exp = new Exceptions01();
		// esýtlýgýn solundaký Exceptions01 hem class adý hem de exp objesi ýcýn data
		// turu

		try {
			System.out.println(sayý1 / sayý2);
		} catch (ArithmeticException e) {
			// aritmetichException java'da býr class ve e objesý ýcýndata turu
			// e ýse Arýtmetich Exception class'ýndan olusturdugumuz objenýn adý
			// o zaman ýsmý e olmak zorunda degýlýz ama genelde e kullanýlýr
			System.out.println(e);// ==>java.lang.ArithmeticException: / by zero
			// bu durumda hem java'ya sorunu yazmasý ýcýn fýrsat vermýs
			// hemde aplicayion'i bloke etmemis oluruz
			System.out.println(e.getMessage());// / by zero
		
		e.printStackTrace();
		/*
		 java.lang.ArithmeticException: / by zero
	at day38exceptýons.Exceptions03.main(Exceptions03.java:16)

		 */
		
		}
		
		
	}

}
