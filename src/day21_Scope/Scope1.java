package day21_Scope;

public class Scope1 {

public	static int okulId =1201;
	static String okulAd�="y�ld�z koleji";
	static boolean ac�kM�;

	//static ver�able'lar class level da olusturuldugu �c�n class'�n her yer�nden kullan�lab�l�r
	//instance ver�able'lar static olmayan method'larda d�rek kullan�labiliyorken,static method'larda
	// object olusturularak kullan�lab�l�yordu
	//static ver�able'lar ise ister static �sterse static olamayan tum methodlardan d�rek kullanab�l�r�z.
	
	public static void main(String[] args) {
		System.out.println(okulId+" "+okulAd�+" "+ac�kM� );
		
		okulId=1202;
		ac�kM�=true;
		
		staticMethod();
		System.out.println(okulId+" "+okulAd�+" "+ac�kM� );

	}

	public static void staticMethod() {
		System.out.println(okulId+" "+okulAd�+" "+ac�kM� );
	okulId=1203;
	}

	
	public void method() {
		okulId=1205;
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
}
