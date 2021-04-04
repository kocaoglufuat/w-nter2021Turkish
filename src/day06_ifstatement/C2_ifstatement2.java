package day06_ifstatement;

import java.util.Scanner;

public class C2_ifstatement2 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam sayý gýrýnýz");
		int sayý = scan.nextInt();
		
		 if(sayý%2==0) {
			 System.out.println("gýrdýgýnýz sayý cýft sayýdýr");
		 }
		if(sayý%2==1) {
		 System.out.println("gýrdýgýnýz sayý tek sayýdýr");
		}
		System.out.println(sayý&2);
		
		System.out.println("katýldýgýnýz ýcýn tesekkur ederýz");
		
		
		
		
		scan.close();
		
		
		
		
	}

}
