package day09Ternary;

import java.util.Scanner;

public class C8Ternary2 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen b�r say� g�r�n�z");
		int say� = scan.nextInt();
		String sonuc = say�%2==0 ? "cift" : say�*say�+"";
		System.out.println(sonuc);
		
		
		scan.close();
		
		
		
		
		
		
	}

}
