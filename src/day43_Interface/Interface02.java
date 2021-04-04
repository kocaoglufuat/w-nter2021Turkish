package day43_Interface;

public interface Interface02 {
	
	//soru �u : burdak� default ve stat�c b�z�m b�ld�g�m�z default  ve static mi ?
	//cevap :HAYIR
	
	public default void deneme() {
     System.out.println("default keyword'u method cal�st�");
	}
    
	//bizim bildigimiz default access modf�er'd�
	//b�r method'da b�rden fazla access modifer olur mu?
    //b�z�m �nterface de olusturdugumuz tum method'lar public'tir
	//�nterface'de default keyword kullanarak concrete method olusturab�l�r�z
	//buradak� default keyword'u access modifier deg�l
	//java n�n ozel b�r cozumu dur
	//buradak� default keyword bas�na yaz�ld�g� method'un concrete oldugunu bel�rt�r
	
	
	static void deneme2() {
	System.out.println("static keyword'lu method cal�st�");

	//yukar�dan default keyword'u �c�n yazd�klar�m�z static �c�nde gecerl�d�r
	
	//stat�c ve default keyword'u kullanarak olusturudugumuz method'lar
	//override ed�lmek ZORUNDA DEGILDIR.
	
	}

}
