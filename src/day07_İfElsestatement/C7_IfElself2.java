package day07_�fElsestatement;

import java.util.Scanner;

public class C7_IfElself2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
	//	Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif 
    //  ise sayilarin toplamini yazdirin, sayilarin ikisi de negative
	//  ise sayilarin carpimini yazdirin, sayilarin ikisi  farkli 
	//	isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin,  
	//	sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir�  yazdirin.
	System.out.println("l�tfen iki say� giriniz");
		double say�1 = scan.nextDouble();
		double say�2 = scan.nextDouble();
		if (say�1==0 || say�2 ==0) {
			System.out.println("s�f�r carpmaya gore yutan elemand�r");
		} else if(say�1>0 && say�2 >0){
           System.out.println("sayilarin toplam� : "+ (say�1+say�2));
		} else if(say�1<0 && say�2<0) {
			System.out.println("say�lar�n carp�m� :"+(say�1*say�2));
		}else {
			System.out.println("farkl� �saretlerde say�larla �slem yapamazs�n");
		}
		
		scan.close();
		
		
		
		
		
	
	}

}
