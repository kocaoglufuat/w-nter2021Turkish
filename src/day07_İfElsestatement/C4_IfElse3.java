package day07_�fElsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yas�n�z� g�r�n�z");
		int yas=scan.nextInt();
		if (yas>=65) {
			System.out.println("emekl� olab�l�rs�n");
		} else {
            System.out.println("emekl� olamazs�n");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
