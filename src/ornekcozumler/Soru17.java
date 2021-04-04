package ornekcozumler;

import java.util.Scanner;

public class Soru17 {

	/*
	 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar 
	 * return eden metod yaziniz
	 * 
	 * ornek 
	 * input  elma  2
	 *        army  3
	 * 
	 * output  eaea
	 *         ayayay
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen býr string gýrýnýz");
	String input = scan.nextLine();
	System.out.println("lütfen býr sayý gýrýnýz");
	int sayý= scan.nextInt();
	IlkSonHarf(input,sayý);
	System.out.println(IlkSonHarf(input,sayý));
	scan.close();
	}

	
		
	

	public static String IlkSonHarf(String str, int n) {
		String s = str.substring(0, 1) + str.substring(str.length() - 1);

		String b = "";
		
		for (int i = 0; i <=n; i++) {
			b=b+s;
		}
		
		
		return b;
	}
}
