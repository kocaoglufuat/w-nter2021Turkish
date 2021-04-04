package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileloop {

	public static void main(String[] args) {
		
		//Kullanicidan toplamak uzere pozitif sayilar isteyin,
		//islemi bitirmek icin 0’a basmasini soyleyin.
		  //Kullanici yanlislikla negative sayi girerse o
		//sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
		  //Kullanici 0’a bastiginda toplam kac pozitifsayi girdigini,
		//yanlislikla kac negative sayi girdigini ve girdigi pozitif 
		//sayilarin toplaminin kac oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int toplamPoz=0;
		int sayý=1;
		System.out.println("oyuna hosgeldýnýz, býtýrmek ýstedýgýnýzde 0 ' basýn");
		do {
			
			System.out.println("lutfen pozýtýf býr sayý gýrýnýz");
			sayý=scan.nextInt();
			if (sayý>0) {
				countPoz++;
				toplamPoz+=sayý;
			}
			if (sayý<0) {
				countPoz++;
				System.out.println("negatýf sayý gýremezsýnýz");
			}
		
		
		
		
		} while (sayý !=0);
		System.out.println("game over");
		System.out.println("toplam" + countPoz + "pozitif sayý gýrdýnýz");
		System.out.println("toplam" + countNeg + "negatif sayý gýrdýnýz");
		System.out.println("girdiginiz pozýtýf sayýlarýn toplamý :" +toplamPoz);
		
		
		scan.close();

	}

}
