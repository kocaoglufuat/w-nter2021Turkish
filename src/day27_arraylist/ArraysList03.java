package day27_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList03 {

	public static void main(String[] args) {

		// kullanýcýdan pozýtýf býr tam sayý alýn
		// aldýgýnýz sayýdan kucuk olan fýbonaccý dizisi elemanlarýný yazdýrýn
		// 1 1 2 3 5 8 13 21 34......
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen pozitif bir tam sayý gýrýnýz");
		int sayý = scan.nextInt();

		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		System.out.println(fibo);// [1, 1]
		for (int i = 2; fibo.get(i - 2) + fibo.get(i - 1) < sayý; i++) {
			fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
			
		 }
		System.out.println(fibo);
	
	int i=2;
	int yenýSayý=0;
	while (yenýSayý<sayý) {
	yenýSayý=fibo.get(i-2)+fibo.get(i-1);
	fibo.add(yenýSayý);
	i++;
	
	}
	
	System.out.println(fibo);
	
	
	}
}
