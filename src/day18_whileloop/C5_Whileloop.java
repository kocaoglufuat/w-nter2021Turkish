package day18_whileloop;

import java.util.Scanner;

public class C5_Whileloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolenlerý bulmak ýcýn pozýtýf býr tamsayý gýrýnýz");
		int sayý = scan.nextInt();
		int bolen=1;
		int count=0;
		
		while(bolen<=sayý) {
			if (sayý%bolen==0) {
				System.out.println(bolen);
			count++; // bolený bulunca count'u býr artýrýyorum
			}
			bolen++;
			}
		System.out.println(sayý + "sayýsýnýn bolenlerý :"+ count + "adettir");
		
		 // bolenleri su sekilde yazdirin
        // 1- 1
        // 2- 2
        // 3- 4
        // 4- 5
        // 6- 10    
        bolen=1;
        count=0;
            
            while(bolen<=sayý) {
                
                if (sayý%bolen==0) {
                    count++; // boleni bulunca count'u bir artiriyorum
                    System.out.println(count + "- " + bolen);
                    
                }
                bolen++;

		
		
            }

	}

}
