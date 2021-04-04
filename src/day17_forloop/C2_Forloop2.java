package day17_forloop;

import java.util.Scanner;

public class C2_Forloop2 {

	
	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * 
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen rakamlar toplamýný bulmak ýcýn býr tamsayý gýrýnýz");
      int sayý=scan.nextInt();
      System.out.println("lutfen sýnýr degerýný bulmak ýcýn býr tamsayý gýrýnýz");
      int sýnýr=scan.nextInt();
      if (sayý<=0) {
          System.out.println("Lutfen pozitif bir tamsayi giriniz");
      } else {
          if(rakamlarToplamýHesapla(sayý)>sýnýr ) {
              System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
          } else {
              System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
          }
      }
      
  }

     public static int rakamlarToplamýHesapla(int sayý) {
		int rakamlarToplamý=0;
		String sayý2=sayý+"";//Sayý1'i String'e cevýrdýk
		for (int i = 1; i < sayý2.length() ; i++) {
			rakamlarToplamý+=sayý%10;
			sayý/=10;
		}
		
		return rakamlarToplamý;
	
	}
		
}	

	


