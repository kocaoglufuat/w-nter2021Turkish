package ornekcozumler;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen b�r gun �sm� g�r�n�z");
	char ilkHarf=scan.next().toUpperCase().charAt(0);
	System.out.println(ilkHarf);
	if(ilkHarf =='p' || ilkHarf == 'P') {
		System.out.println("pazar, pazartes� veya persembe");
	}
	if (ilkHarf=='s' || ilkHarf=='S') {
		System.out.println("sal�");
	}
	if (ilkHarf=='c' || ilkHarf=='C') {
	System.out.println("carsamba,cuma veya cumartes�");	
	}
	
	System.out.println("lutfen gecerl� gun g�r�n�z");
	
	
	}
	

}
