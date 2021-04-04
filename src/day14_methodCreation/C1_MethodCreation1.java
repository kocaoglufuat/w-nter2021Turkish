package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
	
		
		String str="java cok guzel";
		
		// Java method'larýn sadece ýsmýne degýl, ýsým +parametre'lere bakar
		//sadeece parametre sayýsý degýl parametre'lerýn data týplerýne de bakar.
		str.endsWith("el"); // bu method'un gorevý gýdýp kelýmelerýn son kýsmýný kontrol etmek
		                    // bu method'u kullanmak ýcýn kontrol ettýkten sonra
		                    //bana rapor olarak ne getýrdýgýný býlmem lazým(true/false)
		
		// 2) Bir method olusturdugumuzda method'un ne yapacagina
        //    ve gorevi yaptiktan sonra bana ne döndüreceðine bastan karar vermeliyiz
        
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
