package day09Ternary;

import java.util.Scanner;

public class C7Ternary7 {

	public static void main(String[] args) {
	
		//Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, 
        //yoksa  “Uc  basamakli degil” yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bır sayı gırınız");
		int sayı=scan.nextInt();
		String sonuc = sayı>99 ? sayı<1000 ? " uc basamaklı": "uc basamaklı degıl" :"uc basamaklı degıl";
		
		System.out.println(sonuc);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
