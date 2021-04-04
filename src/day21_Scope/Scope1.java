package day21_Scope;

public class Scope1 {

public	static int okulId =1201;
	static String okulAdý="yýldýz koleji";
	static boolean acýkMý;

	//static verýable'lar class level da olusturuldugu ýcýn class'ýn her yerýnden kullanýlabýlýr
	//instance verýable'lar static olmayan method'larda dýrek kullanýlabiliyorken,static method'larda
	// object olusturularak kullanýlabýlýyordu
	//static verýable'lar ise ister static ýsterse static olamayan tum methodlardan dýrek kullanabýlýrýz.
	
	public static void main(String[] args) {
		System.out.println(okulId+" "+okulAdý+" "+acýkMý );
		
		okulId=1202;
		acýkMý=true;
		
		staticMethod();
		System.out.println(okulId+" "+okulAdý+" "+acýkMý );

	}

	public static void staticMethod() {
		System.out.println(okulId+" "+okulAdý+" "+acýkMý );
	okulId=1203;
	}

	
	public void method() {
		okulId=1205;
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
}
