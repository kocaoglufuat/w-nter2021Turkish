package ornekcozumler;

import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.println("l�tfen b�r str�ng g�r�n�z");
	String yaz�=scan.nextLine();
	sumOfD�g�t(yaz�);
	scan.close();
	}

	public static void sumOfD�g�t(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum+=Integer.valueOf(""+str.charAt(i));
			
			}

	}
		System.out.println("girilen string dek� say�lar�n toplam� " + sum);	
	}

}