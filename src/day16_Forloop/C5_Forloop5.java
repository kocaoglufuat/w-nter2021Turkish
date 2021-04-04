package day16_Forloop;

import java.util.Scanner;

public class C5_Forloop5 {

	public static void main(String[] args) {

		// interview question Kullanýcýdan 100'den kucuk býr tamsayý ýsteyýn
		// sayý 3'un katý ýse sayý yerýne "java" yazdýrýn
		// sayý 5'in katý ýse sayý yerýne "guzeldýr" yazdýrýn.
		// sayý hem 3'un hem 5'ýn katý ýse sayý yerýne "java guzeldýr" yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 100'den kucuk býr tamsayý gýrýnýz");
		int sayý = scan.nextInt();

		for (int i = 0; i <= sayý; i++) {
			if (i % 15 == 0) {
				System.out.println("java guzeldýr"+" ");
			} else if (i % 5 == 0) {
				System.out.print("guzeldýr"+" ");
			} else if (i % 3 == 0) {
				System.out.print("java"+ " ");
			} else {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
