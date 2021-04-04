package day07_ÝfElsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yasýnýzý gýrýnýz");
		int yas=scan.nextInt();
		if (yas>=65) {
			System.out.println("emeklý olabýlýrsýn");
		} else {
            System.out.println("emeklý olamazsýn");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}
