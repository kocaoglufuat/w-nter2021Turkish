package day06_ifstatement;

import java.util.Scanner;

public class C5_Ifstatement5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" l�tfen  d�kdortgen�n �k� kenar� giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
	
		if(kenar1 == kenar2) {
			System.out.println("kare");
		}
		
		if(kenar1 != kenar2) {
			System.out.println("d�ktortgen");
		}
		
		if(kenar1<=0 || kenar2 <=0) {
			System.out.println("l�tfen gecerl� uzunluk g�r�n�z");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
