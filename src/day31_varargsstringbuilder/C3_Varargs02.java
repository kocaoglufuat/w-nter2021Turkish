package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		
		//istedi�imiz kadar say� g�rd�g�m�zde tums ay�lar� toplayan b�r method yazal�m
		// var---- variety ces�tl�l�k args--- arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		toplama(4,6,8);
		
		
		

	}

	public static void toplama(int...var ) { // data turunden sonra yazd�g�m�z ... varargs kullanacag�m�z anlam�na gel�r
		int toplam=0;
		for (int each : var) {
		toplam+=each;
			
		}
		System.out.println("toplam :" +toplam);
		
	}

}
