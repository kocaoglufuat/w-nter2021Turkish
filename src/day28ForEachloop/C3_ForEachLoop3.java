package day28ForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		//verilen b�r array dak� tum elemanlar� b�r l�steye aktaran b�r method yaz�n�z
		
		String arr[]= {"ali","veli","ayse","fatma","fatih"};
		
		List<String> list= listeyeCev�r(arr);
		
		list.add(0,"bu i� bu kadar");
		System.out.println(list);
		list.remove("ali");
		System.out.println(list);

	}

	public static List<String> listeyeCev�r(String[] arr) {
		List<String> geciciList = new ArrayList<>();
		for (String each : arr) {
			geciciList.add(each);
			
		}
		
		
		return geciciList;
	}

	}


