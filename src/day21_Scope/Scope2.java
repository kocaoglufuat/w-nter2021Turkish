package day21_Scope;

public class Scope2 {

	public static void main(String[] args) {
    //static ver�able'lar �c�n object olusturma �ht�yac� yoktur
	//baska b�r class dan static ver�able'lara ulasmak �sted�g�m�zde 
	//ulasmak �sted�g�m�z class'�n ad� . static ver�able ad� yazmam�z yeterl�d�r
	  
		
		System.out.println(Scope1.okulAd�);
    System.out.println(Scope1.okulId); //java Run T�me program'd�r.  
	                                  //scope2 class'� cal�st�r�ld�g�nda scope1 cal�smazzzz�
	                                   //dolay�s�yla en basta olusturulan veya atanan degerler gecerli olur
    
    Scope1.okulAd�="mehmet kolej�";
    System.out.println(Scope1.okulAd�); //mehmet kolej�
	}

}