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
		System.out.println("l�tfen b�r string g�r�n�z");
	String input = scan.nextLine();
	System.out.println("l�tfen b�r say� g�r�n�z");
	int say�= scan.nextInt();
	IlkSonHarf(input,say�);
	System.out.println(IlkSonHarf(input,say�));
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
