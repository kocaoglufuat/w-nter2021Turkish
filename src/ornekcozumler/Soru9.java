package ornekcozumler;

import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen uc basamakl� say� g�r�n�z");
		int say� = scan.nextInt();
		int yuzler = say�/100, onlar= say�/10%10, birler = say�%10;
		
		
		if (say� > 99 && say� < 1000) {
			System.out.println("girdiginiz say�n�n b�rler basamag� :"+birler);
			System.out.println("girdiginiz say�n�n onlar basamag� :"+onlar);
			System.out.println("girdiginiz say�n�n yuzler basamag� :"+yuzler);
		}
		else {
			System.out.println("lutfen 3 basamakl� b�r say� g�r�n�z");
		

		}
		}
}
