package day10switchCase;

import java.util.Scanner;

public class C4Switch4 {

	public static void main(String[] args) {
		// kullan�c�dan VIP k�saltmas�nda hangi harfin anlam�n�
		// istedi�ini soral�m
		//girilen harfin ac�klams�n� yaazd�ral�m
        //		(very �mportant person)
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen harf g�r�n�z");

		char harf = scan.next().charAt(0);

		switch (harf) {

		case 'v':
		case 'V':
			System.out.println("Very");
			break;
		case 'i':
		case '�':
			System.out.println("Important");
			break;
		case 'p':
		case 'P':
			System.out.println("Person");
			break;
		default:
			System.out.println("gecers�z harf");

			scan.close();
	
		
			}
		}
	}
	
		
		
		
		
		
		
		
		
		
		

	


