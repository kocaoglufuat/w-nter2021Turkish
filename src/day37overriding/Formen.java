package day37overriding;

public class Formen extends �sci {
	public String sorumluOldBolum = "bak�m";
	public String isim = "emrullah";

	public static void main(String[] args) {
		// �nher�tance da data turu olarak class �sm� kullan�m�

		//b�r class'da obje uret�rken data turu olarak class'�n kend�s�n�
		//veya parent(lar)ini kullanab�l�r�z
		// olusturdugumuz obje �le ver�able kullanmam�z gerek�rse,hang� deger�
		//alacag�n� anlamak �c�n once data turu olan class'A g�der�z
		//orada arad�g�m�z var�able varsa kullan�r�z,yoksa
		//parent(lar)ina bakar�z,yukar� dogru g�derken �lk buldugumuz deger� kullanab�lir�z
		
		Formen fr1 = new Formen();
		// fr1 objes�n� kullanarak hang� class'lar�n var�able'lar� goreb�lr�m
		fr1.sorumluOldBolum = "marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas);
		// mesut marangozhane 10000

		�sci fr2 = new Formen();
		// data turu olarak �sc� sec�ld�g� �c�n

		fr2.bolum = "kaynak atalyes�";
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// mesut kaynak atalyes� 5000

	Personel fr3= new Formen();
	System.out.println(fr3.isim);// emre
	
	
	}
}
