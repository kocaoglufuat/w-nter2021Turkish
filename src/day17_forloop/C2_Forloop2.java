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
		System.out.println("lutfen rakamlar toplam�n� bulmak �c�n b�r tamsay� g�r�n�z");
      int say�=scan.nextInt();
      System.out.println("lutfen s�n�r deger�n� bulmak �c�n b�r tamsay� g�r�n�z");
      int s�n�r=scan.nextInt();
      if (say�<=0) {
          System.out.println("Lutfen pozitif bir tamsayi giriniz");
      } else {
          if(rakamlarToplam�Hesapla(say�)>s�n�r ) {
              System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
          } else {
              System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
          }
      }
      
  }

     public static int rakamlarToplam�Hesapla(int say�) {
		int rakamlarToplam�=0;
		String say�2=say�+"";//Say�1'i String'e cev�rd�k
		for (int i = 1; i < say�2.length() ; i++) {
			rakamlarToplam�+=say�%10;
			say�/=10;
		}
		
		return rakamlarToplam�;
	
	}
		
}	

	


