package day17_forloop;

import java.util.Scanner;

public class C3_Forloop3 {

	public static void main(String[] args) {

        //kullan�c�dan 40'dan kucuk b�r poz�t�f say� al�n g�r�len
		//say�n�n faktor�yel�n� hesaplay�p yazd�ran b�r method olusturun
        // 6 ! = 1 * 2 * 3 * 4 * 5 * 6 =720
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen faktor�yel hesaplamak �c�n  35den kucuk b�r tamsay� g�r�n�z");
		int say�=scan.nextInt();
		
	if (say�<=0 || say�>=35) {
		System.out.println("l�tfen gecerl� b�r say� g�r�n�z");
	} else {
		faktor�yelBul(say�); //5
	}
		
		
	}

	public static void faktor�yelBul(int say�) {
	long faktor�yel=1;
		for (int i = 1; i <=say�; i++) {
		faktor�yel*=i;
	}	
		System.out.println(faktor�yel);

	}
}
