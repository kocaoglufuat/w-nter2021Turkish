package day13_stringman�pulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {

		//kullan�c�dan b�r cumle �stey�n 
		//cumledeki tum bosluklar� s�l�n
		//tum a lar�n yer�n� e yazd��rn
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen cumle giriniz");
		String str=scan.nextLine();
		
		
	    str=str.replace(" ", "");
		str=str.replace("a", "e");
			System.out.println(str);	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
