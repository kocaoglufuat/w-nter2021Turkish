package day12_stringmanupulýtýon;

import java.util.Scanner;

public class C5_LastindexOf {

	public static void main(String[] args) {


		//kullanýcýdan býr cumle alýn
		//ve asagýdaký uc durumdan uygun olaný yazdýrýn
		//1-cumle java ýcmermýyor
		//2-cumle java býr tane java ýcerýyor
		//3-cumlede býrden fazla java var.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfe cumle gýrýnýz");
		String cumle=scan.nextLine().toLowerCase();
	
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		if (ilkJava==-1) {
			System.out.println("cumle java ýcmermýyor");
		} else if(ilkJava==sonJava){
            System.out.println("cumle býr tane java ýcerýyor");
		}else {
			System.out.println("cumle 1 den fazla java ýcerýyor");
	}
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
