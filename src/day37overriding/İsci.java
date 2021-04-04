package day37overriding;

public class İsci extends Personel {

	public String bolum = "kaynak Atolyesı";
	public int maas = 5000;
    public String isim="mesut";
	
    public int maasHesapla() {
		return 30 * 8 * 15;// 30 gun sayısı 8 gunluk mesaı 15 saat ucretı
	}

	public void mesai() {
		System.out.println("isciler gunluk 8 saat calısır");
	}

	//overloadıng : aynı ısımde ama farklı method sıgnature'larına sahıp method
	public int maasHesapla(int gunSayısı) {
		return gunSayısı*8*15;
	}	
	
	public int maasHesapla(int gunlukCalısmaSaatı,int gunSayısı) {
		return gunSayısı*gunlukCalısmaSaatı*15;
	}
	
	public int maasHesapla(int gunlukCalısmaSaatı,int gunSayısı,int saatUcretı) {
		return  gunlukCalısmaSaatı* gunSayısı*saatUcretı;
	}
	
}
