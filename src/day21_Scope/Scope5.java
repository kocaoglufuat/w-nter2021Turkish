package day21_Scope;

public class Scope5 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			String isim = "Ayse";
			System.out.println(i + " " + isim);

		}
		// System.out.println(isim); //loop �c�nde olusuturulan ver�able'lar loop'a
		// ozeld�r
		// ve loop d�s�nda kullan�lmaz
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " ");
		}
    
		// system.out.println(i); 
	int count=0; // method'a ait local ver�able d�r
	             // deger atamadan kullanmaya cal�s�rsan�z CTE  al�rs�n�z.
	
	while (count<5) {
		System.out.println(count);
		count++;
		
		
	}
  }
}
