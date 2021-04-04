package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForloop {

	public static void main(String[] args) {
		/*
		soru 13) kullanýcýdan pozýtýf býr rakam gýrmesýný ýsteyýn ve gýrýlen
        rakama gore carpým tablosunu olusturun.ornek,kullanýcý 3 gýrerse,
		1 2 3
		2 4 6
		3 6 9
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen carpým tablosu ýcýn býr rakam gýrýnýz");
		int rakam=scan.nextInt();
		
		for (int i = 1; i<=rakam; i++) {
			System.out.println("");
			for (int j = 1; j <= rakam; j++) {
				System.out.print(i*j+" ");
			}
		}
		
		scan.close();
		
	}

}
