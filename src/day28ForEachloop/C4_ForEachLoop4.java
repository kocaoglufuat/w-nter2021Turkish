package day28ForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array�lerdeki ortak
		// elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz
		  String arr1[]= {"Ali", "Can", "Ayse", "Seher"};
	        String arr2[]= {"Ali", "Veli", "Mesut", "Seher", "Sedat"};
	        
	        // ortak elemanlar� olusturmak �c�n List olustural�m
	        
	        List <String> ortakElemanlar = new ArrayList<>();
	        //git arr dek� her eleman� get�r demek �c�n;
	        
	        
	        for (String eachArr1 : arr1) {
	            for (String eachArr2 : arr2) {
	                
	                if (eachArr1.equals(eachArr2)) { //arr1 de olup arr2 de deolan ortak eleman varsa yazd�rded�k
	                    ortakElemanlar.add(eachArr1);   
	                }
	                
	            }
	            
	            // ortakElemanlar l�stes� var
	            // liste dolu mu bos mu ? 
	        }     
	         if (ortakElemanlar.isEmpty()) { //ortakElemanlar.isEmpty() bu bossa ortak eleman yok yad�racag�z
	            System.out.println("ortak eleman yok");
	        } else {
	            System.out.println(ortakElemanlar);  //[Ali, Seher]

	        }
		
	}

}
