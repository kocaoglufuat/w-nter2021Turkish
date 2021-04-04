package day37overriding;

public class GeciciIsc� extends �sci {

	public String cal�st�g�Bolum = "yemekhane";

	public static void main(String[] args) {

		// Overriding
		// bir child class'da paretn class'dan m�ras al�nan method'u
		// deg�st�rmeye overriding denir

		GeciciIsc� gi = new GeciciIsc�();
		System.out.println(gi.maasHesapla());
		gi.mesai();
	}

	// overriding yapmak �c�n parent class'dak� method s�gnature'�
	// ile child class'da b�r method olusturulur
	// s�gnature ayn� oldugundan sadece body deg�s�r
	// boylece parent class'dak� method ch�ld class �c�n gecers�z hale gelir

	public int maasHesapla() {

		return 30 * 8 * 10;
	}

	@Override // annotation
	public void mesai() {
		// super.mesai();
		System.out.println("gec�c� �sc�ler haftada 25 saat cal�s�r");
	}
	// annotation : ac�klama, dipnot
	// java 29.sat�rda kodu �nceleyenler �c�n b�r ac�klama get�r�yor

	// annotat�on olmas� �le olmamas� aras�ndak� fark
	// annotat�on sadece b�r ac�klama deg�ld�r
	// overr�de yapt�g�m�z method s�gnature'� deg�st�r�l�rse CTE verd�r�r

	// eger override edilen parent class'dak� method'un (overr�den) 'un da
	// cal�smas�n� �st�yorsak overriding method'un �lk sat�r�na super()
	// overr�denMethodIsm� yazar�z
	// eger overriding method'un �lk sat�r�na super() yaz�lmazsa
	// overriden method cal�smaz(constructor'dan farkl�)

	//acces mod�f�er
	//ch�ld parent'� s�n�rland�ramaz
	//yan� overr�d�ng method'un acces modifier i overridden method'un access mod�f�er'�ndan
	//daha dar olamaz
	
	//return type
	//overriden method'un return type'i pr�m�t�ve veya vo�d �se
	//overr�d�ng method'unu return type'� da ayn� olmal�
	//eger return type pr�m�t�ve deg�lse
	//(overriding method'un return type'�) IS-A	(overridden  method'un return type'�)olmal�d�r




}
