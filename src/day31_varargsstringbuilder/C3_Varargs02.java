package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		
		//istediðimiz kadar sayý gýrdýgýmýzde tums ayýlarý toplayan býr method yazalým
		// var---- variety cesýtlýlýk args--- arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		toplama(4,6,8);
		
		
		

	}

	public static void toplama(int...var ) { // data turunden sonra yazdýgýmýz ... varargs kullanacagýmýz anlamýna gelýr
		int toplam=0;
		for (int each : var) {
		toplam+=each;
			
		}
		System.out.println("toplam :" +toplam);
		
	}

}
