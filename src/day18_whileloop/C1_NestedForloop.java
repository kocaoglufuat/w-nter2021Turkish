package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForloop {

	public static void main(String[] args) {
		/*
		soru 13) kullan�c�dan poz�t�f b�r rakam g�rmes�n� �stey�n ve g�r�len
        rakama gore carp�m tablosunu olusturun.ornek,kullan�c� 3 g�rerse,
		1 2 3
		2 4 6
		3 6 9
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen carp�m tablosu �c�n b�r rakam g�r�n�z");
		int rakam=scan.nextInt();
		
		for (int i = 1; i<=rakam; i++) {
			System.out.println("");
			for (int j = 1; j <= rakam; j++) {
				System.out.print(i*j+" ");
			}
		}
		
		scan.close();
		
	}

}
