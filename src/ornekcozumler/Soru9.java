package ornekcozumler;

import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen uc basamaklı sayı gırınız");
		int sayı = scan.nextInt();
		int yuzler = sayı/100, onlar= sayı/10%10, birler = sayı%10;
		
		
		if (sayı > 99 && sayı < 1000) {
			System.out.println("girdiginiz sayının bırler basamagı :"+birler);
			System.out.println("girdiginiz sayının onlar basamagı :"+onlar);
			System.out.println("girdiginiz sayının yuzler basamagı :"+yuzler);
		}
		else {
			System.out.println("lutfen 3 basamaklı bır sayı gırınız");
		

		}
		}
}
