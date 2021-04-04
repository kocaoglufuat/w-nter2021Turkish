package day09Ternary;

import java.util.Scanner;

public class C8Ternary2 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen býr sayý gýrýnýz");
		int sayý = scan.nextInt();
		String sonuc = sayý%2==0 ? "cift" : sayý*sayý+"";
		System.out.println(sonuc);
		
		
		scan.close();
		
		
		
		
		
		
	}

}
