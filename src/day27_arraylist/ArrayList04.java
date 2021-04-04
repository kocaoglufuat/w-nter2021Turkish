package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);

		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);

		System.out.println(list1.equals(list2));// FALSE

		// EQUALS () methodu 2 listeyi hem elemanlar hemde elemanlarýn ýndexlerý ýle
		// karsýlastýrýr
		// hem elemanlar hem de ýndexler esýt ýse true doner, yoksa false doner
		System.out.println(list1.equals(list2));
		Collections.sort(list1);
		Collections.sort(list2);// kucukten buyuge dogru sýraladýktan sonra sonuc true doner
		System.out.println(list1.equals(list2));//true

		list1.clear();
		System.out.println(list1);//list temýzler []
		
		
	}
}