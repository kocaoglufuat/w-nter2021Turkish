package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
	
		
		String str="java cok guzel";
		
		// Java method'lar�n sadece �sm�ne deg�l, �s�m +parametre'lere bakar
		//sadeece parametre say�s� deg�l parametre'ler�n data t�pler�ne de bakar.
		str.endsWith("el"); // bu method'un gorev� g�d�p kel�meler�n son k�sm�n� kontrol etmek
		                    // bu method'u kullanmak �c�n kontrol ett�kten sonra
		                    //bana rapor olarak ne get�rd�g�n� b�lmem laz�m(true/false)
		
		// 2) Bir method olusturdugumuzda method'un ne yapacagina
        //    ve gorevi yaptiktan sonra bana ne d�nd�rece�ine bastan karar vermeliyiz
        
        // 3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) " 
        //    de oldugu gibi
        //    disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
        //    deklare etmeliyiz 
        
        //    Method'u calistirmak istedigimizde (Method'u cagirmak) Parametre olarak 
        //    declare edilen data tiplerine uygun degerler girmeliyiz.
        //    girilen bu degerlere ARGUMENT denir.
        
        str.indexOf("va", 1); // 

	
		
		
		
		
		
		
		
		
		
		
		

	}

}
