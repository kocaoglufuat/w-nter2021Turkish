package day07_ÝfElsestatement;

import java.util.Scanner;

public class c5IfELSE4 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ucgenýn kenar uzunluklarýný alýnýz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
	    
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
            System.out.println("eskanar degýl");
		}
		
		
scan.close(); 
	}

}
