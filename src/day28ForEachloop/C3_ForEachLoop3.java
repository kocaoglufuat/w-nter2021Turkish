package day28ForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		//verilen býr array daký tum elemanlarý býr lýsteye aktaran býr method yazýnýz
		
		String arr[]= {"ali","veli","ayse","fatma","fatih"};
		
		List<String> list= listeyeCevýr(arr);
		
		list.add(0,"bu iþ bu kadar");
		System.out.println(list);
		list.remove("ali");
		System.out.println(list);

	}

	public static List<String> listeyeCevýr(String[] arr) {
		List<String> geciciList = new ArrayList<>();
		for (String each : arr) {
			geciciList.add(each);
			
		}
		
		
		return geciciList;
	}

	}


