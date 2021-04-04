package day17_forloop;

import java.util.Scanner;

public class C3_Forloop3 {

	public static void main(String[] args) {

        //kullanýcýdan 40'dan kucuk býr pozýtýf sayý alýn gýrýlen
		//sayýnýn faktorýyelýný hesaplayýp yazdýran býr method olusturun
        // 6 ! = 1 * 2 * 3 * 4 * 5 * 6 =720
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen faktorýyel hesaplamak ýcýn  35den kucuk býr tamsayý gýrýnýz");
		int sayý=scan.nextInt();
		
	if (sayý<=0 || sayý>=35) {
		System.out.println("lütfen gecerlý býr sayý gýrýnýz");
	} else {
		faktorýyelBul(sayý); //5
	}
		
		
	}

	public static void faktorýyelBul(int sayý) {
	long faktorýyel=1;
		for (int i = 1; i <=sayý; i++) {
		faktorýyel*=i;
	}	
		System.out.println(faktorýyel);

	}
}
