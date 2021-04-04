package day37overriding;

public class Formen extends Ýsci {
	public String sorumluOldBolum = "bakým";
	public String isim = "emrullah";

	public static void main(String[] args) {
		// ýnherýtance da data turu olarak class ýsmý kullanýmý

		//býr class'da obje uretýrken data turu olarak class'ýn kendýsýný
		//veya parent(lar)ini kullanabýlýrýz
		// olusturdugumuz obje ýle verýable kullanmamýz gerekýrse,hangý degerý
		//alacagýný anlamak ýcýn once data turu olan class'A gýderýz
		//orada aradýgýmýz varýable varsa kullanýrýz,yoksa
		//parent(lar)ina bakarýz,yukarý dogru gýderken ýlk buldugumuz degerý kullanabýlirýz
		
		Formen fr1 = new Formen();
		// fr1 objesýný kullanarak hangý class'larýn varýable'larý gorebýlrým
		fr1.sorumluOldBolum = "marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas);
		// mesut marangozhane 10000

		Ýsci fr2 = new Formen();
		// data turu olarak ýscý secýldýgý ýcýn

		fr2.bolum = "kaynak atalyesý";
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// mesut kaynak atalyesý 5000

	Personel fr3= new Formen();
	System.out.println(fr3.isim);// emre
	
	
	}
}
