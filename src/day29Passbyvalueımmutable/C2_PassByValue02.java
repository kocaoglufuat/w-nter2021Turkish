package day29Passbyvalue�mmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
		  - Method�da indirim uygulayip fiyati main method�da yazdirin
		  - Method�lari arka arkaya cagirip dogru calistiklarini kontrol edin
		*/
		
		double f�yat=100;
		System.out.println("%10 �nd�r�ml� f�yat :" + ind�r�mUygula10(f�yat));
		System.out.println("%20 �nd�r�ml� f�yat :" + ind�r�mUygula20(f�yat));
		System.out.println("%25 �nd�r�ml� f�yat :" + ind�r�mUygula25(f�yat));
	System.out.println("method call'dan sonra f�yat :" + f�yat);
	
	}

	public static double ind�r�mUygula25(double f�yat) {
		f�yat*=0.75;
		return f�yat;
	}

	public static double ind�r�mUygula20(double f�yat) {
		f�yat*=0.80;
		return f�yat;
	}

	public static double ind�r�mUygula10(double f�yat) {
		f�yat*=0.90;
		return f�yat;
	}

}
