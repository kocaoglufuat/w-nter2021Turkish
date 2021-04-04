package day42abstractclasses;

public class Ýsci extends Personel{

	public static void main(String[] args) {
	
		Ýsci isci1=new Ýsci();
isci1.maasHesapla();
isci1.mesaiBlgisi();
isci1.isim="ayse"; //abstract parent class'daký varýable'larý ýstersem kullanabýlýrým
isci1.ozelSýgorta();//abstract parent class'daký concrete method'u ýstersem kullanýrým
	}

	@Override
	public void maasHesapla() {
		// parent classýndaký abstract method'u Implement (uyarlama)ettý
		//1-sen abstract býr class'ý parent edýndýysen mutlaka oradaký abstract method'u
		//implement etmelýsýn
		//2-parent class'daký method'da bady olmadýgý ýcýn onu kullanmanýn anlamý yok
		//býz chýld class'da body olan method (concrete) kullanýp ýslem yapmalýyýz
		System.out.println("isciler ýcýn maas 5000 tl");
	}

	@Override
	public void mesaiBlgisi() {
		System.out.println("iþciler gunluk 8 saat calýsýrlar");
		
	}

}
