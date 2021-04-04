package day16_Forloop;

import java.util.Scanner;

public class C3_Forloop3 {

	public static void main(String[] args) {
		
		//kullanýcýdan pozýtýf býr tamsayý alýn
		//1 den kullanýcýnýn gýrdýgý sayýya kadar olan tum tamsayýlarýn 
		//toplamýný yazdýrýýn
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("lütfen  pozýtýf sayý gýrýnýz");
		int sayý=scan.nextInt();
		
		int toplam=0;
		for (int i = 1; i <=sayý; i++) {
			toplam+=i;
		
		}
		
		System.out.println(toplam);
		
		scan.close();
		
		
		
		

	}

}
