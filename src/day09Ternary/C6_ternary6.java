package day09Ternary;

import java.util.Scanner;

public class C6_ternary6 {

	public static void main(String[] args) {
		//soru2 : kullanýcýdan býr harf ýsteyýn kucuk harf ýse console "kucuk harf"
		//buyuk harfsa console "buyuk harf" yoksa gýrdýgýnýz karakter harf degýl yazdýrýn.
		
		
		  Scanner scan =new Scanner(System.in);
	        System.out.println("Lutfen bir harf giriniz");
	        
	        char harf=scan.next().charAt(0);
	        String sonuc = ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')) 
	                        ? ((harf>='a' && harf<='z') )?"ilk harf kucuk harf" : "ilk harf buyuk harf"
	                        : "gecersiz karakter";
	        System.out.println(sonuc);          

		
		scan.close();
		
		
		
		
		

	}

}
