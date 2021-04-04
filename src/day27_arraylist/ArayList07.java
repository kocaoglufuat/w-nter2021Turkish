package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArayList07 {

	public static void main(String[] args) {
		
		//verilen bır array dekı tekrarlı elemanları sılıp 
		//tekrarsız bır array olusturmak ıstıyoruz
		//array veya list kullanarak bunu yapınız
		
		int arr[]= {1,2,3,5,1,2,4,3,5,6,7,1,2,6,4,2};
		
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
	
		}
		System.out.println(list);
		Integer tekrarsızArray[]= list.toArray(new Integer[0]);
		
	}

}
