package day11StringMonýpuýýletýons;

public class C2_CharAt {

	public static void main(String[] args) {
		//charAt(ýndex)
		//scan.next().charAt(0) 0.ýndexdeký karakterý verýr.
		// index 0' dan baslar
		
		String str = "java cok guzel";
		System.out.println(str.charAt(0));// J
		System.out.println(str.charAt(5));//c
		System.out.println(str.charAt(13));//l
		//kelýmenýn uzunlugu son ýndex + 1 dir.
		//son ýndex kelýmenýn uzunlugu(length) -1
	
		//kullanýcý 10 harflý býr kelýme gýrerse 
		//bana son harfý verecek kodu yazýnýz.
		//str.charAt(9)
		
		
		//System.out.println(str.charAt(14)); exceptýon verýr.
		//eger ýndex olarak Strýng'ýn uzunlugu veya daha buyuk býr sayý gýrýlýrse
		
		
	// (String str3 =5;)	// comple týme error CTE
		//Kod calýsmadan Java'nýn farkýna varýp altýný kýrmýzý cýzdýgý hatalardýr
		//derleme zaman hatasý.
		
		//System.out.println(str.charAt(14)); bazý hatalar syntax'den anlasýlmaz,
		//ancak kod calýstýrýldýktan sonra java ýslemý yaparken anlasýlýr
		//Run time error denýr.RTE
		
	}

}
