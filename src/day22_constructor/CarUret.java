package day22_constructor;

public class CarUret {
	// SORU ......... CONSTRUCTOR BU CLASS'DA NEREDE ?
	// su anda bu class da gorunur býr constructor yok
	// býr classs olusturuldugunda java bu class'dan uretecegýný býlýr.
	// ve gorunmeyen DEFAULT CONSTRUCTOR'I class'a yerlestirir.
	//default constructor parametresizdir dolayýsýyla sadece hýc býr ozellýgý tanýmlanamayan
	//objeler uretýr
	//default constructor ýle uretýlen býr objenýn tum ozellýklerý sonradan tanýmlanmalýdýr.

	// eger býz sonradan constructor yazarsak,java default constructor'ý iptal eder
	
	// bir constructor olusturalým
	public CarUret (){
		
	}
	//kurallar: 1- ýsmý class ýle ayný olmalýdýr (dolayýsýyla buyuk harfle baslar)
	//2- constructor return type'a sahýp degýldýr.
	//3- constructor ýsmýnden sonra mutlaka parantez olur () ama parametre olmasý opsýyoneldýr
	//4-bir constructor olusturuldugunda kýmlerýn kullanacagý belýrlemek ýcýn access modýfýrer yazýlýr
	
	String marka;
	String model;
	int yýl;
	boolean kazasýVarmý;
	public String yil;
//bir programda cok fazla uretecegýmýz objeler ýcýn býr tane class olustururuz
	//bu class'da olusturulacak objelere aýt tum ozellýkler olur
	//bu class dýrek calýstýrýlmayacagý ýcýn maýn method olmasa da olur
	public void yakýt(String yakýt) {
		System.out.println("araba yakýt olarak" + yakýt + "kullanýr");
	}

	public void vites(String vites) {
		System.out.println("araba" + vites + "viteslidir");
	}
}
