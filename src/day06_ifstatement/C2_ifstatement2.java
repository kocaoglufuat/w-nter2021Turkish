package day06_ifstatement;

import java.util.Scanner;

public class C2_ifstatement2 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam say� g�r�n�z");
		int say� = scan.nextInt();
		
		 if(say�%2==0) {
			 System.out.println("g�rd�g�n�z say� c�ft say�d�r");
		 }
		if(say�%2==1) {
		 System.out.println("g�rd�g�n�z say� tek say�d�r");
		}
		System.out.println(say�&2);
		
		System.out.println("kat�ld�g�n�z �c�n tesekkur eder�z");
		
		
		
		
		scan.close();
		
		
		
		
	}

}
