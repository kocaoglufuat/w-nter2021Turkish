package day33encapsulat�on;

import day20_scope.Scope1;

public class Encapsulat�on01 {

	public static void main(String[] args) {
		// OOP CONCEPT
		// OBJECT ORIENTED PROGRAMING
		// BIR PROJE KAPSAMINDAKI CLASS,LARDA OLUSTURULAN CARIABLE VE METHOD'LARIN
		// BASKA CLASS'LARDA TEKRAR TEKRAR YAZILMAMASI,VAR OLDUGU CLASS'DAN OBJE
		// URETEREK
		// BU VARIABLE VE METHOD'LARIN ISTENDIGI KADAR KULLANILMASIDIR(REUSAB�L�TY)
		// WR�TE ONCE REUSE ANYWHERE

		// SCOPE6 CLASS'INDAKI VARIABLE VE METHODLARA UKASMAK ISTIYORUM
		// BUNUN ICIN SCOPE6 CLASS'INDAN OBJE URETMELIYIZ

		// public int num1; // access modifier public yapilinca heryerden ulasilabilir
		// String name = "Ali"; // access modifier yazilmadigi icin default access
		// modifier gecerlidir
		// sadece paket icinde

		
		//deneme() method'unu ma�n method �c�nden cag�rab�l�rm�y�m?
		//deneme() method'u stat�c olmad�g� �c�n ma�n method'dan d�rek cagr�lmaz
		//bunun yer�ne �c�nde oldugumuz class'dan b�r obje uret�p onun uzer�nden
		//static olmayan method'lar� da cag�rab�l�r�z
		Encapsulat�on01 obj3= new Encapsulat�on01 ();
		obj3.deneme();
		
		
		
		
		
		
		
		
	}

	public void deneme() {
		//projemiz kapsam�nda bulunan tum classlardan 
		//public var�able ve method'lara �sted�g�m yerden obje ureterek ulasab�l�r�m
		//eger ulasmak �sted�g�m class uyeler� (class member) public deg�lse baska 
		// package'lerden ulasmak �c�n ekstra �slem yapmam�z gerek�r
		Scope1 obj2 = new Scope1();
		obj2.isim = "ahmet";
		obj2.soyisim = "kocaoglu";
		obj2.say�=20;
		obj2.method();
	
		// ben �sted�g�m class'dan obje uret�p oradak� public class uyelerine ulasab�l�r�m..
		
	}
}
