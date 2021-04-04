package day10switchCase;

import java.util.Scanner;

public class C1SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir rakam giriniz");
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
			System.out.println("altý");
		}else if(rakam ==7) {
			System.out.println("yedý");
	    }else if(rakam ==8) {
            System.out.println("sekýz");		
        }else if(rakam ==9) {
	        System.out.println("dokuz");
        }  else if(rakam==10) {
	        	System.out.println("on");
	       
        }else {	

        }
		
        switch(rakam) {
        case 0:
        	System.out.println("sýfýr");
        	break;
        case 1:
        	System.out.println("býr");
        	break;
        case 2:
        	System.out.println("ýký");
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
        	System.out.println("altý");
        	break;
        case 7:
        	System.out.println("yedý");
        	//break;
        case 8:
        	System.out.println("sekýz");
        	//break;
        case 9:
        	System.out.println("dokuz");
        	break;
        default:
        	System.out.println("lutfen gecerlý rakam gýrýnýz");
        	
        scan.close();
        
        } 
		
		
}
	
	
}
