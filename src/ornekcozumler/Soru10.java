package ornekcozumler;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		/*
		 * Soru 4: Kullanicinin girmis oldugu 1 ile 12 arasindaki sayinin yilin hangi
		 * ayi oldugunu yazdiran Switch Case java kodunu yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen b�r �le 12 aras�nda b�r say� g�r�n�z");
		
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
			System.out.println("n�san");
			break;
		case 5:
			System.out.println("may�s");
			break;
		case 6:
			System.out.println("haz�ran");
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
			System.out.println("ek�m");
			break;
		case 11:
			System.out.println("kas�m");
			break;
		case 12:
			System.out.println("aral�k");
			break;
		default:
			System.out.println("lutfen dogru g�r�n�z");
			break;
		}
		
		
		
	}

}
