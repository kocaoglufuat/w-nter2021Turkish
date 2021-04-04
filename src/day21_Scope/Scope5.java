package day21_Scope;

public class Scope5 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			String isim = "Ayse";
			System.out.println(i + " " + isim);

		}
		// System.out.println(isim); //loop ýcýnde olusuturulan verýable'lar loop'a
		// ozeldýr
		// ve loop dýsýnda kullanýlmaz
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " ");
		}
    
		// system.out.println(i); 
	int count=0; // method'a ait local verýable dýr
	             // deger atamadan kullanmaya calýsýrsanýz CTE  alýrsýnýz.
	
	while (count<5) {
		System.out.println(count);
		count++;
		
		
	}
  }
}
