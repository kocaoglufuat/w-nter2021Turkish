package day37overriding;

public class �sci extends Personel {

	public String bolum = "kaynak Atolyes�";
	public int maas = 5000;
    public String isim="mesut";
	
    public int maasHesapla() {
		return 30 * 8 * 15;// 30 gun say�s� 8 gunluk mesa� 15 saat ucret�
	}

	public void mesai() {
		System.out.println("isciler gunluk 8 saat cal�s�r");
	}

	//overload�ng : ayn� �s�mde ama farkl� method s�gnature'lar�na sah�p method
	public int maasHesapla(int gunSay�s�) {
		return gunSay�s�*8*15;
	}	
	
	public int maasHesapla(int gunlukCal�smaSaat�,int gunSay�s�) {
		return gunSay�s�*gunlukCal�smaSaat�*15;
	}
	
	public int maasHesapla(int gunlukCal�smaSaat�,int gunSay�s�,int saatUcret�) {
		return  gunlukCal�smaSaat�* gunSay�s�*saatUcret�;
	}
	
}
