package day08�felse�fNestedif;

import java.util.Scanner;

public class C3_Art�ky�l {

	public static void main(String[] args) {
		
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("lutfen y�l yaz�n�z");
		int y�l =scan.nextInt();
		if (y�l%4==0  && y�l%100 != 0) {
			System.out.println("Art�k y�l");
		} else if (y�l%4==0 && y�l %100==0 && y�l%400==0){
           System.out.println("Art�k y�l");
		}else {
			System.out.println("Art�k y�l deg�l");
		}
 		 
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
