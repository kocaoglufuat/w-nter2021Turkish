package day21_Scope;

public class Scope2 {

	public static void main(String[] args) {
    //static verýable'lar ýcýn object olusturma ýhtýyacý yoktur
	//baska býr class dan static verýable'lara ulasmak ýstedýgýmýzde 
	//ulasmak ýstedýgýmýz class'ýn adý . static verýable adý yazmamýz yeterlýdýr
	  
		
		System.out.println(Scope1.okulAdý);
    System.out.println(Scope1.okulId); //java Run Týme program'dýr.  
	                                  //scope2 class'ý calýstýrýldýgýnda scope1 calýsmazzzzü
	                                   //dolayýsýyla en basta olusturulan veya atanan degerler gecerli olur
    
    Scope1.okulAdý="mehmet kolejý";
    System.out.println(Scope1.okulAdý); //mehmet kolejý
	}

}