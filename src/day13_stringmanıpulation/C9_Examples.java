package day13_stringman�pulation;

import java.util.Scanner;

public class C9_Examples {

	public static void main(String[] args) {
	
		//kullan�c�dan �sm�n� soy�sm�n� ve kred� kart� b�lg�s�n� �stey�n
		//ve asag�dak� g�b� yazd�r�n
		//isim-soy�s�m : M**** B****
		//kart no : **** **** **** 1234
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen �sm�n�z� g�r�n�z");
		String �s�m=scan.next();
		
		System.out.println("lutfen soy�sm�n�z� g�r�n�z");
		String soy�s�m = scan.next();
		System.out.println("lutfen kart numar�n�z� g�r�n�z");
		String kartno=scan.next();
		
		char �s�m�llkHarf = �s�m.toUpperCase().charAt(0);
		String �s�mGeriKalan = �s�m.substring(1).replaceAll("\\w", "*");
		String soy�s�mIlkHarf=soy�s�m.toUpperCase().substring(0, 1);
		String  soy�s�mGer�yeKalan= soy�s�m.substring(1).replaceAll("\\w", "*" );
		String kartnobas�="**** **** ****";
		String kartnosonu = kartno.substring(kartno.length()-4);
		System.out.println("isminiz ve soy isminiz :"+�s�m�llkHarf+�s�mGeriKalan+" " +" "+
		soy�s�mIlkHarf+soy�s�mGer�yeKalan);
		System.out.println("Kart no : "+ kartnobas�+kartnosonu);

	}

}
