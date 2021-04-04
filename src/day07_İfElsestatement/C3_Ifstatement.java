package day07_ÝfElsestatement;

import java.util.Scanner;

public class C3_Ifstatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen býr tamsayý gýrýnýz");
		int sayý= scan.nextInt();
		
		if (sayý>0) {
			System.out.println("sayý pozitif");
		}
	   
		if (sayý<100) {
			System.out.println("kucuk sayý");
		}
	
		if (sayý>1000) {
			System.out.println("buyuk sayý");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
