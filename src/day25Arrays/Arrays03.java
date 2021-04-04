package day25Arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verýlen býr strýng'ý array'e nasýl cevýrecez
		// verýlen býr cumlede kac kelýme oldugunu bulunuz
		// verýlen cumlede her kelýmenýn ýlk harfýný buyuk yapýnýz
		
		
		String str="herkes javayý tanýsa severdi"; // String
		//bu strýngý kelýmelere ayýralým
		//split methodu
		                            
		String arr[]=str.split(" "); // Array
		System.out.println(Arrays.toString(arr));
	
	
	String arr2[]=str.split("java");
	System.out.println(Arrays.toString(arr2));
	}

}
