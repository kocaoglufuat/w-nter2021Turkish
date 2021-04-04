package day16_Forloop;

import java.util.Scanner;

public class C1_Forloop1 {

	public static void main(String[] args) {

		// kullanýcýdan pozitif 2 tam sayý alýn
		// aldýgýmýz degerlerden kucuk olandan baslayýp,buyuk olana kadar
		// tum sayýlarý yanyana(virgülle ayrýlarak) yazdýrýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 2 pozýtýf sayý gýrýnýz");
		int sayý1 = scan.nextInt();
		int sayý2 = scan.nextInt();
		int kucukSayý = 0;
		int buyukSayý = 0;

		if (sayý1 < 0 || sayý2 < 0) {
			System.out.println("lütfen pozýtýf tam sayý gýrýnýz");
		} else if (sayý1 > sayý2) {
			buyukSayý = sayý1;
			kucukSayý = sayý2;
		} else {
			buyukSayý = sayý2;
			kucukSayý = sayý1;
		}

		for (int i = kucukSayý; i<= buyukSayý; i++) {
			System.out.print(i + ",");
		}
		
		scan.close();
	}

}
