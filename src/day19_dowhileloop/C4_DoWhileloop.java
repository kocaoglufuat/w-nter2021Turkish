package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileloop {

	public static void main(String[] args) {
		
		//Kullanicidan toplamak uzere pozitif sayilar isteyin,
		//islemi bitirmek icin 0�a basmasini soyleyin.
		  //Kullanici yanlislikla negative sayi girerse o
		//sayiyi dikkate almayin ve �Negatif sayi giremezsiniz� yazdirip basa donun
		  //Kullanici 0�a bastiginda toplam kac pozitifsayi girdigini,
		//yanlislikla kac negative sayi girdigini ve girdigi pozitif 
		//sayilarin toplaminin kac oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int say�=1;
		System.out.println("oyuna hosgeld�n�z, b�t�rmek �sted�g�n�zde 0 ' bas�n");
		do {
			
			System.out.println("lutfen poz�t�f b�r say� g�r�n�z");
			say�=scan.nextInt();
			if (say�>0) {
				countPoz++;
				toplamPoz+=say�;
			}
			if (say�<0) {
				countPoz++;
				System.out.println("negat�f say� g�remezs�n�z");
			}
		
		
		
		
		} while (say� !=0);
		System.out.println("game over");
		System.out.println("toplam" + countPoz + "pozitif say� g�rd�n�z");
		System.out.println("toplam" + countNeg + "negatif say� g�rd�n�z");
		System.out.println("girdiginiz poz�t�f say�lar�n toplam� :" +toplamPoz);
		
		
		scan.close();

	}

}
