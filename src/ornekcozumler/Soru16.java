package ornekcozumler;

import java.util.Scanner;

public class Soru16 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * 
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * 
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin ORNEK: INPUT : techproed.com OUTPUT : “gecerli bir
		 * email girin” INPUT : techproed@gmail.com OUTPUT : “email onaylandi” INPUT :
		 * techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen maýl adresýný gýrýnýz");
		String email = scan.next();
		if (email!=("@")) {
			
		}
		if (!email.contains("@")) {
			System.out.println("girdiginiz bilgi email degýl");
		}else if(!email.contains("@gmail.com")) {
			System.out.println("lütfen gmail adresi yazýn");
		}else if(email.endsWith("@gmail.com")) {
			System.out.println("emailniz basarýyla kaydedýldý");
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
