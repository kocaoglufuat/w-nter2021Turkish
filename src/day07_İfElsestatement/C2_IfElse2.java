package day07_�fElsestatement;

import java.util.Scanner;

public class C2_IfElse2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen karakter g�r�n�z");
		char karakter=scan.next().toUpperCase().charAt(0);
		if (karakter >'a' && karakter <='z'|| (karakter >='A' && karakter<='Z')){
			System.out.println("g�rd�g�n�z karakter harf");
		} 
		else {
            System.out.println("g�rd�g�n�z karakter harf deg�l");
		}
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
