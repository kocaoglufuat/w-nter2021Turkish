package day07_�fElsestatement;

import java.util.Scanner;

public class C6_IfElself1 {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen notunuzu say� olarak g�r�n�z");
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("lutfen gecerl� b�r not g�r�n�z");
		} else if (not<50){
            System.out.println("notunuz : D");
		} else if (not<60){
			System.out.println("notunuz : C");
		}else if(not<80) {
			System.out.println("notunuz : B");
		}else {
			System.out.println("notunuz : A");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
