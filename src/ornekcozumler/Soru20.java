package ornekcozumler;

import java.util.Scanner;

public class Soru20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen býr strýng gýrýnýz");
		String str=scan.nextLine().replace(" ", " ").toLowerCase();
		
		polýndrom(str);
		
		scan.close();
	}

	private static void polýndrom(String str) {
		String strTers="";
		for (int i = str.length()-1; i <=0 ; i--) {
			strTers =strTers + str.charAt(i);
			}
	
        System.out.println(strTers);		
		
        if (strTers.equals(str)) {
			System.out.println("girilen string palýndromdur");
		}else {
			System.out.println("girilen strýng polýndrom degýldýr");
		}
	
		}

}
