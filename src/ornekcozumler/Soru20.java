package ornekcozumler;

import java.util.Scanner;

public class Soru20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen b�r str�ng g�r�n�z");
		String str=scan.nextLine().replace(" ", " ").toLowerCase();
		
		pol�ndrom(str);
		
		scan.close();
	}

	private static void pol�ndrom(String str) {
		String strTers="";
		for (int i = str.length()-1; i <=0 ; i--) {
			strTers =strTers + str.charAt(i);
			}
	
        System.out.println(strTers);		
		
        if (strTers.equals(str)) {
			System.out.println("girilen string pal�ndromdur");
		}else {
			System.out.println("girilen str�ng pol�ndrom deg�ld�r");
		}
	
		}

}
