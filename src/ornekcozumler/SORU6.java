package ornekcozumler;

import java.util.Scanner;

public class SORU6 {

	public static void main(String[] args) {
		//kullan�c�dan �sm�n� soy�sm�n� ve kred� kart� b�lg�s�n� �stey�n
		//ve asag�dak� g�b� yazd�r�n
		//isim-soy�s�m : M**** B****
		//kart no : **** **** **** 1234
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen �sm�n�z� g�r�n�z");
	String �s�m=scan.next();
	System.out.println("lutfen soy�sm�n�z� g�r�n�z");
	String soy�s�m=scan.next();
	System.out.println("lutfen kartnosunu g�r�n�z");
	String kartno=scan.next();
	char �sm�nIlkHarf�=�s�m.toUpperCase().charAt(0);
	String �sm�ndenGer�yekalan=�s�m.substring(1).replaceAll("\\w", "*");
	String soy�sm�nIlkHarf�=soy�s�m.toUpperCase().substring(0, 1);
	String soy�s�mdenGer�yeKalan=soy�s�m.substring(1).replaceAll("\\w", "*");
	String kartnobas�="2587 **** ****";
	String kartnosonu=kartno.substring(kartno.length()-4);
	System.out.println( "�sm�n�z ve soy�sm�n�z : "+ �sm�nIlkHarf�+�sm�ndenGer�yekalan+soy�sm�nIlkHarf�+soy�s�mdenGer�yeKalan+kartnobas�+ kartnosonu);
	System.out.println("kart b�lg�s�:"+kartnobas�+kartnosonu);
	}
	

}
