package day23_mYcONSTURCTOR;

public class StaticBlock {
	static String isim;	
	// static blok class cal�s�t�r�ld�g�nda �lk olarak cal�s�r(main method'dan b�le once)	
	// static bloklar stat�c var�able'lara deger atamak �c�n kullan�l�r
	
	static {
	isim="mehmet";
	System.out.println(isim);
	}
	
	static {
		System.out.println("2.static block cal�st�");
	}
	
	
	
	public static void main(String[] args) {
	
	isim="alican";
	System.out.println(isim);
		
		
		

	}

}
