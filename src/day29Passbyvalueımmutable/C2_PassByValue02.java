package day29Passbyvalueýmmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
		  - Method’da indirim uygulayip fiyati main method’da yazdirin
		  - Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		*/
		
		double fýyat=100;
		System.out.println("%10 ýndýrýmlý fýyat :" + indýrýmUygula10(fýyat));
		System.out.println("%20 ýndýrýmlý fýyat :" + indýrýmUygula20(fýyat));
		System.out.println("%25 ýndýrýmlý fýyat :" + indýrýmUygula25(fýyat));
	System.out.println("method call'dan sonra fýyat :" + fýyat);
	
	}

	public static double indýrýmUygula25(double fýyat) {
		fýyat*=0.75;
		return fýyat;
	}

	public static double indýrýmUygula20(double fýyat) {
		fýyat*=0.80;
		return fýyat;
	}

	public static double indýrýmUygula10(double fýyat) {
		fýyat*=0.90;
		return fýyat;
	}

}
