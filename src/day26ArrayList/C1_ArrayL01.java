package day26ArrayList;

import java.util.Arrays;

public class C1_ArrayL01 {

	public static void main(String[] args) {
		
		/*SORU 6)
           verýlen býr array dan ýsten degere esýt olan elemanlarý kaldýrýp 
           kalanlarý yený býr array olarak yazdýran býr method yazýnýz		
		
		*/
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayý=3;
	
		//  1.adým olarak kaldýrmam ýstenen sayý kac tane var
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]==sayý) {
			count++;
		}	
	}
		//2.adým yený array olusturalým
		int arr2[]=new int[arr.length-count];
		
	//	3.adým arr array'ýndan elemanlarý tek tek alýp ýstenen sayýya esýt degýlse
	//	arr2'ye ekleyecegým
		int temp=0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr[i]!=sayý) {
				arr2[temp]=arr[i];
		  	temp++;			
		}
				
			}
	System.out.println(Arrays.toString(arr2));	
	}
	
}


