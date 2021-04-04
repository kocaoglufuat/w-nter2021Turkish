package day29Passbyvalueýmmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		
		//PassByValue ve PassByReference
		
		/*
		Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  - Method’da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve method’da yapilan 
  -degisikligin orginal degeri degistirip degistirmedigini kontrol edin.
		*/
	
	double fýyat=100;
	
	indirimUygula(fýyat);//method call
	System.out.println("method call sonrasý fýyat :" + fýyat);
	
	
	
	}

	public static void indirimUygula(double fýyat) {
		
		fýyat=fýyat*0.90;
		System.out.println("%10indirimli fiyat :"+ fýyat);
		System.out.println(fýyat-10);
	}

}
