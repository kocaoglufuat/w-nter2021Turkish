package day23_mYcONSTURCTOR;

public class StaticBlock {
	static String isim;	
	// static blok class calýsýtýrýldýgýnda ýlk olarak calýsýr(main method'dan býle once)	
	// static bloklar statýc varýable'lara deger atamak ýcýn kullanýlýr
	
	static {
	isim="mehmet";
	System.out.println(isim);
	}
	
	static {
		System.out.println("2.static block calýstý");
	}
	
	
	
	public static void main(String[] args) {
	
	isim="alican";
	System.out.println(isim);
		
		
		

	}

}
