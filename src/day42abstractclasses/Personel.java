package day42abstractclasses;

public abstract class Personel {

	//b�r class'� abstract yapmak �c�n class keyword'unden once
	//abstract yazmak yeterl�d�r     
	
	//abstract bir class�n �c�nde ver�able olab�l�r m�?
	//olabilir
	public String isim= "yas�n";
	
	//var�able'lar abstract olur mu?
	//olmaz...
	//public abstract int say�=10;
	
	//asbtract class'�n tum concrete ch�ld'ler� abstract class'dak� tum d�nam�k ozell�kler�
	//override etmek zorundad�r
	
	//b�r method abstract olur mu ve nas�l yap�l�r?
	public abstract void maasHesapla();
	public abstract void mesaiBlgisi();
	
	//bir astract class da concrete method yaz�lab�l�r m�?
	//bir abstract class'da abstract ve concrete method'lar olab�l�r
	//concrete ch�ld class'lar abstract methodlar'� overr�de ETMEK ZORUNDADIR ama
	//concrete methodlar� override etmek �stege bagl�d�r
	public void ozelS�gorta() {
		System.out.println("bu personel ozel s�gorta kapsam�ndad�r");
	}
	
}
