package day43_Interface;

public interface Interface01 {

	public void motor();// �nterface �c�nde abstract method'lar VE
						// Ozel concrete method'lar olab�l�r

	/*
	 * b�r abstract method'un body's� olmad�g�ndan o method'un �stenen d�nam�k
	 * ozell�g� nas�l gerceklest�receg�n� b�lmem�z mumkun deg�ld�r sadece ne
	 * yapacag�n� b�l�r�z
	 * 
	 * Bu method b�ze sunu anlat�r; ben� �nher�t eden her concrete class'�n d�nam�k
	 * motor ozell�g� olmal�d�r
	 * 
	 */

	void vites();// ben� �nher�t eden her concrete class'�n d�nam�k v�tes ozell�g� olmal�d�r

	abstract void kasa();// ben� �nher�t eden her concrete class'�n d�nam�k kasa ozell�g� olmal�d�r

	// �nterface'de sadece ABSTRACT,PUBL�C method'lar olur
    //bu �k� keyword'u yazsak da yazmasak da java tum methodlar'� bu sek�lde kabul eder.

    //javada �nterface olusturmak �st�yorsak bastan o sek�lde olusturmal�y�z
	//b�r class sonradan baz� keyword'ler yaz�larak �nterface yap�lamaz

	String �S�M = "mustafa";//java �s�m
	
}
