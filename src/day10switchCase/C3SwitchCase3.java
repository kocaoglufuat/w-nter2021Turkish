package day10switchCase;

import java.util.Scanner;

public class C3SwitchCase3 {

	public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.println("lutfen hangý gunde oldugunuzu gýrýnýz");
		String gun =scan.next().toLowerCase();
		switch (gun) {
		case "pazartesý":
		case "salý":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ýcý");
			break;
		case "cumartesý":
			System.out.println("hafta sonu");
			break;
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("lutfen gecerlý gun gýrýnýz");
			
			
			
			
			scan.close();
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
