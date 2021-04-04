package day09Ternary;

import java.util.Scanner;

public class C5Ternary5 {

	public static void main(String[] args) {
		//Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen 
		//degerlere gore dikdorgenin kare olup olmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen kontrol için dıkdortgenın kenar uzunlarını gırınız");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		System.out.println(kenar1==kenar2 ?"kare" : "kare degıl");
		
		
	System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? 
			"kare" :"kare degıl" :"gecersız kenar uzunlugu");
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
