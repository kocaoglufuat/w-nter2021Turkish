package day10switchCase;

import java.util.Scanner;

public class C3SwitchCase3 {

	public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.println("lutfen hang� gunde oldugunuzu g�r�n�z");
		String gun =scan.next().toLowerCase();
		switch (gun) {
		case "pazartes�":
		case "sal�":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta �c�");
			break;
		case "cumartes�":
			System.out.println("hafta sonu");
			break;
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("lutfen gecerl� gun g�r�n�z");
			
			
			
			
			scan.close();
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
