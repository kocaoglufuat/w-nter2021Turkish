package day33encapsulatýon;

import day20_scope.Scope1;

public class Encapsulatýon01 {

	public static void main(String[] args) {
		// OOP CONCEPT
		// OBJECT ORIENTED PROGRAMING
		// BIR PROJE KAPSAMINDAKI CLASS,LARDA OLUSTURULAN CARIABLE VE METHOD'LARIN
		// BASKA CLASS'LARDA TEKRAR TEKRAR YAZILMAMASI,VAR OLDUGU CLASS'DAN OBJE
		// URETEREK
		// BU VARIABLE VE METHOD'LARIN ISTENDIGI KADAR KULLANILMASIDIR(REUSABÝLÝTY)
		// WRÝTE ONCE REUSE ANYWHERE

		// SCOPE6 CLASS'INDAKI VARIABLE VE METHODLARA UKASMAK ISTIYORUM
		// BUNUN ICIN SCOPE6 CLASS'INDAN OBJE URETMELIYIZ

		// public int num1; // access modifier public yapilinca heryerden ulasilabilir
		// String name = "Ali"; // access modifier yazilmadigi icin default access
		// modifier gecerlidir
		// sadece paket icinde

		
		//deneme() method'unu maýn method ýcýnden cagýrabýlýrmýyým?
		//deneme() method'u statýc olmadýgý ýcýn maýn method'dan dýrek cagrýlmaz
		//bunun yerýne ýcýnde oldugumuz class'dan býr obje uretýp onun uzerýnden
		//static olmayan method'larý da cagýrabýlýrýz
		Encapsulatýon01 obj3= new Encapsulatýon01 ();
		obj3.deneme();
		
		
		
		
		
		
		
		
	}

	public void deneme() {
		//projemiz kapsamýnda bulunan tum classlardan 
		//public varýable ve method'lara ýstedýgým yerden obje ureterek ulasabýlýrým
		//eger ulasmak ýstedýgým class uyelerý (class member) public degýlse baska 
		// package'lerden ulasmak ýcýn ekstra ýslem yapmamýz gerekýr
		Scope1 obj2 = new Scope1();
		obj2.isim = "ahmet";
		obj2.soyisim = "kocaoglu";
		obj2.sayý=20;
		obj2.method();
	
		// ben ýstedýgým class'dan obje uretýp oradaký public class uyelerine ulasabýlýrým..
		
	}
}
