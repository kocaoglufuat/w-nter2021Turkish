package day07_�fElsestatement;

import java.util.Scanner;

public class C3_Ifstatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen b�r tamsay� g�r�n�z");
		int say�= scan.nextInt();
		
		if (say�>0) {
			System.out.println("say� pozitif");
		}
	   
		if (say�<100) {
			System.out.println("kucuk say�");
		}
	
		if (say�>1000) {
			System.out.println("buyuk say�");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
