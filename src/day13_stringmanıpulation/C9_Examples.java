package day13_stringmanýpulation;

import java.util.Scanner;

public class C9_Examples {

	public static void main(String[] args) {
	
		//kullanýcýdan ýsmýný soyýsmýný ve kredý kartý býlgýsýný ýsteyýn
		//ve asagýdaký gýbý yazdýrýn
		//isim-soyýsým : M**** B****
		//kart no : **** **** **** 1234
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ýsmýnýzý gýrýnýz");
		String ýsým=scan.next();
		
		System.out.println("lutfen soyýsmýnýzý gýrýnýz");
		String soyýsým = scan.next();
		System.out.println("lutfen kart numarýnýzý gýrýnýz");
		String kartno=scan.next();
		
		char ýsýmýllkHarf = ýsým.toUpperCase().charAt(0);
		String ýsýmGeriKalan = ýsým.substring(1).replaceAll("\\w", "*");
		String soyýsýmIlkHarf=soyýsým.toUpperCase().substring(0, 1);
		String  soyýsýmGerýyeKalan= soyýsým.substring(1).replaceAll("\\w", "*" );
		String kartnobasý="**** **** ****";
		String kartnosonu = kartno.substring(kartno.length()-4);
		System.out.println("isminiz ve soy isminiz :"+ýsýmýllkHarf+ýsýmGeriKalan+" " +" "+
		soyýsýmIlkHarf+soyýsýmGerýyeKalan);
		System.out.println("Kart no : "+ kartnobasý+kartnosonu);

	}

}
