package day06_ifstatement;

import java.util.Scanner;

public class C3_Ifstatement {

	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen gun isminin ilk harfini yaziniz");
	        
	        char ilkHarf=scan.next().charAt(0);
	        
	        // bu satir itibariyle girilen String'in ilk karakterini almis oldum
	        
	        // p , s , c , 
	        
	        if (ilkHarf=='p' || ilkHarf=='P') {
	            System.out.println("pazar,pazartesi veya persembe");
	        }
	        
	        if (ilkHarf=='s' || ilkHarf=='S') {
	            System.out.println("sali");
	        }
	        
	        if (ilkHarf=='c' || ilkHarf=='C') {
	            System.out.println("carsamba,cuma veya cumartesi");
	        }
	        
	        if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && 
	                ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
	            System.out.println("Lutfen gecerli bir harf yaziniz");
	        }
	        
	        scan.close();

		
	}

	}


