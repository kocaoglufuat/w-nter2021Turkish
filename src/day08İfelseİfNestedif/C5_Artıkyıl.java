package day08�felse�fNestedif;

import java.util.Scanner;

public class C5_Art�ky�l {

	public static void main(String[] args) {
	
		
		
		
		
		//Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	//Kullanicidan bir sifre girmesini isteyin
	 //Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise  �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
	  //Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise  �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen ��fre g�r�n�z");
		char �lkharf=scan.next().charAt(0);
		if (�lkharf>='A' && �lkharf<='Z' ){
			if (�lkharf=='A') {
				System.out.println("s�fre gecerl�");
			} else {
                System.out.println("s�fre gecers�z");
			}
		
		
		} else if (�lkharf>='a' && �lkharf>='z'){
        if (�lkharf=='z') {
			System.out.println("s�fre gecerl�");
		} else {
          System.out.println("s�fre gecers�z");
		}
			
		}else {
			System.out.println("s�fre gecers�z");
		}
		scan.close();
	
		
			
			
				
			
		
		
		
		
		

	}

}
