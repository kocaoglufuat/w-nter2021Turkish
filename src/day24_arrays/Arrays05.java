package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		
		
		int arr[]= {25,17,6,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//ayný arry'ý buyukten kucuge dogru nasýl yazdýrabýlýrýz ?
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] +" ");
		}
System.out.println("");		
System.out.println(Arrays.toString(arr));
	}

}
