package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System. in);
		
		System.out.println("Karenin b�r kenar uzunlugunu girin");
		
		double kenar =scan.nextDouble();
		
		System.out.println(kenar*kenar);
		
		scan.close();
		
		
	}

}
