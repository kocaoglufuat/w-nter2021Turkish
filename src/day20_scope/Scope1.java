package day20_scope;

import java.util.Scanner;

public class Scope1 {
	public int sayý;// classýn ýcýnde fakat maýn method'un dýsýnda olusturulan
public	String isim = "fettah"; // ve static olmayan verýable'lara INSTANCE (Object) verýable denýr.
	public String soyisim; // class level'da olusturuldugu ýcýn classýn her yerýnden belli sartlarda
					// kullanýlabýlýr.
					//

	public static void main(String[] args) {
		// System.out.println('sayý'); //static olmayan býr verýable'a static method
		// ulasamayýz
		// main method'umuz statýc oldugu ýcýn maýn method ýcerýsýnden
		// method(); //static olmayan varýable veya methodlara dýrek ulasamayýz
		// instance býr varýable maýn method ýcerýsýnden ulasmak ýstedýgýmýzde
		// OBJECT olusturmalýyýz
		Scanner scan = new Scanner(System.in);// bu javadaký standart obje olusturma formudur
		// class ýsmý //obje ýsmý //obje olusturmada keyword
		Scope1 obje1 = new Scope1();
		System.out.println(obje1.sayý);// buna deger atamadýk java default deger atadý=0
		System.out.println(obje1.isim);//
		System.out.println(obje1.soyisim);// buna deger atamadýk java defult olarak null atadý STring oldugu ýcýn
		// instance verýable'lar olusturuldugunda býz ýstersek deger atayabýlýrýz
		// Instance verýable'lara eger býz deger atamazsak java default deger atar

		Scope1 obje2 = new Scope1();
		obje2.isim = "muslum";
		obje2.soyisim = "baba";
		System.out.println(obje2.isim + " " + obje2.soyisim);// muslum baba
		System.out.println(obje1.isim + " " + obje1.soyisim);// muslum null
		Scope1 obje3 = new Scope1();
		obje3.isim = "ferdi";
		obje3.soyisim = "tayfur";
		System.out.println(obje1.isim + " " + obje2.isim + " " + obje3.isim + " " + obje3.soyisim);
		scan.close();
	}

	public static void staticMethod() {

	}

	public void method() {
		System.out.println(sayý); // bu method statýc olmadýgý ýcýn ýnstance verýable'lara dýrek erýsebýlýr
		sayý = sayý + 20; // ve bu method ýcerýsýnde gecerlý olmak uzere degerýný degýstýrebýlýr
	}
}
