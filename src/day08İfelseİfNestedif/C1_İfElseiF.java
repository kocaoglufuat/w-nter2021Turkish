package day08�felse�fNestedif;

import java.util.Scanner;

public class C1_�fElseiF {

	public static void main(String[] args) {
	
		
		
		
		//Kullanicidan gun ismini yazmasini isteyin. Girilen 
		//isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini 
		//ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		//gun  ismi  gecerli degilse �Gecerli gun ismi giriniz� yazdirin
		
		Scanner scan = new  Scanner(System.in);
		System.out.println("l�tfen g�n ismi giriniz");
		String gunIsm� =scan.nextLine().toLowerCase();
		if (gunIsm�.equalsIgnoreCase("pazar")|| gunIsm�.equalsIgnoreCase("pazartes�")) {
			System.out.println("paz");
		}else  if (gunIsm�.equalsIgnoreCase("sal�")) {
			System.out.println("sal");
		}else if (gunIsm�.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}else if(gunIsm�.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		}else if(gunIsm�.equalsIgnoreCase("cuma") || gunIsm�.equals("cumartes�")){
			System.out.println("Cum");
		}else {
				System.out.println("lutfen gecerl� gun �sm� g�r�n�z");
			}
			
			// EQUALSIGNORECASE(): METHODU �K� STR�NG' BUYUK ,KUCUK HARF 
		    //HASSASIYETI OLMADAN ESIT OLUP OLMADIGINI KONTROL EDER
			
			
			scan.close();
		}
			

		

		
		
		
		
		
		
		
		

	}


