package ornekcozumler;

import java.util.Scanner;

public class Soru21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen býr sayý gýrýnýz");
	int a =scan.nextInt();
	tersPiramit(a);
	scan.close();
	}

	private static void tersPiramit(int n) {
	for (int i = n; i >=1 ; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j + " ");
		}
	System.out.println();
	}
		
	}

}
