package ornekcozumler;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		/*
		 * Soru 4: Kullanicinin girmis oldugu 1 ile 12 arasindaki sayinin yilin hangi
		 * ayi oldugunu yazdiran Switch Case java kodunu yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen býr ýle 12 arasýnda býr sayý gýrýnýz");
		
        byte  ay = scan.nextByte();
		switch (ay) {
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("subat");
               break;		
		case 3:
		System.out.println("mart");
		break;
		case 4:
			System.out.println("nýsan");
			break;
		case 5:
			System.out.println("mayýs");
			break;
		case 6:
			System.out.println("hazýran");
			break;
		case 7:
			System.out.println("temmuz");
			break;
		
		case 8:
			System.out.println("agustos");
			break;
		case 9:
			System.out.println("eylul");
			break;
		case 10:
			System.out.println("ekým");
			break;
		case 11:
			System.out.println("kasým");
			break;
		case 12:
			System.out.println("aralýk");
			break;
		default:
			System.out.println("lutfen dogru gýrýnýz");
			break;
		}
		
		
		
	}

}
