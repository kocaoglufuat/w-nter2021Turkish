package day07_�fElsestatement;

import java.util.Scanner;

public class C8_IfElself3 {

	public static void main(String[] args) {
		//Kullanicidan maas icin bir teklif isteyin ve asagidaki 
		//degerlere gore cevap azdirin. Teklif 80.000�in uzerinde ise �Kabul ediyorum�
		//, 60 � 80.000 arasinda ise  �Konusabiliriz�, 60.000�nin altinda ise �Maalesef 
		//Kabul edemem� yazdirin
		
	     Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen maas tekl�f�n�z� g�r�n�z");
		double maas =scan.nextDouble();
		if (maas<=80000 ||maas<=90000) {
			System.out.println("konusab�l�r�z");
		} else  {
           System.out.println("kabul edemem");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
