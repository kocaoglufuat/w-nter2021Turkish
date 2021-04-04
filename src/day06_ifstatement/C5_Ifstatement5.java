package day06_ifstatement;

import java.util.Scanner;

public class C5_Ifstatement5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" lütfen  dýkdortgenýn ýký kenarý giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
	
		if(kenar1 == kenar2) {
			System.out.println("kare");
		}
		
		if(kenar1 != kenar2) {
			System.out.println("dýktortgen");
		}
		
		if(kenar1<=0 || kenar2 <=0) {
			System.out.println("lütfen gecerlý uzunluk gýrýnýz");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
