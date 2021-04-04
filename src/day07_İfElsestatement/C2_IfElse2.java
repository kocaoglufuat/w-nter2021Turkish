package day07_İfElsestatement;

import java.util.Scanner;

public class C2_IfElse2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen karakter gırınız");
		char karakter=scan.next().toUpperCase().charAt(0);
		if (karakter >'a' && karakter <='z'|| (karakter >='A' && karakter<='Z')){
			System.out.println("gırdıgınız karakter harf");
		} 
		else {
            System.out.println("gırdıgınız karakter harf degıl");
		}
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
