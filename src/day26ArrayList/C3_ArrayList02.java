package day26ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		//list uzunlugu nas�l bulunur
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
	System.out.println(list);//[10,15,8,12,20]
	System.out.println(list.size());// 5
	// b�r eleman nas�l s�l�n�r
	list.remove(1);
	System.out.println(list);
	System.out.println(list.remove(2));//git 12'yi kald�r ded�k, b�ze 12'y� dondurur
	//remove (�ndex) kulland�g�m�zda o �ndexdek� eleman� remove eder
	// ve bunun del�l� olarak b�ze o eleman� get�r�r
	//eger olmayan b�r �ndex g�rersek RTE ver�r
	System.out.println(list); // [10,8,20]
	
	List<String> list2 = new ArrayList<>();
    list2.add("ali");
	
	System.out.println(list2.remove("hasan"));// g�t hasan� kald�r ded�k bulamad�g� �c�n false dondurur
	System.out.println(list2);
	//remove object methodu kullan�ld�g�nda eger java �stenen eleman� bulup remove ederse
	//b�ze remove ed�len eleman� dondurur, listede bulamazsa �sted�g�n yer�ne
	//ge�t�rlemed�g�n� anlamam�z �c�n false dondurur
	System.out.println(list2.remove("ali"));
	
	
	}

}
