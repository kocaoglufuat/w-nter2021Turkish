package day34_Inher�tance;

public class Muhasebe extends Personel {
       //muhasabe class'�n�n  personel class'�n�n child class'� oldugunu
       //declare etmek �c�n class �sm�ne extends keyword �le 
       //parent class'� yazar�z

	
	public int saatUcret�;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas=30*8*saatUcret�;
	return maas;
	}
	
}
