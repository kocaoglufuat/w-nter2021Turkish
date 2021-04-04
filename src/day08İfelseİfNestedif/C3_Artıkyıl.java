package day08ÝfelseÝfNestedif;

import java.util.Scanner;

public class C3_Artýkyýl {

	public static void main(String[] args) {
		
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("lutfen yýl yazýnýz");
		int yýl =scan.nextInt();
		if (yýl%4==0  && yýl%100 != 0) {
			System.out.println("Artýk yýl");
		} else if (yýl%4==0 && yýl %100==0 && yýl%400==0){
           System.out.println("Artýk yýl");
		}else {
			System.out.println("Artýk yýl degýl");
		}
 		 
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
