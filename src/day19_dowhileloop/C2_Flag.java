package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		//kullan�c�dan b�r cumle al�n,while loop kullanarak
		//cumlede buyuk harf varm�,yokmu yazd�r�n
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen b�r cumle g�r�n�z");
		String cumle=scan.nextLine();
		
		String flag="Yok";
	
		int index=0;
		
		while (index<cumle.length()) {
			if (cumle.charAt(index)>'A'&& cumle.charAt(index)<='Z') {
			flag="var";
			}
			index++;
		}
		System.out.println("verd�g�n�z cumlede buyuk harf" + flag);
		

	}

}
