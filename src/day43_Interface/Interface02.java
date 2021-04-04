package day43_Interface;

public interface Interface02 {
	
	//soru þu : burdaký default ve statýc býzým býldýgýmýz default  ve static mi ?
	//cevap :HAYIR
	
	public default void deneme() {
     System.out.println("default keyword'u method calýstý");
	}
    
	//bizim bildigimiz default access modfýer'dý
	//býr method'da býrden fazla access modifer olur mu?
    //býzým ýnterface de olusturdugumuz tum method'lar public'tir
	//ýnterface'de default keyword kullanarak concrete method olusturabýlýrýz
	//buradaký default keyword'u access modifier degýl
	//java nýn ozel býr cozumu dur
	//buradaký default keyword basýna yazýldýgý method'un concrete oldugunu belýrtýr
	
	
	static void deneme2() {
	System.out.println("static keyword'lu method calýstý");

	//yukarýdan default keyword'u ýcýn yazdýklarýmýz static ýcýnde gecerlýdýr
	
	//statýc ve default keyword'u kullanarak olusturudugumuz method'lar
	//override edýlmek ZORUNDA DEGILDIR.
	
	}

}
