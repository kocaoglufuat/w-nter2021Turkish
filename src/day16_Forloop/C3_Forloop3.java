package day16_Forloop;

import java.util.Scanner;

public class C3_Forloop3 {

	public static void main(String[] args) {
		
		//kullan�c�dan poz�t�f b�r tamsay� al�n
		//1 den kullan�c�n�n g�rd�g� say�ya kadar olan tum tamsay�lar�n 
		//toplam�n� yazd�r��n
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen  poz�t�f say� g�r�n�z");
		int say�=scan.nextInt();
		
		int toplam=0;
		for (int i = 1; i <=say�; i++) {
			toplam+=i;
		
		}
		
		System.out.println(toplam);
		
		scan.close();
		
		
		
		

	}

}
