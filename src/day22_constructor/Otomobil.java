package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) {// �stersek constructor'� parametrel� olarak olusturab�l�r�z

	}

	// b�z b�r constructor olusturdugumuzda java default olan� yok eder
	// dolays�yla b�z b�r constructor olusturdugumuzda mutlaka default
	// constructur'�n yer�nede
	// b�r constructor yazmal�y�z
	public Otomobil() {

	}
    // ONEMLI NOT: default constructor dan baska  bir constructor yazd�g�m�zda
	// java default olan� yok ett�g� �c�n MUTLAKA b�z default yer�nede constructor
	// yazmal�y�z

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public void yak�t(String yak�t) {
		System.out.println("araba yak�t olarak" + yak�t + "kullan�r");
	}

	public void vites(String vites) {
		System.out.println("araba" + " " + vites + " " + "viteslidir");
	}

}
