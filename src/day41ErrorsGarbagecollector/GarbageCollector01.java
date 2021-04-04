package day41ErrorsGarbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}

		//bu kod calýstýgýnda kac tane obje olusur?
		//1001
		//ýlk basta 1 tane olusturduk
		//sonra her dongude str'a concanatýon yapýlacak
		//ama strýng class'ý ýmmutable oldugu ýcýn her yený degerý koymak ýcýn
		//yený býr strýng objesý olusturuyor ve eský obje'den poýnter sýlýnýr
		
		//dolayýsýyla loop býttýgýnde str ýcýn býr tane poýnter'ýn ýsaret ettýgý obje,
		//1000 tanede hýc býr poýnter'ýn ýsaret etmedýgý obje heap memory de bulunur
		
		List<Integer> list=new ArrayList<>();
       // bu satýr java'ya yený býr obje olusturmasýný soyluyor
	   //java yený obje ýcýn yer varmý dýye memory'ý kontrol eder ve memory krýtýk sevýyede ýse
		//Garbege collector'u devreye sokuyor...
		
		 
        // Garbage collector finalize() methodunu calistirir
        // finalize method'u silinecek objeleri isaretler ve 
        // sonra Garbage collector finalized olan objeleri siler.

		
		
	}

}
