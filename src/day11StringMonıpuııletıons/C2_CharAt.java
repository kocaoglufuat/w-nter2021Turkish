package day11StringMon�pu��let�ons;

public class C2_CharAt {

	public static void main(String[] args) {
		//charAt(�ndex)
		//scan.next().charAt(0) 0.�ndexdek� karakter� ver�r.
		// index 0' dan baslar
		
		String str = "java cok guzel";
		System.out.println(str.charAt(0));// J
		System.out.println(str.charAt(5));//c
		System.out.println(str.charAt(13));//l
		//kel�men�n uzunlugu son �ndex + 1 dir.
		//son �ndex kel�men�n uzunlugu(length) -1
	
		//kullan�c� 10 harfl� b�r kel�me g�rerse 
		//bana son harf� verecek kodu yaz�n�z.
		//str.charAt(9)
		
		
		//System.out.println(str.charAt(14)); except�on ver�r.
		//eger �ndex olarak Str�ng'�n uzunlugu veya daha buyuk b�r say� g�r�l�rse
		
		
	// (String str3 =5;)	// comple t�me error CTE
		//Kod cal�smadan Java'n�n fark�na var�p alt�n� k�rm�z� c�zd�g� hatalard�r
		//derleme zaman hatas�.
		
		//System.out.println(str.charAt(14)); baz� hatalar syntax'den anlas�lmaz,
		//ancak kod cal�st�r�ld�ktan sonra java �slem� yaparken anlas�l�r
		//Run time error den�r.RTE
		
	}

}
