package day25Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30};
		String ýsýmler[]= new String[4];
		System.out.println(ýsýmler[1]);
		ýsýmler[2]="boss";
		ýsýmler[0]="elveda";
		System.out.println(Arrays.toString(ýsýmler));
	
	//method kullanamdan tum elemanlarý yazdýralým
		for (int i = 0; i < ýsýmler.length; i++) {
			System.out.println(ýsýmler[i]+" ");
		}
	System.out.println(Arrays.toString(arr));

	// Arrayýn elemanlarýný nasýl sýralayabýlýrýz
	ýsýmler[1]="fuat";
	ýsýmler[3]="recep";
	Arrays.sort(ýsýmler);
	System.out.println(Arrays.toString(ýsýmler));
	}

}
