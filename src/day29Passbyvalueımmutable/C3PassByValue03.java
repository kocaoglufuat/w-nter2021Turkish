package day29Passbyvalue�mmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C3PassByValue03 {

	public static void main(String[] args) {
	/*	Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
	 * Iki method olusturup list elemanlarini artirmayi deneyelim
	  - 1. Method�da elemanlari for each loop kullanarak artirin
	 - 2. Method�da elemanlari set method�u kullanarak artirin
  - Method�lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
*/
	
	List<Integer> list= new ArrayList<>();
	list.add(10);
	list.add(11);
	list.add(12);
	System.out.println(list);// [10, 11, 12]
	deg�st�rFor(list);
	deg�st�rSet(list);
	System.out.println("set ile deg�st�rd�g�m�z liste method'un �c�nde :"+ list);

	
	}

	public static void deg�st�rSet(List<Integer> list) {
	for (int i = 0; i < list.size(); i++) {
		list.set(i, list.get(i)+3);

	}
	System.out.println("set ile deg�st�rd�g�m�z liste method'un �c�nde :"+ list);
	}

	public static void deg�st�rFor(List<Integer> list) {
		for (Integer each : list) { // foreach loop �le l�stey� guncellem�yoruz
			each+=3;                // sadece herb�r eleman� tek tek cag�r�p 3 fazlas�n� yazd�rd�k
			
			System.out.print(each + " ");
		}
		System.out.println("");
		System.out.println(list);
	}
	
}
