package day16_Forloop;

import java.util.Scanner;

public class C2_Forloop2 {

	public static void main(String[] args) {

		// kullan�c�dan 2 tam say� al�n
		// �lk say�dan �k�nc� say�ya kadar tum tamsay�lar�
		// yan yana aralar�nda bosluk olarak yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 2 poz�t�f say� g�r�n�z");

		int say�1 = scan.nextInt();
		int say�2 = scan.nextInt();
		if (say�1 > say�2) {
			for (int i = say�1; i >= say�2; i++) {
				System.out.println(i + " ");
			}

		} else {
			for (int i = say�1; i <= say�2; i++) {
				System.out.print(i + " ");
			}
		}
scan.close();
	}

}
