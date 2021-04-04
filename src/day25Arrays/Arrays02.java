package day25Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verýlen býr arry de býr elemanýn var olup olmadýgýný nasýl kontrol ederýz?
		
		int arr[]= {10,25,3,16,75};
		int sayý=25;
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayý) {
				flag=true;
			}
		}
		if (flag) {
			System.out.println("array sorulan elemaný ýcerýyor");
		}else {
			System.out.println("arry sorulan elemaný ýcermýyor");
		}
		
		//Array's clas'ýndan method kullanarak yapalým
		//ilk once sýralama yapmalýyýz
	
		Arrays.sort(arr);// 3,10,16,25,75
	System.out.println(Arrays.binarySearch(arr, 25));//sonuc olarak aranan sayýnýn ýndexýný doner
	System.out.println(Arrays.binarySearch(arr, 10));// 1
	System.out.println(Arrays.binarySearch(arr, 100));//-6
	
	// býnary searc sonuc olarak aradýgýmýz eleman varsa ýndexýný verýr
	//aradýgýmýz eleman yoksa - ýsaretý ýle olsaydý kacýncý eleman olacagýný dondurur
	
	
	int arr2[]= {12,15,25,14,3,12,65};
	Arrays.sort(arr2);
	System.out.println(Arrays.binarySearch(arr2, 14));//3
	System.out.println(Arrays.binarySearch(arr2, 20));//-6
	
	//Array nasýl String'e cevrilir
	
	String arrString=arr2.toString();
	System.out.println(Arrays.toString(arr2));
	
	
	}
	

}
