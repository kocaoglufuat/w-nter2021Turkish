package day26ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		//list uzunlugu nasýl bulunur
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
	System.out.println(list);//[10,15,8,12,20]
	System.out.println(list.size());// 5
	// býr eleman nasýl sýlýnýr
	list.remove(1);
	System.out.println(list);
	System.out.println(list.remove(2));//git 12'yi kaldýr dedýk, býze 12'yý dondurur
	//remove (ýndex) kullandýgýmýzda o ýndexdeký elemaný remove eder
	// ve bunun delýlý olarak býze o elemaný getýrýr
	//eger olmayan býr ýndex gýrersek RTE verýr
	System.out.println(list); // [10,8,20]
	
	List<String> list2 = new ArrayList<>();
    list2.add("ali");
	
	System.out.println(list2.remove("hasan"));// gýt hasaný kaldýr dedýk bulamadýgý ýcýn false dondurur
	System.out.println(list2);
	//remove object methodu kullanýldýgýnda eger java ýstenen elemaný bulup remove ederse
	//býze remove edýlen elemaný dondurur, listede bulamazsa ýstedýgýn yerýne
	//geýtýrlemedýgýný anlamamýz ýcýn false dondurur
	System.out.println(list2.remove("ali"));
	
	
	}

}
