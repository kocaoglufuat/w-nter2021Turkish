package day22_constructor;

public class CarUret {
	// SORU ......... CONSTRUCTOR BU CLASS'DA NEREDE ?
	// su anda bu class da gorunur b�r constructor yok
	// b�r classs olusturuldugunda java bu class'dan ureteceg�n� b�l�r.
	// ve gorunmeyen DEFAULT CONSTRUCTOR'I class'a yerlestirir.
	//default constructor parametresizdir dolay�s�yla sadece h�c b�r ozell�g� tan�mlanamayan
	//objeler uret�r
	//default constructor �le uret�len b�r objen�n tum ozell�kler� sonradan tan�mlanmal�d�r.

	// eger b�z sonradan constructor yazarsak,java default constructor'� iptal eder
	
	// bir constructor olustural�m
	public CarUret (){
		
	}
	//kurallar: 1- �sm� class �le ayn� olmal�d�r (dolay�s�yla buyuk harfle baslar)
	//2- constructor return type'a sah�p deg�ld�r.
	//3- constructor �sm�nden sonra mutlaka parantez olur () ama parametre olmas� ops�yoneld�r
	//4-bir constructor olusturuldugunda k�mler�n kullanacag� bel�rlemek �c�n access mod�f�rer yaz�l�r
	
	String marka;
	String model;
	int y�l;
	boolean kazas�Varm�;
	public String yil;
//bir programda cok fazla ureteceg�m�z objeler �c�n b�r tane class olustururuz
	//bu class'da olusturulacak objelere a�t tum ozell�kler olur
	//bu class d�rek cal�st�r�lmayacag� �c�n ma�n method olmasa da olur
	public void yak�t(String yak�t) {
		System.out.println("araba yak�t olarak" + yak�t + "kullan�r");
	}

	public void vites(String vites) {
		System.out.println("araba" + vites + "viteslidir");
	}
}
