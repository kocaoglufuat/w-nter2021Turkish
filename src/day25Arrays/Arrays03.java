package day25Arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// ver�len b�r str�ng'� array'e nas�l cev�recez
		// ver�len b�r cumlede kac kel�me oldugunu bulunuz
		// ver�len cumlede her kel�men�n �lk harf�n� buyuk yap�n�z
		
		
		String str="herkes javay� tan�sa severdi"; // String
		//bu str�ng� kel�melere ay�ral�m
		//split methodu
		                            
		String arr[]=str.split(" "); // Array
		System.out.println(Arrays.toString(arr));
	
	
	String arr2[]=str.split("java");
	System.out.println(Arrays.toString(arr2));
	}

}
