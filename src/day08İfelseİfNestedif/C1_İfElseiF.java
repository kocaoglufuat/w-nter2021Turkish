package day08ÝfelseÝfNestedif;

import java.util.Scanner;

public class C1_ÝfElseiF {

	public static void main(String[] args) {
	
		
		
		
		//Kullanicidan gun ismini yazmasini isteyin. Girilen 
		//isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini 
		//ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		//gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
		Scanner scan = new  Scanner(System.in);
		System.out.println("lütfen gün ismi giriniz");
		String gunIsmý =scan.nextLine().toLowerCase();
		if (gunIsmý.equalsIgnoreCase("pazar")|| gunIsmý.equalsIgnoreCase("pazartesý")) {
			System.out.println("paz");
		}else  if (gunIsmý.equalsIgnoreCase("salý")) {
			System.out.println("sal");
		}else if (gunIsmý.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}else if(gunIsmý.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		}else if(gunIsmý.equalsIgnoreCase("cuma") || gunIsmý.equals("cumartesý")){
			System.out.println("Cum");
		}else {
				System.out.println("lutfen gecerlý gun ýsmý gýrýnýz");
			}
			
			// EQUALSIGNORECASE(): METHODU ÝKÝ STRÝNG' BUYUK ,KUCUK HARF 
		    //HASSASIYETI OLMADAN ESIT OLUP OLMADIGINI KONTROL EDER
			
			
			scan.close();
		}
			

		

		
		
		
		
		
		
		
		

	}


