package ornekcozumler;

import java.util.Scanner;

public class SORU8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen d�ktortgen�n �k� kenar uzunlugunu g�r�n�z");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		if(kenar1==kenar2) {
			System.out.println("kare");
		}
		if(kenar1!=kenar2) {
			System.out.println("kare deg�l");
		}
		if (kenar1<=0 ||kenar2>=0) {
			System.out.println("lutfen gecerl� uzunluk g�r�n�z");
		}
		
		
		
		
		

	}

}
