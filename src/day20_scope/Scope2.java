package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// ben farklý classlardan da scope1 classýna object olusturarak ulasabýlýrým
		
		
		Scope1 obje4= new Scope1();
System.out.println(obje4.isim);
    obje4.soyisim="can";
	obje4.isim ="ahmet";
	System.out.println(obje4.isim+" "+obje4.soyisim);
	}
}
