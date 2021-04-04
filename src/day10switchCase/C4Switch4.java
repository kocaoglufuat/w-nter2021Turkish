package day10switchCase;

import java.util.Scanner;

public class C4Switch4 {

	public static void main(String[] args) {
		// kullanýcýdan VIP kýsaltmasýnda hangi harfin anlamýný
		// istediðini soralým
		//girilen harfin acýklamsýný yaazdýralým
        //		(very ýmportant person)
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen harf gýrýnýz");

		char harf = scan.next().charAt(0);

		switch (harf) {

		case 'v':
		case 'V':
			System.out.println("Very");
			break;
		case 'i':
		case 'Ý':
			System.out.println("Important");
			break;
		case 'p':
		case 'P':
			System.out.println("Person");
			break;
		default:
			System.out.println("gecersýz harf");

			scan.close();
	
		
			}
		}
	}
	
		
		
		
		
		
		
		
		
		
		

	


