package day26ArrayList;

import java.util.Arrays;

public class C1_ArrayL01 {

	public static void main(String[] args) {
		
		/*SORU 6)
           ver�len b�r array dan �sten degere es�t olan elemanlar� kald�r�p 
           kalanlar� yen� b�r array olarak yazd�ran b�r method yaz�n�z		
		
		*/
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int say�=3;
	
		//  1.ad�m olarak kald�rmam �stenen say� kac tane var
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]==say�) {
			count++;
		}	
	}
		//2.ad�m yen� array olustural�m
		int arr2[]=new int[arr.length-count];
		
	//	3.ad�m arr array'�ndan elemanlar� tek tek al�p �stenen say�ya es�t deg�lse
	//	arr2'ye ekleyeceg�m
		int temp=0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr[i]!=say�) {
				arr2[temp]=arr[i];
		  	temp++;			
		}
				
			}
	System.out.println(Arrays.toString(arr2));	
	}
	
}


