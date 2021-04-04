package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		//kullanýcýdan býr cumle ve harf ýsteyýn
		//while loop kullanarak cumlede ýstenen harf kac kez kullanýlmýs bulunuz
        //case sensýtýve olsun
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen býr cumle gýrýnýz");
	String cumle=scan.nextLine();
	System.out.println("lutfen saymak ýstedýgýnýz harfý gýrýnýz");
	String harf=scan.next().substring(0, 1);//String ý ýlk harf olarak aldým
	
	int count=0;
	int index=0;
	while(index<cumle.length()) {
		
		if (cumle.substring(index, index+1).equals(harf)) {
			count++;
		}
	index++;
	}
	System.out.println("cumlede" +  harf  + "harfý" + count + "defa kullanýlmýs");
	
	}

}
