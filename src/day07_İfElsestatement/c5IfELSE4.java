package day07_�fElsestatement;

import java.util.Scanner;

public class c5IfELSE4 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ucgen�n kenar uzunluklar�n� al�n�z");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
	    
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
            System.out.println("eskanar deg�l");
		}
		
		
scan.close(); 
	}

}
