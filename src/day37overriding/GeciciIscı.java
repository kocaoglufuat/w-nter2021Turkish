package day37overriding;

public class GeciciIscý extends Ýsci {

	public String calýstýgýBolum = "yemekhane";

	public static void main(String[] args) {

		// Overriding
		// bir child class'da paretn class'dan mýras alýnan method'u
		// degýstýrmeye overriding denir

		GeciciIscý gi = new GeciciIscý();
		System.out.println(gi.maasHesapla());
		gi.mesai();
	}

	// overriding yapmak ýcýn parent class'daký method sýgnature'ý
	// ile child class'da býr method olusturulur
	// sýgnature ayný oldugundan sadece body degýsýr
	// boylece parent class'daký method chýld class ýcýn gecersýz hale gelir

	public int maasHesapla() {

		return 30 * 8 * 10;
	}

	@Override // annotation
	public void mesai() {
		// super.mesai();
		System.out.println("gecýcý ýscýler haftada 25 saat calýsýr");
	}
	// annotation : acýklama, dipnot
	// java 29.satýrda kodu ýnceleyenler ýcýn býr acýklama getýrýyor

	// annotatýon olmasý ýle olmamasý arasýndaký fark
	// annotatýon sadece býr acýklama degýldýr
	// overrýde yaptýgýmýz method sýgnature'ý degýstýrýlýrse CTE verdýrýr

	// eger override edilen parent class'daký method'un (overrýden) 'un da
	// calýsmasýný ýstýyorsak overriding method'un ýlk satýrýna super()
	// overrýdenMethodIsmý yazarýz
	// eger overriding method'un ýlk satýrýna super() yazýlmazsa
	// overriden method calýsmaz(constructor'dan farklý)

	//acces modýfýer
	//chýld parent'ý sýnýrlandýramaz
	//yaný overrýdýng method'un acces modifier i overridden method'un access modýfýer'ýndan
	//daha dar olamaz
	
	//return type
	//overriden method'un return type'i prýmýtýve veya voýd ýse
	//overrýdýng method'unu return type'ý da ayný olmalý
	//eger return type prýmýtýve degýlse
	//(overriding method'un return type'ý) IS-A	(overridden  method'un return type'ý)olmalýdýr




}
