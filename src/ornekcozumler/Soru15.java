package ornekcozumler;

import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.println("lütfen býr strýng gýrýnýz");
	String yazý=scan.nextLine();
	sumOfDýgýt(yazý);
	scan.close();
	}

	public static void sumOfDýgýt(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum+=Integer.valueOf(""+str.charAt(i));
			
			}

	}
		System.out.println("girilen string deký sayýlarýn toplamý " + sum);	
	}

}