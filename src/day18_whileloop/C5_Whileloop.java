package day18_whileloop;

import java.util.Scanner;

public class C5_Whileloop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolenler� bulmak �c�n poz�t�f b�r tamsay� g�r�n�z");
		int say� = scan.nextInt();
		int bolen=1;
		int count=0;
		
		while(bolen<=say�) {
			if (say�%bolen==0) {
				System.out.println(bolen);
			count++; // bolen� bulunca count'u b�r art�r�yorum
			}
			bolen++;
			}
		System.out.println(say� + "say�s�n�n bolenler� :"+ count + "adettir");
		
		 // bolenleri su sekilde yazdirin
        // 1- 1
        // 2- 2
        // 3- 4
        // 4- 5
        // 6- 10    
        bolen=1;
        count=0;
            
            while(bolen<=say�) {
                
                if (say�%bolen==0) {
                    count++; // boleni bulunca count'u bir artiriyorum
                    System.out.println(count + "- " + bolen);
                    
                }
                bolen++;

		
		
            }

	}

}
