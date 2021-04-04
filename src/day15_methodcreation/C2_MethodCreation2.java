package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu 
		 * sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		 * Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 *  “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 *2'den kucuk býr sayý gýrerse "en az 2sayý gýrmelýsýnýz."
		 */
      Scanner scan= new Scanner(System.in);
	System.out.println("lutfen kac sayý toplamak ýstedýgýný gýrýnýz");
    int adet=scan.nextInt(); 
	if (adet<2) {
		System.out.println("en az 2 sayý gýrmelýsýnýz");
	} else if(adet==2){

		ýkýSayýTopla();
	 
	}else if(adet==3) {
	
		ucsSayýTOPLA();
	
	}else if(adet==4) {
	
		dortSayýTopla();
	
	}else {
		System.out.println("cok sayý gýrdýnýz,toplayamam");
	}
	
  }

	public static void dortSayýTopla() {
		 Scanner scan= new Scanner(System.in);
		System.out.println("lütfen 4 sayý gýrýnýz");
	double sayý1=scan.nextDouble();
	double sayý2=scan.nextDouble();
	double sayý3=scan.nextDouble();
	double sayý4=scan.nextDouble();
	System.out.println("dort sayýnýn toplamý =" + (sayý1+sayý2+sayý3+sayý4));
	scan.close();
	}

	public static void ucsSayýTOPLA() {
		 Scanner scan= new Scanner(System.in);
			System.out.println("lütfen 3 sayý gýrýnýz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		
		System.out.println("uc sayýnýn toplamý =" + (sayý1+sayý2+sayý3));
		scan.close();
		
	}

	public static void ýkýSayýTopla() {
		 Scanner scan= new Scanner(System.in);
			System.out.println("lütfen 4 sayý gýrýnýz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		
		System.out.println("ýký sayýnýn toplamý =" + (sayý1+sayý2));
		scan.close();
		
	}

}
