package day08ÝfelseÝfNestedif;

import java.util.Scanner;

public class C4_Artýkyýlnestedif {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yýl yaznýz");
		int yýl = scan.nextInt();
		if (yýl%100==0) {//100 e bolunebýlýyor
			if (yýl%100==0) {
				System.out.println("artýk yýl");
			} else {
                System.out.println("artýk yýl degýl");
			}
			
			
			} else {//100 bolunemýyor

		if(yýl%4==0) {
			System.out.println("Artýk yýl");
		}else {
			System.out.println("Artýk yýl degýl");
		}
		
		
		
		scan.close();
		
		
		
		
		

	}

}
}