package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		//kullan�c�dan b�r cumle ve harf �stey�n
		//while loop kullanarak cumlede �stenen harf kac kez kullan�lm�s bulunuz
        //case sens�t�ve olsun
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen b�r cumle g�r�n�z");
	String cumle=scan.nextLine();
	System.out.println("lutfen saymak �sted�g�n�z harf� g�r�n�z");
	String harf=scan.next().substring(0, 1);//String � �lk harf olarak ald�m
	
	int count=0;
	int index=0;
	while(index<cumle.length()) {
		
		if (cumle.substring(index, index+1).equals(harf)) {
			count++;
		}
	index++;
	}
	System.out.println("cumlede" +  harf  + "harf�" + count + "defa kullan�lm�s");
	
	}

}
