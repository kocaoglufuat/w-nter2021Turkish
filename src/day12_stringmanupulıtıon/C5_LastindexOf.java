package day12_stringmanupul�t�on;

import java.util.Scanner;

public class C5_LastindexOf {

	public static void main(String[] args) {


		//kullan�c�dan b�r cumle al�n
		//ve asag�dak� uc durumdan uygun olan� yazd�r�n
		//1-cumle java �cmerm�yor
		//2-cumle java b�r tane java �cer�yor
		//3-cumlede b�rden fazla java var.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfe cumle g�r�n�z");
		String cumle=scan.nextLine().toLowerCase();
	
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		if (ilkJava==-1) {
			System.out.println("cumle java �cmerm�yor");
		} else if(ilkJava==sonJava){
            System.out.println("cumle b�r tane java �cer�yor");
		}else {
			System.out.println("cumle 1 den fazla java �cer�yor");
	}
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
