package day42abstractclasses;

public abstract class Personel {

	//býr class'ý abstract yapmak ýcýn class keyword'unden once
	//abstract yazmak yeterlýdýr     
	
	//abstract bir classîn ýcýnde verýable olabýlýr mý?
	//olabilir
	public String isim= "yasýn";
	
	//varýable'lar abstract olur mu?
	//olmaz...
	//public abstract int sayý=10;
	
	//asbtract class'ýn tum concrete chýld'lerý abstract class'daký tum dýnamýk ozellýklerý
	//override etmek zorundadýr
	
	//býr method abstract olur mu ve nasýl yapýlýr?
	public abstract void maasHesapla();
	public abstract void mesaiBlgisi();
	
	//bir astract class da concrete method yazýlabýlýr mý?
	//bir abstract class'da abstract ve concrete method'lar olabýlýr
	//concrete chýld class'lar abstract methodlar'ý overrýde ETMEK ZORUNDADIR ama
	//concrete methodlarý override etmek ýstege baglýdýr
	public void ozelSýgorta() {
		System.out.println("bu personel ozel sýgorta kapsamýndadýr");
	}
	
}
