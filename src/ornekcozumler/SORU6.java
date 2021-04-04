package ornekcozumler;

import java.util.Scanner;

public class SORU6 {

	public static void main(String[] args) {
		//kullanýcýdan ýsmýný soyýsmýný ve kredý kartý býlgýsýný ýsteyýn
		//ve asagýdaký gýbý yazdýrýn
		//isim-soyýsým : M**** B****
		//kart no : **** **** **** 1234
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen ýsmýnýzý gýrýnýz");
	String ýsým=scan.next();
	System.out.println("lutfen soyýsmýnýzý gýrýnýz");
	String soyýsým=scan.next();
	System.out.println("lutfen kartnosunu gýrýnýz");
	String kartno=scan.next();
	char ýsmýnIlkHarfý=ýsým.toUpperCase().charAt(0);
	String ýsmýndenGerýyekalan=ýsým.substring(1).replaceAll("\\w", "*");
	String soyýsmýnIlkHarfý=soyýsým.toUpperCase().substring(0, 1);
	String soyýsýmdenGerýyeKalan=soyýsým.substring(1).replaceAll("\\w", "*");
	String kartnobasý="2587 **** ****";
	String kartnosonu=kartno.substring(kartno.length()-4);
	System.out.println( "ýsmýnýz ve soyýsmýnýz : "+ ýsmýnIlkHarfý+ýsmýndenGerýyekalan+soyýsmýnIlkHarfý+soyýsýmdenGerýyeKalan+kartnobasý+ kartnosonu);
	System.out.println("kart býlgýsý:"+kartnobasý+kartnosonu);
	}
	

}
