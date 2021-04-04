package day13_stringmanýpulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {

		//kullanýcýdan býr cumle ýsteyýn 
		//cumledeki tum bosluklarý sýlýn
		//tum a larýn yerýný e yazdýýrn
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen cumle giriniz");
		String str=scan.nextLine();
		
		
	    str=str.replace(" ", "");
		str=str.replace("a", "e");
			System.out.println(str);	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
