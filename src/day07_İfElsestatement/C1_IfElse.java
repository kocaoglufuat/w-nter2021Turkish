package day07_�fElsestatement;

import java.util.Scanner;

public class C1_IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen d�kdortgen�n kenar uzunluklar�n� g�r�n�z");
		double kenar1 =scan.nextDouble();
		double kenar2 =scan.nextDouble();
			
		
		if (kenar1==kenar2) {
			System.out.println("kare");
		} else {
           System.out.println("kare deg�l");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
