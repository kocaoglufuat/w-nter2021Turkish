package day27_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList03 {

	public static void main(String[] args) {

		// kullan�c�dan poz�t�f b�r tam say� al�n
		// ald�g�n�z say�dan kucuk olan f�bonacc� dizisi elemanlar�n� yazd�r�n
		// 1 1 2 3 5 8 13 21 34......
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen pozitif bir tam say� g�r�n�z");
		int say� = scan.nextInt();

		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		System.out.println(fibo);// [1, 1]
		for (int i = 2; fibo.get(i - 2) + fibo.get(i - 1) < say�; i++) {
			fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
			
		 }
		System.out.println(fibo);
	
	int i=2;
	int yen�Say�=0;
	while (yen�Say�<say�) {
	yen�Say�=fibo.get(i-2)+fibo.get(i-1);
	fibo.add(yen�Say�);
	i++;
	
	}
	
	System.out.println(fibo);
	
	
	}
}
