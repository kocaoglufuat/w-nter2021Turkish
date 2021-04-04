package day34_Inherýtance;

public class Muhasebe extends Personel {
       //muhasabe class'ýnýn  personel class'ýnýn child class'ý oldugunu
       //declare etmek ýcýn class ýsmýne extends keyword ýle 
       //parent class'ý yazarýz

	
	public int saatUcretý;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas=30*8*saatUcretý;
	return maas;
	}
	
}
