package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		//kullan�c�dan degerler alarak b�r �nt arry olusuturun
        //once kullan�c�dan g�receg� say� adetini almam�z laz�m k� array'� olustural�m
	
	Scanner scan= new Scanner(System.in);
	System.out.println("l�tfen kac say�dan olusan arry �sted�g�m�z� yaz�n�z");
	int uzunluk=scan.nextInt();
	int arr[]=new int[uzunluk];
	System.out.println("l�tfen say�lar� g�r�n�z");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
		
	}
	System.out.println(Arrays.toString(arr));
	}

}
