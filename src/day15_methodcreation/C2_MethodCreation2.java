package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu 
		 * sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		 * Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse
		 *  �Cok sayi girdiniz, ben toplayamam� yazdirin.
		 *2'den kucuk b�r say� g�rerse "en az 2say� g�rmel�s�n�z."
		 */
      Scanner scan= new Scanner(System.in);
	System.out.println("lutfen kac say� toplamak �sted�g�n� g�r�n�z");
    int adet=scan.nextInt(); 
	if (adet<2) {
		System.out.println("en az 2 say� g�rmel�s�n�z");
	} else if(adet==2){

		�k�Say�Topla();
	 
	}else if(adet==3) {
	
		ucsSay�TOPLA();
	
	}else if(adet==4) {
	
		dortSay�Topla();
	
	}else {
		System.out.println("cok say� g�rd�n�z,toplayamam");
	}
	
  }

	public static void dortSay�Topla() {
		 Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen 4 say� g�r�n�z");
	double say�1=scan.nextDouble();
	double say�2=scan.nextDouble();
	double say�3=scan.nextDouble();
	double say�4=scan.nextDouble();
	System.out.println("dort say�n�n toplam� =" + (say�1+say�2+say�3+say�4));
	scan.close();
	}

	public static void ucsSay�TOPLA() {
		 Scanner scan= new Scanner(System.in);
			System.out.println("l�tfen 3 say� g�r�n�z");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		
		System.out.println("uc say�n�n toplam� =" + (say�1+say�2+say�3));
		scan.close();
		
	}

	public static void �k�Say�Topla() {
		 Scanner scan= new Scanner(System.in);
			System.out.println("l�tfen 4 say� g�r�n�z");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		
		System.out.println("�k� say�n�n toplam� =" + (say�1+say�2));
		scan.close();
		
	}

}
