package day29Passbyvalue�mmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		
		//PassByValue ve PassByReference
		
		/*
		Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  - Method�da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve method�da yapilan 
  -degisikligin orginal degeri degistirip degistirmedigini kontrol edin.
		*/
	
	double f�yat=100;
	
	indirimUygula(f�yat);//method call
	System.out.println("method call sonras� f�yat :" + f�yat);
	
	
	
	}

	public static void indirimUygula(double f�yat) {
		
		f�yat=f�yat*0.90;
		System.out.println("%10indirimli fiyat :"+ f�yat);
		System.out.println(f�yat-10);
	}

}
