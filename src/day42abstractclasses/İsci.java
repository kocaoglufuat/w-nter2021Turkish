package day42abstractclasses;

public class �sci extends Personel{

	public static void main(String[] args) {
	
		�sci isci1=new �sci();
isci1.maasHesapla();
isci1.mesaiBlgisi();
isci1.isim="ayse"; //abstract parent class'dak� var�able'lar� �stersem kullanab�l�r�m
isci1.ozelS�gorta();//abstract parent class'dak� concrete method'u �stersem kullan�r�m
	}

	@Override
	public void maasHesapla() {
		// parent class�ndak� abstract method'u Implement (uyarlama)ett�
		//1-sen abstract b�r class'� parent ed�nd�ysen mutlaka oradak� abstract method'u
		//implement etmel�s�n
		//2-parent class'dak� method'da bady olmad�g� �c�n onu kullanman�n anlam� yok
		//b�z ch�ld class'da body olan method (concrete) kullan�p �slem yapmal�y�z
		System.out.println("isciler �c�n maas 5000 tl");
	}

	@Override
	public void mesaiBlgisi() {
		System.out.println("i�ciler gunluk 8 saat cal�s�rlar");
		
	}

}
