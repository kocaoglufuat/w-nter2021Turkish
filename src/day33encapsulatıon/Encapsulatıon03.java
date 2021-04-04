package day33encapsulatýon;

public class Encapsulatýon03 {

	public static void main(String[] args) {

		// Encapsulatýon02 class'ýndaký class member'a ulasmaya calýsalým
		Encapsulatýon02 obj1 = new Encapsulatýon02();

		// býz erýsým yetkýsýný ýkýye ayýrýyoruz
		// 1-okuyabýlme
		// 2-degýstýrýp kullanabýlme

		System.out.println(obj1.sayý);
		obj1.setHesapNo(12445677);

		//býr class ýcýnde class member olustururken bunu dýger class'lar ýle
		//ne oranda paylasacagýmýza karar verýr
		//1- herkes okuyabýlsýn ve obje uzerýnden deger atayýp kullanabýlsýn  ==>public
		//2-herkes okuyabýlsýn ama kýmse obje uzerýnden de olsa degýstýremez private==>public
		//3- ýlk atadýgým degerý kýmse goremesýn prývate ==> public set ()
		obj1.setTcNo("12314516701");
		
	}
}