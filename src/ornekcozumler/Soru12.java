package ornekcozumler;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen gun ýsmý gýrýnýz");
	String gunIsmý=scan.nextLine();
	if (gunIsmý.equalsIgnoreCase("pazar") || gunIsmý.equalsIgnoreCase("pazartesi")) {
		System.out.println("paz");
	} else if(gunIsmý.equalsIgnoreCase("salý")){
System.out.println("sal");
	}else if(gunIsmý.equalsIgnoreCase("carsamba") ) {
		System.out.println("car");
	}else if(gunIsmý.equalsIgnoreCase("persembe")) {
		System.out.println("per");
	}else if(gunIsmý.equalsIgnoreCase("cuma")|| gunIsmý.equalsIgnoreCase("cumartesý")) {
		System.out.println("cum");
	}else if(gunIsmý.equalsIgnoreCase("pazar")) {
		System.out.println("paz");
	}else {
	
	}
	
	}

}
