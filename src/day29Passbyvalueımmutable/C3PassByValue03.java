package day29Passbyvalueýmmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C3PassByValue03 {

	public static void main(String[] args) {
	/*	Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
	 * Iki method olusturup list elemanlarini artirmayi deneyelim
	  - 1. Method’da elemanlari for each loop kullanarak artirin
	 - 2. Method’da elemanlari set method’u kullanarak artirin
  - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
*/
	
	List<Integer> list= new ArrayList<>();
	list.add(10);
	list.add(11);
	list.add(12);
	System.out.println(list);// [10, 11, 12]
	degýstýrFor(list);
	degýstýrSet(list);
	System.out.println("set ile degýstýrdýgýmýz liste method'un ýcýnde :"+ list);

	
	}

	public static void degýstýrSet(List<Integer> list) {
	for (int i = 0; i < list.size(); i++) {
		list.set(i, list.get(i)+3);

	}
	System.out.println("set ile degýstýrdýgýmýz liste method'un ýcýnde :"+ list);
	}

	public static void degýstýrFor(List<Integer> list) {
		for (Integer each : list) { // foreach loop ýle lýsteyý guncellemýyoruz
			each+=3;                // sadece herbýr elemaný tek tek cagýrýp 3 fazlasýný yazdýrdýk
			
			System.out.print(each + " ");
		}
		System.out.println("");
		System.out.println(list);
	}
	
}
