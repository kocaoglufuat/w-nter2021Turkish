package ornekcozumler;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen gun �sm� g�r�n�z");
	String gunIsm�=scan.nextLine();
	if (gunIsm�.equalsIgnoreCase("pazar") || gunIsm�.equalsIgnoreCase("pazartesi")) {
		System.out.println("paz");
	} else if(gunIsm�.equalsIgnoreCase("sal�")){
System.out.println("sal");
	}else if(gunIsm�.equalsIgnoreCase("carsamba") ) {
		System.out.println("car");
	}else if(gunIsm�.equalsIgnoreCase("persembe")) {
		System.out.println("per");
	}else if(gunIsm�.equalsIgnoreCase("cuma")|| gunIsm�.equalsIgnoreCase("cumartes�")) {
		System.out.println("cum");
	}else if(gunIsm�.equalsIgnoreCase("pazar")) {
		System.out.println("paz");
	}else {
	
	}
	
	}

}
