package day41ErrorsGarbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}

		//bu kod cal�st�g�nda kac tane obje olusur?
		//1001
		//�lk basta 1 tane olusturduk
		//sonra her dongude str'a concanat�on yap�lacak
		//ama str�ng class'� �mmutable oldugu �c�n her yen� deger� koymak �c�n
		//yen� b�r str�ng objes� olusturuyor ve esk� obje'den po�nter s�l�n�r
		
		//dolay�s�yla loop b�tt�g�nde str �c�n b�r tane po�nter'�n �saret ett�g� obje,
		//1000 tanede h�c b�r po�nter'�n �saret etmed�g� obje heap memory de bulunur
		
		List<Integer> list=new ArrayList<>();
       // bu sat�r java'ya yen� b�r obje olusturmas�n� soyluyor
	   //java yen� obje �c�n yer varm� d�ye memory'� kontrol eder ve memory kr�t�k sev�yede �se
		//Garbege collector'u devreye sokuyor...
		
		 
        // Garbage collector finalize() methodunu calistirir
        // finalize method'u silinecek objeleri isaretler ve 
        // sonra Garbage collector finalized olan objeleri siler.

		
		
	}

}
