package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		 
		// verýlen int'lerden ilki haric tum sayýlarý toplayýn ve
		 //buldugunuz toplam ýle ýlk sayýyý carpýp sonucu yazdýrýn
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
		
	
	
	}
		
		
		public static void toplama(int sayý1 , int...var ) { // data turunden sonra yazdýgýmýz ... varargs kullanacagýmýz anlamýna gelýr
			
		System.out.println("varargs'a dahýl olmayan argument : "+ sayý1);		
			int toplam=0;
			for (int each : var) {
				toplam+=each;
			}
			
		System.out.println(sayý1*toplam);
			

	
		}
}
