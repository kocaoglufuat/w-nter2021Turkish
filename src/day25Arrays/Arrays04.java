package day25Arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
	// �k� array'�n es�t oldugunu kontrol etme
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr1, arr2));
	
		// �k� array'�n b�rb�r�ne es�t olmas� �c�n hem uzunluklar�,icindeki tum elemanlar,
		// ve es�t elemanlar�n �ndexler� es�t olmal�d�r
	}

}
