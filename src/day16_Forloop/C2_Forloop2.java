package day16_Forloop;

import java.util.Scanner;

public class C2_Forloop2 {

	public static void main(String[] args) {

		// kullanıcıdan 2 tam sayı alın
		// ılk sayıdan ıkıncı sayıya kadar tum tamsayıları
		// yan yana aralarında bosluk olarak yazdırın

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 2 pozıtıf sayı gırınız");

		int sayı1 = scan.nextInt();
		int sayı2 = scan.nextInt();
		if (sayı1 > sayı2) {
			for (int i = sayı1; i >= sayı2; i++) {
				System.out.println(i + " ");
			}

		} else {
			for (int i = sayı1; i <= sayı2; i++) {
				System.out.print(i + " ");
			}
		}
scan.close();
	}

}
