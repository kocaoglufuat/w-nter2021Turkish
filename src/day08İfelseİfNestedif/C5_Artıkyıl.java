package day08ÝfelseÝfNestedif;

import java.util.Scanner;

public class C5_Artýkyýl {

	public static void main(String[] args) {
	
		
		
		
		
		//Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	//Kullanicidan bir sifre girmesini isteyin
	 //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
	  //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen þýfre gýrýnýz");
		char ýlkharf=scan.next().charAt(0);
		if (ýlkharf>='A' && ýlkharf<='Z' ){
			if (ýlkharf=='A') {
				System.out.println("sýfre gecerlý");
			} else {
                System.out.println("sýfre gecersýz");
			}
		
		
		} else if (ýlkharf>='a' && ýlkharf>='z'){
        if (ýlkharf=='z') {
			System.out.println("sýfre gecerlý");
		} else {
          System.out.println("sýfre gecersýz");
		}
			
		}else {
			System.out.println("sýfre gecersýz");
		}
		scan.close();
	
		
			
			
				
			
		
		
		
		
		

	}

}
