package day16_Forloop;

import java.util.Scanner;

public class C6_Forloop6 {

	public static void main(String[] args) {
		// soru8) Interv�ew quest�on kullan�c�dan b�r string �stey�n ve
		// stringi ters�ne cev�ren b�r program yaz�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ters�ne cev�rmek �c�n b�r yaz� g�r�n�z");
		String yaz� = scan.nextLine();
		String tersyaz� = "";
		for (int i = yaz�.length()-1; i >= 0; i--) {

			tersyaz� += yaz�.charAt(i);
		}
		System.out.print("g�rd�g�n�z yaz�n�n tersten yaz�l�s� : "  +tersyaz�);

	

	}


}