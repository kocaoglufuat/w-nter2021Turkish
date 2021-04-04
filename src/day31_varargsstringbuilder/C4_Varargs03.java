package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		 
		// ver�len int'lerden ilki haric tum say�lar� toplay�n ve
		 //buldugunuz toplam �le �lk say�y� carp�p sonucu yazd�r�n
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
		
	
	
	}
		
		
		public static void toplama(int say�1 , int...var ) { // data turunden sonra yazd�g�m�z ... varargs kullanacag�m�z anlam�na gel�r
			
		System.out.println("varargs'a dah�l olmayan argument : "+ say�1);		
			int toplam=0;
			for (int each : var) {
				toplam+=each;
			}
			
		System.out.println(say�1*toplam);
			

	
		}
}
