package day25Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30};
		String �s�mler[]= new String[4];
		System.out.println(�s�mler[1]);
		�s�mler[2]="boss";
		�s�mler[0]="elveda";
		System.out.println(Arrays.toString(�s�mler));
	
	//method kullanamdan tum elemanlar� yazd�ral�m
		for (int i = 0; i < �s�mler.length; i++) {
			System.out.println(�s�mler[i]+" ");
		}
	System.out.println(Arrays.toString(arr));

	// Array�n elemanlar�n� nas�l s�ralayab�l�r�z
	�s�mler[1]="fuat";
	�s�mler[3]="recep";
	Arrays.sort(�s�mler);
	System.out.println(Arrays.toString(�s�mler));
	}

}
