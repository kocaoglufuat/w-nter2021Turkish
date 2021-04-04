package ornekcozumler;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

     
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen ara sýnav notunuzu gýrýnýz");
	double arasýnav=scan.nextDouble();
	
	System.out.println("lutfen fýnal sýnav notunuzu gýrýnýz");
	double fýnalsýnav=scan.nextDouble();
	
	
	System.out.println("lutfen proje notunuzu gýrýnýz");
	double proje=scan.nextDouble();
	
	double genelNot= (arasýnav*0.3)+(proje*0.2)+(fýnalsýnav*0.5);
	System.out.println("genel not ="+genelNot);
	
	
	
	}

}
