package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) {// ýstersek constructor'ý parametrelý olarak olusturabýlýrýz

	}

	// býz býr constructor olusturdugumuzda java default olaný yok eder
	// dolaysýyla býz býr constructor olusturdugumuzda mutlaka default
	// constructur'ýn yerýnede
	// býr constructor yazmalýyýz
	public Otomobil() {

	}
    // ONEMLI NOT: default constructor dan baska  bir constructor yazdýgýmýzda
	// java default olaný yok ettýgý ýcýn MUTLAKA býz default yerýnede constructor
	// yazmalýyýz

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public void yakýt(String yakýt) {
		System.out.println("araba yakýt olarak" + yakýt + "kullanýr");
	}

	public void vites(String vites) {
		System.out.println("araba" + " " + vites + " " + "viteslidir");
	}

}
