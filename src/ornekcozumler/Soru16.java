package ornekcozumler;

import java.util.Scanner;

public class Soru16 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa �gecerli bir email girin� yazdirin
		 * 
		 * @ isaretinden sonra sadece �gmail.com� yaziyorsa �email onaylandi� yazdirin
		 * 
		 * @ isaretinden sonra �gmail.com� disinda birsey yaziyorsa �Lutfen gmail
		 * hesabinizi girin� yazdirin ORNEK: INPUT : techproed.com OUTPUT : �gecerli bir
		 * email girin� INPUT : techproed@gmail.com OUTPUT : �email onaylandi� INPUT :
		 * techproed@hotmail.com OUTPUT : �Lutfen gmail hesabinizi girin�
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ma�l adres�n� g�r�n�z");
		String email = scan.next();
		if (email!=("@")) {
			
		}
		if (!email.contains("@")) {
			System.out.println("girdiginiz bilgi email deg�l");
		}else if(!email.contains("@gmail.com")) {
			System.out.println("l�tfen gmail adresi yaz�n");
		}else if(email.endsWith("@gmail.com")) {
			System.out.println("emailniz basar�yla kayded�ld�");
		} else {
			System.out.println("gecersiz email adresi");
	
		}
		
		
		   int toplam=0;
	        for(int i=0;i<=50;i++){
	        if(i%3!=0){
	            System.out.print(i+",");
	        toplam=toplam+i;
	        }
	                }
	        System.out.print("\n");
	        System.out.println("Toplam="+toplam);
		
	}
}
