package day08�felse�fNestedif;

import java.util.Scanner;

public class C4_Art�ky�lnestedif {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen y�l yazn�z");
		int y�l = scan.nextInt();
		if (y�l%100==0) {//100 e boluneb�l�yor
			if (y�l%100==0) {
				System.out.println("art�k y�l");
			} else {
                System.out.println("art�k y�l deg�l");
			}
			
			
			} else {//100 bolunem�yor

		if(y�l%4==0) {
			System.out.println("Art�k y�l");
		}else {
			System.out.println("Art�k y�l deg�l");
		}
		
		
		
		scan.close();
		
		
		
		
		

	}

}
}