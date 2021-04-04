package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,10,11,15};
		
		int temp=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1] =temp;
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
