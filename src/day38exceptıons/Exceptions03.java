package day38except�ons;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundak� e n�n gorevi

		int say�1 = 10;
		int say�2 = 0;

		Exceptions01 exp = new Exceptions01();
		// es�tl�g�n solundak� Exceptions01 hem class ad� hem de exp objesi �c�n data
		// turu

		try {
			System.out.println(say�1 / say�2);
		} catch (ArithmeticException e) {
			// aritmetichException java'da b�r class ve e objes� �c�ndata turu
			// e �se Ar�tmetich Exception class'�ndan olusturdugumuz objen�n ad�
			// o zaman �sm� e olmak zorunda deg�l�z ama genelde e kullan�l�r
			System.out.println(e);// ==>java.lang.ArithmeticException: / by zero
			// bu durumda hem java'ya sorunu yazmas� �c�n f�rsat verm�s
			// hemde aplicayion'i bloke etmemis oluruz
			System.out.println(e.getMessage());// / by zero
		
		e.printStackTrace();
		/*
		 java.lang.ArithmeticException: / by zero
	at day38except�ons.Exceptions03.main(Exceptions03.java:16)

		 */
		
		}
		
		
	}

}
