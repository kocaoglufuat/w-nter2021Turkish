package ornekcozumler;

import java.util.Scanner;

public class Soru18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen b�r string g�r�n�z");
	        
			String str= scan.nextLine().toLowerCase();
	        
	        System.out.println(icinde(str));
	        
	    }
	    public static boolean icinde(String str) {
	        
	        boolean flag =false ;
	        if (str.contains("xyz")) flag=true;
	        
	        return flag;


}
}
