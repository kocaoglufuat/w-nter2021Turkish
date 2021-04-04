package day25Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// ver�len b�r arry de b�r eleman�n var olup olmad�g�n� nas�l kontrol eder�z?
		
		int arr[]= {10,25,3,16,75};
		int say�=25;
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==say�) {
				flag=true;
			}
		}
		if (flag) {
			System.out.println("array sorulan eleman� �cer�yor");
		}else {
			System.out.println("arry sorulan eleman� �cerm�yor");
		}
		
		//Array's clas'�ndan method kullanarak yapal�m
		//ilk once s�ralama yapmal�y�z
	
		Arrays.sort(arr);// 3,10,16,25,75
	System.out.println(Arrays.binarySearch(arr, 25));//sonuc olarak aranan say�n�n �ndex�n� doner
	System.out.println(Arrays.binarySearch(arr, 10));// 1
	System.out.println(Arrays.binarySearch(arr, 100));//-6
	
	// b�nary searc sonuc olarak arad�g�m�z eleman varsa �ndex�n� ver�r
	//arad�g�m�z eleman yoksa - �saret� �le olsayd� kac�nc� eleman olacag�n� dondurur
	
	
	int arr2[]= {12,15,25,14,3,12,65};
	Arrays.sort(arr2);
	System.out.println(Arrays.binarySearch(arr2, 14));//3
	System.out.println(Arrays.binarySearch(arr2, 20));//-6
	
	//Array nas�l String'e cevrilir
	
	String arrString=arr2.toString();
	System.out.println(Arrays.toString(arr2));
	
	
	}
	

}
