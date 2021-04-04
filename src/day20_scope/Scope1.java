package day20_scope;

import java.util.Scanner;

public class Scope1 {
	public int say�;// class�n �c�nde fakat ma�n method'un d�s�nda olusturulan
public	String isim = "fettah"; // ve static olmayan ver�able'lara INSTANCE (Object) ver�able den�r.
	public String soyisim; // class level'da olusturuldugu �c�n class�n her yer�nden belli sartlarda
					// kullan�lab�l�r.
					//

	public static void main(String[] args) {
		// System.out.println('say�'); //static olmayan b�r ver�able'a static method
		// ulasamay�z
		// main method'umuz stat�c oldugu �c�n ma�n method �cer�s�nden
		// method(); //static olmayan var�able veya methodlara d�rek ulasamay�z
		// instance b�r var�able ma�n method �cer�s�nden ulasmak �sted�g�m�zde
		// OBJECT olusturmal�y�z
		Scanner scan = new Scanner(System.in);// bu javadak� standart obje olusturma formudur
		// class �sm� //obje �sm� //obje olusturmada keyword
		Scope1 obje1 = new Scope1();
		System.out.println(obje1.say�);// buna deger atamad�k java default deger atad�=0
		System.out.println(obje1.isim);//
		System.out.println(obje1.soyisim);// buna deger atamad�k java defult olarak null atad� STring oldugu �c�n
		// instance ver�able'lar olusturuldugunda b�z �stersek deger atayab�l�r�z
		// Instance ver�able'lara eger b�z deger atamazsak java default deger atar

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
		System.out.println(say�); // bu method stat�c olmad�g� �c�n �nstance ver�able'lara d�rek er�seb�l�r
		say� = say� + 20; // ve bu method �cer�s�nde gecerl� olmak uzere deger�n� deg�st�reb�l�r
	}
}
