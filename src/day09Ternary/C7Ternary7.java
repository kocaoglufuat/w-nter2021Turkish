package day09Ternary;

import java.util.Scanner;

public class C7Ternary7 {

	public static void main(String[] args) {
	
		//Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise �uc basamakli sayi�, 
        //yoksa  �Uc  basamakli degil� yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen b�r say� g�r�n�z");
		int say�=scan.nextInt();
		String sonuc = say�>99 ? say�<1000 ? " uc basamakl�": "uc basamakl� deg�l" :"uc basamakl� deg�l";
		
		System.out.println(sonuc);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
