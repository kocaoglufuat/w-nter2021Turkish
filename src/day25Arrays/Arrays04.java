package day25Arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
	// ýký array'ýn esýt oldugunu kontrol etme
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr1, arr2));
	
		// ýký array'ýn býrbýrýne esýt olmasý ýcýn hem uzunluklarý,icindeki tum elemanlar,
		// ve esýt elemanlarýn ýndexlerý esýt olmalýdýr
	}

}
