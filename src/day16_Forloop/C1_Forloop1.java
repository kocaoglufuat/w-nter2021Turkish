package day16_Forloop;

import java.util.Scanner;

public class C1_Forloop1 {

	public static void main(String[] args) {

		// kullan�c�dan pozitif 2 tam say� al�n
		// ald�g�m�z degerlerden kucuk olandan baslay�p,buyuk olana kadar
		// tum say�lar� yanyana(virg�lle ayr�larak) yazd�r�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 2 poz�t�f say� g�r�n�z");
		int say�1 = scan.nextInt();
		int say�2 = scan.nextInt();
		int kucukSay� = 0;
		int buyukSay� = 0;

		if (say�1 < 0 || say�2 < 0) {
			System.out.println("l�tfen poz�t�f tam say� g�r�n�z");
		} else if (say�1 > say�2) {
			buyukSay� = say�1;
			kucukSay� = say�2;
		} else {
			buyukSay� = say�2;
			kucukSay� = say�1;
		}

		for (int i = kucukSay�; i<= buyukSay�; i++) {
			System.out.print(i + ",");
		}
		
		scan.close();
	}

}
