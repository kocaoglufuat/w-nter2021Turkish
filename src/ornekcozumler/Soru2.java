package ornekcozumler;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

     
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen ara s�nav notunuzu g�r�n�z");
	double aras�nav=scan.nextDouble();
	
	System.out.println("lutfen f�nal s�nav notunuzu g�r�n�z");
	double f�nals�nav=scan.nextDouble();
	
	
	System.out.println("lutfen proje notunuzu g�r�n�z");
	double proje=scan.nextDouble();
	
	double genelNot= (aras�nav*0.3)+(proje*0.2)+(f�nals�nav*0.5);
	System.out.println("genel not ="+genelNot);
	
	
	
	}

}
