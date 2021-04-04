package ornekcozumler;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen býr gun ýsmý gýrýnýz");
	char ilkHarf=scan.next().toUpperCase().charAt(0);
	System.out.println(ilkHarf);
	if(ilkHarf =='p' || ilkHarf == 'P') {
		System.out.println("pazar, pazartesý veya persembe");
	}
	if (ilkHarf=='s' || ilkHarf=='S') {
		System.out.println("salý");
	}
	if (ilkHarf=='c' || ilkHarf=='C') {
	System.out.println("carsamba,cuma veya cumartesý");	
	}
	
	System.out.println("lutfen gecerlý gun gýrýnýz");
	
	
	}
	

}
