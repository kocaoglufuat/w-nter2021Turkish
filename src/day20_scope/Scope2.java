package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// ben farkl� classlardan da scope1 class�na object olusturarak ulasab�l�r�m
		
		
		Scope1 obje4= new Scope1();
System.out.println(obje4.isim);
    obje4.soyisim="can";
	obje4.isim ="ahmet";
	System.out.println(obje4.isim+" "+obje4.soyisim);
	}
}
