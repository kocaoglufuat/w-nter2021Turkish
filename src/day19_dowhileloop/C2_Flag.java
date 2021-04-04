package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		//kullanýcýdan býr cumle alýn,while loop kullanarak
		//cumlede buyuk harf varmý,yokmu yazdýrýn
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen býr cumle gýrýnýz");
		String cumle=scan.nextLine();
		
		String flag="Yok";
	
		int index=0;
		
		while (index<cumle.length()) {
			if (cumle.charAt(index)>'A'&& cumle.charAt(index)<='Z') {
			flag="var";
			}
			index++;
		}
		System.out.println("verdýgýnýz cumlede buyuk harf" + flag);
		

	}

}
