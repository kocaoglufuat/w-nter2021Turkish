package day43_Interface;

public interface Interface01 {

	public void motor();// ýnterface ýcýnde abstract method'lar VE
						// Ozel concrete method'lar olabýlýr

	/*
	 * býr abstract method'un body'sý olmadýgýndan o method'un ýstenen dýnamýk
	 * ozellýgý nasýl gerceklestýrecegýný býlmemýz mumkun degýldýr sadece ne
	 * yapacagýný býlýrýz
	 * 
	 * Bu method býze sunu anlatýr; bený ýnherýt eden her concrete class'ýn dýnamýk
	 * motor ozellýgý olmalýdýr
	 * 
	 */

	void vites();// bený ýnherýt eden her concrete class'ýn dýnamýk výtes ozellýgý olmalýdýr

	abstract void kasa();// bený ýnherýt eden her concrete class'ýn dýnamýk kasa ozellýgý olmalýdýr

	// ýnterface'de sadece ABSTRACT,PUBLÝC method'lar olur
    //bu ýký keyword'u yazsak da yazmasak da java tum methodlar'ý bu sekýlde kabul eder.

    //javada ýnterface olusturmak ýstýyorsak bastan o sekýlde olusturmalýyýz
	//býr class sonradan bazý keyword'ler yazýlarak ýnterface yapýlamaz

	String ÝSÝM = "mustafa";//java ýsým
	
}
