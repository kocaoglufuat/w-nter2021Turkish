package day10switchCase;

import java.util.Scanner;

public class C1SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir rakam giriniz");
		int rakam = scan.nextInt();

		if (rakam == 1) {
			System.out.println("bir");
		} else if (rakam == 2) {
			System.out.println("iki");
		} else if (rakam == 3) {
			System.out.println("uc");
		} else if (rakam == 4) {
			System.out.println("dort");
		} else if (rakam == 5) {
			System.out.println("bes");
		} else if (rakam == 6) {
			System.out.println("alt�");
		}else if(rakam ==7) {
			System.out.println("yed�");
	    }else if(rakam ==8) {
            System.out.println("sek�z");		
        }else if(rakam ==9) {
	        System.out.println("dokuz");
        }  else if(rakam==10) {
	        	System.out.println("on");
	       
        }else {	

        }
		
        switch(rakam) {
        case 0:
        	System.out.println("s�f�r");
        	break;
        case 1:
        	System.out.println("b�r");
        	break;
        case 2:
        	System.out.println("�k�");
        	break;
        case 3:
        	System.out.println("uc");
        	break;
        case 4:
        	System.out.println("dort");
        	break;
        case 5:
        	System.out.println("bes");
        	break;
        case 6:
        	System.out.println("alt�");
        	break;
        case 7:
        	System.out.println("yed�");
        	//break;
        case 8:
        	System.out.println("sek�z");
        	//break;
        case 9:
        	System.out.println("dokuz");
        	break;
        default:
        	System.out.println("lutfen gecerl� rakam g�r�n�z");
        	
        scan.close();
        
        } 
		
		
}
	
	
}
