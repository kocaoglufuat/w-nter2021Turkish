package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen isminizi giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("basharf�n�z : "+ ilkHarf);
		
	
		scan.close();
		
		
	}

}
