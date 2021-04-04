package day07_ÝfElsestatement;

import java.util.Scanner;

public class C7_IfElself2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
	//	Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif 
    //  ise sayilarin toplamini yazdirin, sayilarin ikisi de negative
	//  ise sayilarin carpimini yazdirin, sayilarin ikisi  farkli 
	//	isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,  
	//	sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”  yazdirin.
	System.out.println("lütfen iki sayý giriniz");
		double sayý1 = scan.nextDouble();
		double sayý2 = scan.nextDouble();
		if (sayý1==0 || sayý2 ==0) {
			System.out.println("sýfýr carpmaya gore yutan elemandýr");
		} else if(sayý1>0 && sayý2 >0){
           System.out.println("sayilarin toplamý : "+ (sayý1+sayý2));
		} else if(sayý1<0 && sayý2<0) {
			System.out.println("sayýlarýn carpýmý :"+(sayý1*sayý2));
		}else {
			System.out.println("farklý ýsaretlerde sayýlarla ýslem yapamazsýn");
		}
		
		scan.close();
		
		
		
		
		
	
	}

}
