package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		//kullanýcýdan degerler alarak býr ýnt arry olusuturun
        //once kullanýcýdan gýrecegý sayý adetini almamýz lazým ký array'ý olusturalým
	
	Scanner scan= new Scanner(System.in);
	System.out.println("lütfen kac sayýdan olusan arry ýstedýgýmýzý yazýnýz");
	int uzunluk=scan.nextInt();
	int arr[]=new int[uzunluk];
	System.out.println("lütfen sayýlarý gýrýnýz");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
		
	}
	System.out.println(Arrays.toString(arr));
	}

}
