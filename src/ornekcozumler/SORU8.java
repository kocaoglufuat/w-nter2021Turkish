package ornekcozumler;

import java.util.Scanner;

public class SORU8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dýktortgenýn ýký kenar uzunlugunu gýrýnýz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		if(kenar1==kenar2) {
			System.out.println("kare");
		}
		if(kenar1!=kenar2) {
			System.out.println("kare degýl");
		}
		if (kenar1<=0 ||kenar2>=0) {
			System.out.println("lutfen gecerlý uzunluk gýrýnýz");
		}
		
		
		
		
		

	}

}
