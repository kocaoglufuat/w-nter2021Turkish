package day07_ÝfElsestatement;

import java.util.Scanner;

public class C1_IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen dýkdortgenýn kenar uzunluklarýný gýrýnýz");
		double kenar1 =scan.nextDouble();
		double kenar2 =scan.nextDouble();
			
		
		if (kenar1==kenar2) {
			System.out.println("kare");
		} else {
           System.out.println("kare degýl");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
